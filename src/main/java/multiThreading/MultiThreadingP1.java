package multiThreading;

import lombok.Getter;
import lombok.Setter;

class Cup{

    @Getter
    @Setter
    private int coffee;

    public Cup(int coffee){
        this.coffee = coffee;
    }

    synchronized public void drink(){
        int localCoffee = coffee;
        localCoffee--;
        System.out.print(" Drink ");
            try {
                Thread.sleep((long)(100*Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            coffee = localCoffee;
    }

    synchronized public void pour(){
        int localCoffee = coffee;
        localCoffee++;
        System.out.print(" Pour ");
        try {
            Thread.sleep((long)(100*Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffee = localCoffee;
    }
}

class Waiter extends Thread{

    @Getter
    @Setter
    private Cup cup;

    public Waiter(Cup cup){
        this.cup = cup;
    }

    public void run(){
        for(int i =0; i<10;i++){
            cup.pour();
        }
    }
}

class Customer extends Thread{

    @Getter
    @Setter
    private Cup cup;

    public Customer(Cup cup){
        this.cup = cup;
    }

    public void run(){
        for(int i =0; i<10;i++){
            cup.drink();
        }
    }
}

public class MultiThreadingP1 {
    public static void main(String[] args) {
        Cup cup = new Cup(0);

        Waiter waiter = new Waiter(cup);
        Customer customer = new Customer(cup);

        waiter.start();
        customer.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n"+cup.getCoffee());
    }
}