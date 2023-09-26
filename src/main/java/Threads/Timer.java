package Threads;

public class Timer  {

    /**
     * Variable dient zur Kontrollierung des Threads
     * */
    private Thread thread;
/**
 * Die Methode bekommt eine Aufgabe und führt sie nach einer Verzögerung "delay" und dann wiederholt im intervall von "intervall"
 * hat man schon einmal schedule benutzt, dann kann man sie mit dem selben Objekt nicht wiederholt aufrufen.
 * */
   public void schedule(TimerAufgabe task,int delay,int intervall) {
       if (thread == null) {
           thread = new Thread(() -> {
               while (!thread.isInterrupted()) {
                   try {

                       Thread.sleep(delay);
                   } catch (InterruptedException e) {
                       System.out.println("wurde gebrochen");
                       break;
                   }
                   task.run();
                   try {
                       Thread.sleep(intervall);
                   } catch (InterruptedException e) {
                       System.out.println("wurde gebrochen");
                       break;
                   }
               }

           });
           thread.start();
       } else System.out.println("Thread schon benutzt");

   }


/**
 * die Methode stoppt den schedule Methode
 * */

    public void cancel(){
        thread.interrupt();


   }

}
