package Lamda;

import java.util.List;
import java.util.Map;
/**
 * Die Klasse dient zur Kryptografie
 * */
public class Krypto {

    /**
     * chiffreDatenBank dient zur Speicherung von Chiffre
     * */
    private List<Map<Character,Character>> chiffreDatenBank;
    private Ersetzezeichen f;
    private Ersetzezeichen fReverse;
    public Krypto(Ersetzezeichen verschluesseln, Ersetzezeichen entschlusseln){
        f=verschluesseln;
        fReverse=entschlusseln;
    }

    /**
     * Die Methode verschlüsselt einen text und speichert den chiffer in der chiffreDatenBank
     * */
    public String verschlusseln(String text){



    }

    public String entschlusseln(String cheffir){

    }

}
