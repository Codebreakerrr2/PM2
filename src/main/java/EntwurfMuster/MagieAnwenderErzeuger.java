package EntwurfMuster;

public class MagieAnwenderErzeuger {

    public static MagischerStein getBenutzer(String str){
        if(str.equals("Heilerin")) return new Heilerin();
        if(str.equals("Magier")) return new Magier();
        else throw  new IllegalArgumentException("falsche eingabe");
    }
}
