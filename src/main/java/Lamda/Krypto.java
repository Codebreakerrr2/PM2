package Lamda;

import java.util.List;
import java.util.Map;
/**
 * Die Klasse dient zur Kryptografie
 * */
public class Krypto {

    
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
        String chiffre="";
        for(int i=0;i<text.length();i++){

            chiffre+=f.ersetzeMit(text.charAt(i));
        }
    return chiffre;

    }

    public String entschlusseln(String cheffir){
        String text="";
        
 for(int i=0;i<cheffir.length();i++){

            text+=fReverse.ersetzeMit(cheffir.charAt(i));
        }
        return text;
    }

}
