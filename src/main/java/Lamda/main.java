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

    }
}
