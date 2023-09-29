package Synchronisation;



import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ETransporter {
    private Thread thread;
    private boolean threadKontroller=true;
    private Lagerhaus lagerhaus;
    private Supplier<String> IDgenerator;
    /**
     * DefaultGenerator ist der Default ID Generator, der ID erstellt aus 10 Buchstaben und 5 zahlen aneinander angehängt.
     * */
    private Supplier<String> defaultIDGenerator=()-> {
        Random rand = new Random();

        String stringBuchstaben= Stream.iterate((char) rand.nextInt('a', 'z' + 1), (buchstabe) -> (char) rand.nextInt('a', 'z' + 1)
        )
                .limit(10).map(Object::toString).
                reduce("",(c,e)->c+e);
       String zahlen= Stream.iterate(rand.nextInt(0,11), zahl->rand.nextInt(0,11)).
               limit(5).
               map(String::valueOf).
               reduce("",(c,e)->c+e);
return stringBuchstaben+zahlen;
    };


    public ETransporter(Lagerhaus lagerhaus,Supplier<String> IDgenerator){
        this.lagerhaus=lagerhaus;
        this.IDgenerator=IDgenerator;
    }


    public ETransporter(Lagerhaus lagerhaus){
        this.lagerhaus=lagerhaus;
        this.IDgenerator=defaultIDGenerator;
    }



    public void setLagerhaus(Lagerhaus lagerhaus){
        this.lagerhaus=lagerhaus;
    }

/**
 * Die Methode liefert einen Thread der im Lagerhaus Kisten liefert.
 * */
    public Thread anliefern(){
        Runnable task= ()-> {
        while(threadKontroller){
            String id=IDgenerator.get();
            lagerhaus.kisteAnliefern(id);
        }
            System.err.println("ETransporter ist aus");

        };
         thread= new Thread(task);
        return thread;
    }
    /**
     * Die Methode liefert einen Thread der die Kisten aus dem Lagerhaus holt.
     * */
    public Thread kisteAbholen(){
        Runnable task= ()-> {
            while(threadKontroller){
              lagerhaus.kisteAbholen();

            }
            System.err.println("ETransporter ist aus");
        };
         thread= new Thread(task);
        return thread;
    }
    public void transporterOn(){
        threadKontroller=true;
    }
    public void transporterOff(){
        threadKontroller=false;
    }
}
