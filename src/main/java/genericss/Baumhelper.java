package genericss;

import com.google.common.base.Preconditions;
import org.checkerframework.framework.qual.StubFiles;

public class Baumhelper {

    private static int anzahlKnoten(Knoten aktuellerKnoten){
        if (aktuellerKnoten != null) {
            int  subsumme= 1+ anzahlKnoten(aktuellerKnoten.kind1)+anzahlKnoten(aktuellerKnoten.kind2)+
                    anzahlKnoten(aktuellerKnoten.kind3);
        return subsumme;
        }

        return 0;
    }
    public static int anzahlKnoten(Baum <?> baum) {
        return anzahlKnoten(baum.knoten);
    }


    public static int tiefenSumme(Baum <?> baum){
       return tiefenSumme(baum.knoten,0);

    }
            private static int tiefenSumme(Knoten knoten,int summe){

        if(knoten!= null){
            return summe+tiefenSumme(knoten.kind1,summe+1)+tiefenSumme(knoten.kind2,summe+1)+tiefenSumme(knoten.kind3,summe+1);

        }
        return 0;





    }
    /**
     * Die Methode ist eine Hilfsmethode und sucht die Tiefe eines Knotens in einer Baumstruktur.
     *    Vorbedingung: 
     * @param knoten darf nicht null sein.
     * Rückgabe:
     * 1. beim nicht finden des Knotens in der Baumstruktur ist die Ausgabe auch -1;
     * sonst immer eine Zahl.
     * */
    private static int tiefenVon(Knoten knoten, Knoten aktuellerKnoten,int tiefe){
            Preconditions.checkNotNull(knoten,"Knoten ist null!!");
        if(aktuellerKnoten!=null){
                if(aktuellerKnoten==knoten){
                    return tiefe;
                } else {
                    int tiefeKind1= tiefenVon(knoten,aktuellerKnoten.kind1,tiefe+1);
                    int tiefeKind2= tiefenVon(knoten,aktuellerKnoten.kind2,tiefe+1);
                    int tiefeKind3= tiefenVon(knoten,aktuellerKnoten.kind3,tiefe+1);

                    return Math.max(Math.max(tiefeKind1,tiefeKind2),tiefeKind3);
                }


                
        }
return -1;


    }
    public static int tiefeVon(Knoten knoten,Baum <?> baum){
       return tiefenVon(knoten,baum.knoten,0);
    }
}




