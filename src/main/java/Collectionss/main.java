package Collectionss;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Comparator<Studierender> compareAlter= Comparator.comparing(Studierender::getAlter);
        Comparator<Studierender> compareName= Comparator.comparing(Studierender::getName);
        Studierender studi= new Studierender("asd","ads",1231,18);
        Studierender studi3= new Studierender("asd","ads",1231,19);
        Studierender studi4= new Studierender("asd","ads",1231,20);
        Studierender studi5= new Studierender("asd","ads",1231,18);
        Studierender[] array= new Studierender[]{studi,studi5,studi3,studi4};
        Arrays.sort(array,compareAlter);
        for(Studierender s:array){
            System.out.println(s);
        }

    }
}
