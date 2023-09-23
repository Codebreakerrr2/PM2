package Streams;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nacharbeit {

    public static void main(String[] args) {
       Stream.iterate('a',(buchstabee)-> {
            return (char)(buchstabee+1);
        }).limit('z'-'a'+1).forEach(System.out::println);
        Function<String,Character> erstesZeichenExtrahieren= text-> text.charAt(0);
        List<Integer> zahlen= Stream.of(1,2,3,4,5,6,7,8,9)
                .filter(n->n%3==0).collect(Collectors.toList());
        zahlen.forEach(System.out::println);
        List<Integer> zahlenn= Arrays.asList(1222,2,3,4,5,6,7,8,9);
        List<String> zahlToString= zahlenn.stream().map(String::valueOf).toList();
        zahlToString.forEach(System.out::println);



try(Scanner scan  = new Scanner(System.in)){

    int zahl=scan.nextInt();
    System.out.println(zahl);
}catch(InputMismatchException e){
    System.out.println("nicht gute formatn "+e);
}

    }
}
