package Lamda;





import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class main {
    public static void main(String[] args) {

        Ersetzezeichen identitaetAbbildung = buchstabe -> buchstabe;
        Ersetzezeichen nachfolgerAbbildung = buchstabe -> {
            int nextBuchstabe = buchstabe + 1;
            return (char) nextBuchstabe;
        };
        System.out.println(identitaetAbbildung.ersetzeMit('a'));
        System.out.println(nachfolgerAbbildung.ersetzeMit('a'));


        Ersetzezeichen f = (char buchstabe) -> {
            int changeAlphabet = buchstabe - 2;
            return (char) changeAlphabet;

        };
        Ersetzezeichen fReverse = (char buchstabe) -> {
            int changeAlphabet = buchstabe + 2;
            return (char) changeAlphabet;

        };

        Krypto krypto = new Krypto(f, fReverse);
        String text = "die Aliens sind noch da";
        String chiffre = krypto.verschlusseln(text);
        String entschlusseln = krypto.entschlusseln(chiffre);
        System.out.println(text);
        System.out.println(chiffre);
        System.out.println(entschlusseln);

        BiFunction<String, String, String> kontatenation = (eins, zwei) -> {
            return eins + zwei;
        };

        System.out.println(kontatenation.apply("qwe", "qweee"));
        UnaryOperator<Integer> betrag = zahl -> {
            return zahl < 0 ? -1 * zahl : zahl;
        };
        System.out.println(betrag.apply(1));
        var name= Arrays.asList("aasd","bddddd","caaa");
        name.replaceAll(bedingteGrossBuchstabe(s->s.length()>4));
        name.forEach(System.out::println);

    }
public static void verarbeite(List<Integer> list){
        list.forEach(zahl-> System.out.println("Zahl: "+(zahl + 7) % 3));
}
public static UnaryOperator<String> bedingteGrossBuchstabe(Predicate<String> bedingung){
    return s -> {return bedingung.test(s) ? s.toUpperCase(): s;};

}

}


