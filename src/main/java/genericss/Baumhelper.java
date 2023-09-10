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
}




