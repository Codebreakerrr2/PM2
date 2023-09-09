package genericss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnotenTest {

    @Test
    void elementEinfuegen() {
        Knoten<String> wurzelKnoten=new Knoten<>("a");;
        assertThrows(NullPointerException.class, ()-> wurzelKnoten.elementEinfuegen(null));
        wurzelKnoten.elementEinfuegen("a1");
        assertEquals(wurzelKnoten.kind1.getElement(),"a1");
        wurzelKnoten.elementEinfuegen("a2");
        assertEquals(wurzelKnoten.kind2.getElement(),"a2");
        wurzelKnoten.elementEinfuegen("a3");
        assertEquals(wurzelKnoten.kind3.getElement(),"a3");
        assertThrows(IllegalStateException.class, ()-> wurzelKnoten.elementEinfuegen("s")) ;
        wurzelKnoten.kind1.elementEinfuegen("a11");
        assertEquals(wurzelKnoten.kind1.kind1.getElement(),"a11");
        wurzelKnoten.kind1.elementEinfuegen("a12");
        wurzelKnoten.kind1.elementEinfuegen("a13");


    }
}