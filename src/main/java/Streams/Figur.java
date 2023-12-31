package Streams;



import org.json.JSONArray;
import org.json.JSONObject;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Figur implements Comparable<Figur>{

    private final String name;
    private final String spezialfaehigkeit;
    private final int lebensPunkte;
    private final int  magiePunkte;

    public Figur(String name, String spezialfaehigkeit, int lebensPunkte, int magiePunkte) {
        this.name = name;
        this.spezialfaehigkeit = spezialfaehigkeit;
        this.lebensPunkte = lebensPunkte;
        this.magiePunkte = magiePunkte;
    }

    public String getName() {
        return name;
    }

    public String getSpezialfaehigkeit() {
        return spezialfaehigkeit;
    }

    public int getLebensPunkte() {
        return lebensPunkte;
    }

    public int getMagiePunkte() {
        return magiePunkte;
    }

    @Override
    public String toString(){
        return String.format("Name: %s Spezialfähigkeit:%s \n Lebenspunkte:%d  Magiepunkte:%d",
                name,spezialfaehigkeit,lebensPunkte,magiePunkte);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figur figur = (Figur) o;
        return lebensPunkte == figur.lebensPunkte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lebensPunkte);
    }

    @Override
    public int compareTo(Figur andererFigur) {
        if(andererFigur==null) throw new IllegalArgumentException("Vergleichsobjekt darf nicht null sein");
        if(this.equals(andererFigur)) return 0;

        if(this.lebensPunkte<andererFigur.lebensPunkte) return -1;
        else return 1;

    }

    public static  void main(String[] args) {
        String alleDaten = "Picard,Earl Grey trinken,20,0;Gandalf,Balrog besiegen,40,20;Cat Woman,Schleichen,23,0;Hermine,Bücher lesen,17,15";
        String[] dataToArray=alleDaten.split(";");
        Stream<String> arrayToStream=  Arrays.stream(dataToArray);

        List<Figur> list= arrayToStream.map(str-> {
            String[] toFigureArray = str.split(",");
            return new Figur(toFigureArray[0], toFigureArray[1], Integer.parseInt(toFigureArray[2]), Integer.parseInt(toFigureArray[3]));})
                .filter(f->f.magiePunkte!=0).
                sorted().
                collect(Collectors.toList());

        List<JSONObject> jsonListe= list.stream().map(f-> {
            JSONObject figureInJson = new JSONObject();
            figureInJson.put(f.name, f);
            return figureInJson;
        })
                    .collect(Collectors.toList());
        JSONArray jsonArray= new JSONArray();
        jsonListe.forEach(jsonObjekt->jsonArray.put(jsonObjekt));
        JSONObject wurzel= new JSONObject();
        wurzel.put("Figuren",jsonArray);
        System.out.println(wurzel);
        String name="UbungJson.json";
        try(FileWriter writer= new FileWriter(new File(name))){
            wurzel.write(writer);
            System.out.println(name);

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Fehler beim schreiben in die Datei");
        }
    }
}
