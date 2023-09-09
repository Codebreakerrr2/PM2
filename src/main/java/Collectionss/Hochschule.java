package Collectionss;

import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Die Klasse stellt eine Hochschuldatenbank dar.
 * */
public class Hochschule {
    /**
     * in der Variable list werden Studis gespeichert.
     * */
    List<Studierender> studiList = new LinkedList<>();

    /**
     *SxP steht für Studi x Prüfungsleistung Relationmenge.
     * */
    Map<Integer,List<Pruefungsleistung>> SxPMenge= new HashMap<>();

    /**
     * Die Methode nimmt einen Studi in der Hochschule auf.
     * Vorbedingungen:
     * die parameter Name und Nachname dürfen nicht null sein.
     * Es dürfen nicht mehr als 100 Studi in der Hochschule eingeschrieben sein.
     * @throws IllegalStateException im Falle einer Überschreitung der 100 Studi Kapazität.
     * */
    public Studierender studierendenErzeugen(String name,String vorname){
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(vorname);
        if(studiList.size()<=100) {
            int matrikelNummer= (int)(Math.random()*100);
            if(studiList.size()==0){
                Studierender neueStudi=new Studierender(name,vorname,matrikelNummer);
                studiList.add(neueStudi);
                return neueStudi;
            }else{
                boolean matrikelNichtDrin= true;
       for(Studierender studi: studiList) {
       matrikelNichtDrin= matrikelNichtDrin && studi.getMartikelNummer()!= matrikelNummer;}
       if(matrikelNichtDrin){
           Studierender neueStudi=new Studierender(name,vorname,matrikelNummer);
           studiList.add(neueStudi);
           return neueStudi;

       }
       else{
           studierendenErzeugen(name,vorname);
       }
       }
            }

        throw  new IllegalStateException("Hochschule hat seine Kapazität erreicht");


    }

    /**
     *Die Methode trägt die Prüfungsleisten eines Studis in die Datenbank(Map) ein.
     * Vorbedingung:
     * Note muss zwischen 0 und 6 sein
     * studi darf nicht null sein und modul ebenfalls nicht
     * studi muss in der Hochschule immatrikuliert sein.
     * @throws IllegalArgumentException im Falle von null bei modul, Studi oder bei ungültiger Note.
     * */
    public void pruefungsleistungEintragen(Studierender studi, String modul, int note){
        Preconditions.checkArgument(studiList.contains(studi),"Studi muss an der Hochschule immatrikuliert sein!");
        Preconditions.checkNotNull(modul,"Modul darf nicht null sein");
        Preconditions.checkNotNull(studi,"Studi darf nicht null sein");
        Preconditions.checkArgument(note>-1 && note< 7,"Note muss im Interval [0,6] liegen");
        if(SxPMenge.containsKey(studi.getMartikelNummer())){
            SxPMenge.get(studi.getMartikelNummer()).add(new Pruefungsleistung(modul,note));
        }
        else{
            SxPMenge.put(studi.getMartikelNummer(),new LinkedList<>());
            SxPMenge.get(studi.getMartikelNummer()).add(new Pruefungsleistung(modul,note));

        }

    }
    @Override
    public  String toString(){
        String ergebnis="";
        if(!studiList.isEmpty()){
        for(Studierender studi: studiList){
            ergebnis += String.format("%s  %s  (%d)\n", studi.getName(), studi.getNachname(), studi.getMartikelNummer());
            if(SxPMenge.containsKey(studi.getMartikelNummer())){
                for(Pruefungsleistung leistung: SxPMenge.get(studi.getMartikelNummer())){
                    ergebnis+=String.format("\t %s : %d\n",leistung.getName(),leistung.getNote()) ;
                }
                }
            }

        }
        return ergebnis;
    }
    }

