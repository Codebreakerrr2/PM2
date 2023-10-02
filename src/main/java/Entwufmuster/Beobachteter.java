package Entwufmuster;

import java.util.HashSet;
import java.util.Set;

public abstract class  Beobachteter {
    private Set<Beobachter> beobachter=new HashSet<>();


    public void hinzuFugen(Beobachter beobachter) {
        this.beobachter.add(beobachter);
    }
    public void entfernen(Beobachter beobachter) {
        this.beobachter.remove(beobachter);
    }
    public  void bescheidGeben(String str){
        beobachter.forEach(beobachter->beobachter.printAufDisplay());
    }

}
