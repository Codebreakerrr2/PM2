package Collectionss;

import genericss.Person;
import org.checkerframework.checker.units.qual.N;

import java.util.*;

public class Mapping {


    public static void putListsInMap(Map<String,List<Person>> map, List<Person> list3){
        List<String> listofKeysNames= new LinkedList<>();
        List<Person> list= new LinkedList<>(list3);
        for(int i=0;i<=list.size();i++){
            if(!list.isEmpty()){
                List<Person> list1= new LinkedList<>();
                list1.add(list.get(0));
                list.remove(0);
                Iterator<Person> it= list.iterator();
                while(it.hasNext()){
                    Person person= it.next();
                    if (person.equals(list1.get(0))) {
                        list1.add(person);
                        it.remove();
                    }
                }
                String key=KeyGenerator.randomKey();
                map.put(key,list1);
                String ergebnis= key+"-->"+list1.get(0).toString();
                listofKeysNames.add(ergebnis);


            }



        }for(String str: listofKeysNames){
            System.out.println(str);
        }

    }
}
