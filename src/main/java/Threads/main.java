package Threads;

public class main {
    public static void main(String[] args) {
        Thread thread= new Thread(()-> {for(int i=0;true;i++) {System.out.println("Neben Thread:"+Thread.currentThread());
            System.out.println("tue: "+i);
            System.out.println("geht in sleep für 2 sek");
            System.out.println(" state of neben Thread:"+Thread.currentThread().getState());
            System.out.println(" alive state of neben Thread:"+Thread.currentThread().isAlive());
            System.out.println("  Interrupted state of neben Thread:"+Thread.currentThread().isInterrupted());
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("wurde gebrochen");
                break;
            }


        }
        });
        System.out.println("vor Start:");
        System.out.println("state of neben Thread:"+thread.getState());
        System.out.println("alive state of neben Thread:"+thread.isAlive());
        System.out.println("Interrupted state of neben Thread:"+thread.isInterrupted());
        System.out.println("Aktuller Thread:"+Thread.currentThread());
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("wurde gebrochen");
        }
        thread.start();
       thread.interrupt();


Timer timer= new Timer();
timer.schedule(()-> System.out.println(1),2000,1000);
try{
    Thread.sleep(10000);
}
catch(InterruptedException e){
    System.out.println("nix");
}
timer.cancel();
timer.schedule(()-> System.out.println(2),2000,1000);

    }

}
