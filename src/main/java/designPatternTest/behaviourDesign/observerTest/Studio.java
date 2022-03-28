package designPatternTest.behaviourDesign.observerTest;

public interface Studio {
    void attach(StreamingPlatform observer);
    void change(String message);
}
