package genericss;

import com.google.common.base.Preconditions;
import org.checkerframework.checker.units.qual.K;

import java.util.Objects;

/**
 * Die Klasse stellt einen Knoten dar, der eventuell in einer Baumhierarchie sitzt.
 * Der Knoten hat 3 Kindknoten.
 */
public class Knoten<T> {

   private final T element;
    protected  Knoten kind1;
    protected Knoten kind2;
    protected Knoten kind3;

    /**
     * Der Konstruktor erfordert unbedingt eine Belegung des Knotens mit einem Element.
     */
    public Knoten(T element) {
        this.element = element;
    }

    /**
     * Die Methode hängt ein Element an den Kindknoten an.
     * Vorbedingung:
     *
     * @param element ist vom Typ T, element darf nicht null sein.
     *                Nachbedingung:
     * @throws IllegalStateException falls alle Kinderknoten belegt sind.
     */
    public void elementEinfuegen(T element) {
        Preconditions.checkNotNull(element, "das Argument darf nicht null sein");
        Preconditions.checkState(this.kind1 == null || this.kind2 == null || this.kind3 == null,
                "Fehlgeschlagen! mind. einer der Kindknoten muss frei bzw. nicht belegt sein");
        if (kind1 == null) {
            kind1 = new Knoten(element);
        } else if (kind2 == null) {
            kind2 = new Knoten(element);
        } else {
            kind3 = new Knoten(element);
        }

    }



    public T getElement() {
        return element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knoten<?> knoten = (Knoten<?>) o;
        return Objects.equals(element, knoten.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }
}
