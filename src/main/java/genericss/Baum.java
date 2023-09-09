package genericss;

/**
 * Die Klasse Baum stellt eine Baumstruktur dar, die Typvariable wird dem von Wurzelknoten entsprechen.
 * */
public class Baum <T>{

    protected Knoten knoten;
/**
 * Der Konstruktor bekommt einen Knoten dabei ist es wichtig, dass der Knoten die selbe Typvariable hat wie der Baum.
 *
 * */
    public Baum(Knoten<T> knoten) {

        this.knoten = knoten;
    }

    /**
     * Die Methode gibt an, ob sich ein Element im Baum befindet.
     * */

    public boolean hatElement(T element) {
        return hatElement(element,knoten);

        }

        private boolean hatElement(T element, Knoten aktuellerKnoten){
        if(aktuellerKnoten!=null){
            if(aktuellerKnoten.getElement()==element) return true;
            return hatElement(element,aktuellerKnoten.kind1) ||
                    hatElement(element,aktuellerKnoten.kind2)||
                    hatElement(element,aktuellerKnoten.kind3);

        }
    return false;
    }

    }

