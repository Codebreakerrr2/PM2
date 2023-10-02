package Entwufmuster;

public class MagischersteinBenutzer extends Beobachteter {
    private MagischerStein stein;
    public MagischersteinBenutzer(MagischerStein stein){
        this.stein=stein;
    }
    public void magieAnweden(){
        stein.anwenden();

    }

}
