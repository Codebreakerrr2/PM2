package genericss;

public class Tupel{
    Knoten objekt;
    int kennung;

    public Tupel(Knoten objekt, int kennung) {
        this.objekt = objekt;
        this.kennung = kennung;
    }

    public int getKennung() {
        return kennung;
    }

    public void setKennung(int kennung) {
        this.kennung = kennung;
    }
}
