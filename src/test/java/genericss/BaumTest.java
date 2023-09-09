package genericss;

import org.junit.jupiter.api.Test;

import static genericss.Baumhelper.anzahlKnoten;
import static org.junit.jupiter.api.Assertions.*;

class BaumTest {

    @Test
    void hatElement() {
        Knoten<String> wurzelKnoten=new Knoten<>("a");
        wurzelKnoten.elementEinfuegen("a1");
        wurzelKnoten.elementEinfuegen("a2");
        wurzelKnoten.elementEinfuegen("a3");
        wurzelKnoten.kind1.elementEinfuegen("a12");
        wurzelKnoten.kind1.elementEinfuegen("a13");
        Baum<String> baum= new Baum<>(wurzelKnoten);// FRAGE: Der Baum kann jede Art von Knoten bekommen, wie schränke ich das
        // auf nur Typ T ein? Antwort: man kann doch einfach den Konstruktor mit einem Knoten der Variable T aus dem Baum
        // festlegen.
        assertEquals(true,baum.hatElement("a12"));
        assertEquals(false,baum.hatElement("a122"));
        assertEquals(6,anzahlKnoten(baum));

    }
}