package genericss;

import Collectionss.Mapping;

import java.util.*;

public class main {
    public static void main(String[] args) {
           var list= new LinkedList<String>();
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




}}
