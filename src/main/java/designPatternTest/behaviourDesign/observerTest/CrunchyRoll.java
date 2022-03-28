package designPatternTest.behaviourDesign.observerTest;

public class CrunchyRoll implements StreamingPlatform{
    String name;
    public CrunchyRoll(String name)
    {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
