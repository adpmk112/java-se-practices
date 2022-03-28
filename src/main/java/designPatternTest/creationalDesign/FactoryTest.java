package designPatternTest.creationalDesign;

public class FactoryTest {
    public static void main(String[] args) {
        SamsungFactory samsungFactory = new S10Factory();
        samsungFactory.getSamsung().splitScreen();

        SamsungFactory samsungFactory2 = new ZflipFactory();
        samsungFactory2.getSamsung().splitScreen();
    }
}

abstract class Samsung{
    abstract void splitScreen();
}

class S10 extends Samsung{

    @Override
    void splitScreen() {
        System.out.println("MultiTasking in S10.");
    }
}

class Zflip extends Samsung{

    @Override
    void splitScreen() {
        System.out.println("MultiTasking in Zflip.");
    }
}

interface SamsungFactory{
    abstract Samsung getSamsung();
}

class S10Factory implements SamsungFactory{

    @Override
    public Samsung getSamsung() {
        return new S10();
    }
}

class ZflipFactory implements SamsungFactory {

    @Override
    public Samsung getSamsung() {
        return new Zflip();
    }
}