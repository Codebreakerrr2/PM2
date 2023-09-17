package genericss;

import com.google.common.base.Preconditions;

public class Kiste <T>{

    T element;
    public Kiste(T element){
        this.element= element;
    }
    public T getInhalt(){
        return element;
    }
    public void print(){
        System.out.println(element);
    }
    public char getViertesZeichen(String text){
        Preconditions.checkNotNull(text,"text ist null!!");
        Preconditions.checkState(text.length()>=4,"Text hat weniger als 4 Zeichen!");
        return text.charAt(4);
    }


}
