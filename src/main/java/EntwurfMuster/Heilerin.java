package EntwurfMuster;

public class Heilerin implements MagischerStein{
    @Override
    public void anwenden() {
        System.out.println("Heile!!");
    }

    @Override
    public void update() {
        System.out.println("Display Ausgabe");
    }
}
