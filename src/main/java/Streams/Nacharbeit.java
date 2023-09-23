package Streams;

import java.util.function.Function;
import java.util.stream.Stream;

public class Nacharbeit {

    public static void main(String[] args) {
       Stream.iterate('a',(buchstabee)-> {
            return (char)(buchstabee+1);
        }).limit('z'-'a'+1).forEach(System.out::println);


    }
}
