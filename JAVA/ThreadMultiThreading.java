// normally JAVA execute code sequentially
// threads helps to execute JAVA code simultaneously
class Thread1 extends Thread{
    // in this the worker and the work in one class
    Thread1(String name) {
        super(name);
    }
    @Override
    public void run(){
        for(int i=1; i<500 ; i++){
            try {
                Thread.sleep(4000);   // this make the function to sleep for 2000 milliseconds
                System.out.println("methods in thread " + getName() + " " + getId());
            }catch (InterruptedException e) {
                System.out.println("thread is interupted");
            }
        }
    }
}

class Thread2 implements Runnable{
    // only the work defined here
    @Override
    public void run(){
        for(int i=1; i<500 ; i++){
            System.out.println("From Thread2 " + i);
        }
    }
}

class Thread3 implements Runnable{
    // only the work defined here
    @Override
    public void run(){
        for(int i=1; i<100 ; i++){
            System.out.println("From Thread3 " + i);
        }
    }
}




public class ThreadMultiThreading {
    public static void main(String[] args) {
        // Thread1 t1 = new Thread1("T1");
        Thread t2 = new Thread(new Thread2()); // separates the task from the thread
        Thread t3 = new Thread(new Thread3());
        t3.setPriority(Thread.MAX_PRIORITY);

        // t1.start();
        t2.start();
        t3.start();

        // Lambda Thread Modern JAVA
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println(i);
            }
        });

        t1.start();
    }
}
