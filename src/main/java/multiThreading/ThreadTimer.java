package multiThreading;

public class ThreadTimer extends Thread {

    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("Hey");
                    Thread.sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    System.out.println("Hello");
                }
            }
        });
        timer.start();
    }
}
