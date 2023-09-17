package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        Ersetzezeichen identitaetAbbildung= buchstabe -> buchstabe;
        Ersetzezeichen nachfolgerAbbildung= buchstabe-> {int nextBuchstabe=buchstabe+1; return (char) nextBuchstabe;};
        System.out.println(identitaetAbbildung.erzetzeMit('a'));
        System.out.println(nachfolgerAbbildung.erzetzeMit('a'));


Ersetzezeichen f=(Character buchstabe)-> {
int changeAlphabet= buchstabe/2;
  return  (char) changeAlphabet;
    
};
        Ersetzezeichen fReverse=(Character buchstabe)-> {
    int changeAlphabet= buchstabe*2;
            return (char) changeAlphabet;
            
        };
        
        Krypto krypto=new Krypto(f,fReverse);
        String text="die Aliens sind noch da";
        String chiffre=krypto.verschlusseln(text);
        String entschlusseln= krypto.entschlusseln(chiffre);
        

    }
}
