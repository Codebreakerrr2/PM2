package EntwurfMuster;

import java.util.HashSet;
import java.util.Set;

public class Beobachteter {

    Set<Beobachter> set = new HashSet<>();

    public void hinzufuegen(Beobachter beobachter){
        set.add(beobachter);
    }
    public void entfernen(Beobachter beobachter){
        set.remove(beobachter);
    }
    public void melden(){
        set.forEach(Beobachter::update);
    }
}
