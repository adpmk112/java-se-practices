package multiThreading;

class Singleton{

    private static Singleton instance;

    private Singleton(){
        System.out.println("Object is Created");
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class MultiTreadingTest implements Runnable{

    @Override
    public void run() {
        try{
            Singleton.getInstance();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class MultiThreading extends Thread{
    public static void main(String[] args) {
        Thread obj1 = new Thread(new MultiTreadingTest());
        Thread obj2 = new Thread(new MultiTreadingTest());
        Thread obj3 = new Thread(new MultiTreadingTest());

        obj1.start();
        obj2.start();
        obj3.start();
    }
}
