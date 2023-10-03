package EntwurfMuster;

public class Fantasy extends Beobachteter {

    MagischerStein stein;
    public void aendereMagischenSteinMit(MagischerStein stein){
        this.stein= stein;
    }

    public void SteinAnwenden() {
        stein.anwenden();
        this.hinzufuegen(stein);
        this.melden();
    }

}
