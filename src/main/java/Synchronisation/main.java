package Synchronisation;

import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) {
        Lagerhaus lagerhaus=new Lagerhaus(5);
        ETransporter eTransporter1= new ETransporter(lagerhaus);
        ETransporter eTransporter2= new ETransporter(lagerhaus);
        ETransporter eTransporter3= new ETransporter(lagerhaus);
        ETransporter eTransporter4= new ETransporter(lagerhaus);
        ETransporter eTransporter5= new ETransporter(lagerhaus);
        eTransporter1.anliefern().start();
        eTransporter2.anliefern().start();
        eTransporter3.anliefern().start();
        eTransporter4.kisteAbholen().start();
        eTransporter5.kisteAbholen().start();
        try {
            Thread.sleep(5000);

        }catch (InterruptedException e){
            System.out.println("interupted mach nix");
        }
        eTransporter1.transporterOff();
        eTransporter2.transporterOff();
        eTransporter3.transporterOff();
        eTransporter4.transporterOff();
        eTransporter5.transporterOff();
        try {
            Thread.sleep(6000);

        }catch (InterruptedException e){
            System.out.println("interrupted mach nix");
        }

        eTransporter1.transporterOn();
        eTransporter2.transporterOn();
        eTransporter3.transporterOn();
        eTransporter4.transporterOn();
        eTransporter5.transporterOn();


    }
}
