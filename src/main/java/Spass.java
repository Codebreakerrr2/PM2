import com.google.common.base.Preconditions;

public class Spass {


    public static void sortTheArray(int[] array) {

        Preconditions.checkNotNull(array);
        Preconditions.checkArgument(array.length < 1, "Array hat keine Zahl");

    }

    private int kleinsteZahl(int[] array) {
        int zahl = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<zahl)
                zahl=array[i];
            }
        return zahl;
        }
    private int grossteZahl(int[] array) {
        int zahl = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>zahl)
                zahl=array[i];
        }
        return zahl;
    }

}