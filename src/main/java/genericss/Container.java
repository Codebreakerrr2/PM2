package genericss;

public class Container <T>{
        T element;
        public  Container(T element){

        }

    public static void main(String[] args) {
        Container <String> container = new Container<>("asd");
    }
}

