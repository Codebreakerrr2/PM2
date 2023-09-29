package Synchronisation;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lagerhaus {
/**
 * platzImLager stellt eine struktur für Anzahl der Plätze im Lager dar.
 * */
    private List<String> platzImLager;
    private int anzahlPlatze;
/**
 *
 * */
    public Lagerhaus(int anzahlPlaetze){
        this.platzImLager= new ArrayList<>();
        this.anzahlPlatze=anzahlPlaetze;
    }
    /**
     *Die Methode lagert eine Kiste im lager ab.
     * Kisten ID darf nicht null sein. sonst @throws Exception
     * Ist der Lager voll wartet der Thread in der Schlange bis Platz im Lager frei wird.
     * Das Lagern nimmt 0-500 Millisekunden im Anspruch.
     * */
public synchronized void kisteAnliefern(String kistenID){
    Preconditions.checkNotNull(kistenID,"KistenID darf nicht null sein");
        if(!hatPlatzFrei()){
           try{
            this.wait();
               System.err.println("Ging In Warte Schleife Thread in Anliferung: "+Thread.currentThread().getName());
        }   catch (InterruptedException e){
               Thread.currentThread().interrupt();
           }
        }
        else{
            platzImLager.add(kistenID);
            System.err.println("Kiste mit ID: "+kistenID+" wurde gelagert mit Thread: "+Thread.currentThread().getName());
            Random rand= new Random();

            try{
               Thread.sleep(rand.nextInt(0,501));
            }   catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            this.notifyAll();
            System.err.println("Alle wurden geweckt! für Anlieferung");
        }


        }
        /**
         * Die Methode entfernt eine Kiste aus dem Lager.
         * Falls der Lager leer ist wartet der Thread in Warteschlange bis sich eine Kiste im Lager befindet.
         * @return KistenID wird zurückgegeben.
         * Return am Ende der Code wird nie erreicht.
         * */
        public synchronized String kisteAbholen(){
                if(platzImLager.isEmpty()){
                    try{
                        this.wait();
                        System.err.println("Ging In Warte Schleife Thread beim Abholen: "+Thread.currentThread().getName());
                    }   catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                else {
                    String kiste= platzImLager.get(0);
                    System.err.println("Kiste: "+platzImLager.get(0)+" wurde entfernt mit Thread: "+Thread.currentThread().getName());
                    platzImLager.remove(0);
                    Random rand= new Random();

                    try{
                        Thread.sleep(rand.nextInt(0,501));
                    }   catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                    this.notifyAll();
                    System.err.println("Alle wurden geweckt! für Abholung");
                    return kiste;
                }
                return "Code erreicht das nie!";
        }
    /**
     *Interne Hilfsmethode um zu überprüfen, ob im Lager Platz frei ist.
     * */
    private boolean hatPlatzFrei(){
        return platzImLager.size() < anzahlPlatze;
    }
}
