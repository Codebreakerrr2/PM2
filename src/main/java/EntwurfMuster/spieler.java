package EntwurfMuster;

public class spieler {
    public static void main(String[] args) {
            oldGame game= new oldGame();
            game.aendereMagischenSteinMit(MagieAnwenderErzeuger.getBenutzer("Heilerin"));
            game.SteinAnwenden();

            Fantasy game2= new Fantasy();
            game2.aendereMagischenSteinMit(MagieAnwenderErzeuger.getBenutzer("Magier"));
            game2.SteinAnwenden();
    }
}
