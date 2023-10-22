package genericss;

import Collectionss.Mapping;
import org.checkerframework.checker.units.qual.K;

import java.util.*;

public class main {
    public static void main(String[] args) {
           /*var list= new LinkedList<String>();
            Collections.addAll(list, "asd","asdasd","asddd");


            for(String eintrag: list){
                System.out.println(eintrag);
            }

            Set<Integer> menge= new HashSet<>();
            Collections.addAll(menge,32,42,32,42,0);
            for(Iterator<Integer> it= menge.iterator();it.hasNext();){
                Integer zahl= it.next();
                System.out.println(zahl);
            }
        List<Person> personen = Arrays.asList(
                new Person("Mike", "Hansen"), new Person("a", "Lovelace"),
                new Person("a", "Green"), new Person("Mike", "Myers"));


            Map<String,List<Person>> map= new HashMap<>();
            Mapping.putListsInMap(map,personen);
*/
Knoten<String> wurzel= new Knoten<>("Hamburg");
wurzel.elementEinfuegen("Berlin");
        wurzel.elementEinfuegen("Hannover");
        wurzel.elementEinfuegen("Frankfurt");
        wurzel.kind3.elementEinfuegen("Hannover");
        wurzel.kind1.elementEinfuegen("leipzig");
        wurzel.kind2.elementEinfuegen("Marburg");
        wurzel.kind2.elementEinfuegen("Freiburg");

Baum<String> DEVerkehrsnetz= new Baum<>(wurzel);
        System.out.println( Baumhelper.kurzesterWeg(DEVerkehrsnetz,wurzel.kind1));

    }
}
