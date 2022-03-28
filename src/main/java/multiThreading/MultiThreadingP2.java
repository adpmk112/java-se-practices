package multiThreading;

public class MultiThreadingP2 {

    public static void main(String[] args) {
        Processor processor = new Processor();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}

class Processor{

    public void producer() throws InterruptedException{
        synchronized (this){
            System.out.println("Producer is running");
            wait();
        }
    }

    public void consumer() throws InterruptedException{
       Thread.sleep(2000);
        synchronized (this){
            System.out.println("Consumer is running");
            notify();
            notifyAll();
        }
    }
}
