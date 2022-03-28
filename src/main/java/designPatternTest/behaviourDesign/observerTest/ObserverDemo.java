package designPatternTest.behaviourDesign.observerTest;


public class ObserverDemo {
    public static void main(String[] args) {
        Studio ufotable = new Ufotable();

        StreamingPlatform platform = new CrunchyRoll("DemonSlayer");
        platform.update("DemonSlayer Season2 will be end in this week.\nCrunchyRoll\t(26.3.2022)");
        System.out.println("-------------------------------------------------");

        ufotable.attach(platform);
        ufotable.change("DemonSlayer final episode will be delayed due to the recent earthquake" +
                        "\nUfotable\t(27.3.2022)");
    }
}
