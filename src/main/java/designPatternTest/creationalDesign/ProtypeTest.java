package designPatternTest.creationalDesign;

public class ProtypeTest {
    public static void main(String[] args) {
        Ball player = new Ball();
        player.setSize(3);
        player.setColor("Blue");

        System.out.println("Player1 --> "+player.getColor());

        Ball player2 = player.copy();
        player2.setSize(3);
        player2.setColor("Pink");

        System.out.println("Player2 --> "+player2.getColor());
    }
}

interface Bunshin extends Cloneable{
    Ball copy();
}

class Ball implements Bunshin{
    static int size;
    static String color;

    public static void setSize(int size){
        Ball.size = size;
    }

    public static int getSize(){
        return size;
    }

    public static void setColor(String color){
        Ball.color = color;
    }

    public static String getColor(){
        return color;
    }

    @Override
    public Ball copy() {
        try {
            Bunshin bunshin = (Bunshin)super.clone();
            Ball newBall = (Ball) bunshin;
            return newBall;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
