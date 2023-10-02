package Entwufmuster;

public class Heilerin implements Beobachter {
    public Heilerin(Beobachteter beobachteter) {
       beobachteter.hinzuFugen(this);
    }

    @Override
    public void printAufDisplay() {
        System.out.println("Heile!!");
    }




}



