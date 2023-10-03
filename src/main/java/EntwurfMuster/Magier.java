package EntwurfMuster;

public class Magier implements MagischerStein{
    @Override
    public void anwenden() {
        System.out.println("Zauber xy!");
    }
    @Override
    public void update() {
        System.out.println("Display Ausgabe");
    }
}
