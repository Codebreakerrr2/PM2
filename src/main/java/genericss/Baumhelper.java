package genericss;

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
}

