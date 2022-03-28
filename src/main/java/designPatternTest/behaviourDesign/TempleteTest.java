package designPatternTest.behaviourDesign;

public class TempleteTest {
    public static void main(String[] args) {
        GameFlow flow = new WildRift();
        flow.run();
    }
}

abstract class GameFlow{

    private void startingLogo(){
        System.out.println("Showing company logo.");
    }

    private void login(){
        System.out.println("Login.");
    }

    abstract void gameStart();

    protected void run(){
        this.startingLogo();
        this.login();
        this.gameStart();
    }
}

class WildRift extends GameFlow{

    @Override
    void gameStart() {
        System.out.println("WildRift starts.");
    }
}

class RocketLeague extends GameFlow{

    @Override
    void gameStart() {
        System.out.println("RocketLeague starts.");
    }
}
