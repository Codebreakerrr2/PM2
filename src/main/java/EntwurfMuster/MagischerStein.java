package EntwurfMuster;

public interface MagischerStein extends Beobachter {
    void anwenden();

    @Override
     void update();
}