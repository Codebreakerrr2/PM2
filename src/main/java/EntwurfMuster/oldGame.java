package EntwurfMuster;

public class oldGame {
    MagischerStein stein;
    public void aendereMagischenSteinMit(MagischerStein stein){
        this.stein= stein;
    }

    public void SteinAnwenden() {
        stein.anwenden();
    }
}
