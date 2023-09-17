package Collectionss;

public class KeyGenerator {
    public static String randomKey(){
        int zahl= (int) (Math.random()*1000);
        String wort="";

        for(int i=0;i<5;i++){
            wort+=(char)((int) (Math.random()*100)+30);
        }
        return String.valueOf(wort+zahl);

    }

}
