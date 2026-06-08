import java.util.*;

// Race Condition (two threads update same variable)
// synchronized provides
// -> atomicity (nobody can interrupt you in the middle of an operation)
// -> mutual exclusion (only one thread can enter the critical section at a time)
// -> visibility (can other thread see updated value)
// volatile keyword provides
// --> visibility

 class Counter{
    private int count = 0; // instance variable have no THREAD safety
    private volatile boolean running = true; // tells the JVM that a variable value may be modified by multiple threads
     // prefer using local variable
    public void increment() {
        count++;
    }
    // synchronized Method
     public  void incrementSync(){
        // only one thread enters increment at a time
         // sync block we can use this instead of sync whole method
         synchronized (this){
             count++;
         }
     }
     public synchronized void display() {
         System.out.println("Current value of counter " + count);
     }
     public boolean isRunning(){
        // this read method dont need sync because the variable is volatile
         return running;
     }

     public void stop(){
        running = false;
     }
}

class task implements Runnable {
    Counter ct;
    task(Counter ct){
        this.ct = ct;
    }
    @Override
    public void run(){
        while(ct.isRunning()){
            ct.display();
            // ct.increment(); // Causes race condition both thread have diff value of same addr
            ct.incrementSync();
        }
        System.out.println("THREAD stopped");
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Counter ct = new Counter();
        Thread t1 = new Thread(new task(ct));
        Thread t2 = new Thread(new task(ct));

        t1.start();
        t2.start();
        try{
            Thread.sleep(100);
        }catch(InterruptedException i){
            System.out.println("Sleeping");
        }
        ct.stop();   // changes volatile variable
    }
}
