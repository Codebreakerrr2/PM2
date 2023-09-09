package Collectionss;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class HochschuleTest {





    @Test
    void studierendenErzeugen() {
        Hochschule haw= new Hochschule();
        haw.studierendenErzeugen("Amini","Usman");
        haw.studierendenErzeugen("Sonntag","Lea");
        haw.studierendenErzeugen("btq","Gay");


    assertFalse(haw.studiList.get(0).getMartikelNummer()==haw.studiList.get(1).getMartikelNummer());
        assertFalse( haw.studiList.get(1).getMartikelNummer()==haw.studiList.get(2).getMartikelNummer());
        assertFalse( haw.studiList.get(0).getMartikelNummer()==haw.studiList.get(2).getMartikelNummer());

        }





    @Test
    void pruefungsleistungEintragen() {
        Hochschule haw= new Hochschule();
        haw.studierendenErzeugen("Amini","Usman");
        haw.studierendenErzeugen("Sonntag","Lea");
        haw.studierendenErzeugen("btq","Gay");
        haw.pruefungsleistungEintragen(haw.studiList.get(0),"LB",1);
        assertTrue(haw.SxPMenge.containsKey(haw.studiList.get(0).getMartikelNummer()));

        haw.pruefungsleistungEintragen(haw.studiList.get(0),"PM2",1);


    }

    @Test
    void testToString() {
        Hochschule haw= new Hochschule();
        haw.studierendenErzeugen("Amini","Usman");
        haw.studierendenErzeugen("Sonntag","Lea");
        haw.studierendenErzeugen("btq","Gay");
        haw.pruefungsleistungEintragen(haw.studiList.get(0),"LB",1);

        haw.pruefungsleistungEintragen(haw.studiList.get(0),"PM2",1);
        System.out.println(haw);

    }
}