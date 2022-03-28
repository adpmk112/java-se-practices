package designPatternTest.behaviourDesign.observerTest;

import java.util.ArrayList;
import java.util.List;

public class Ufotable implements Studio {

    List<StreamingPlatform> platformList = new ArrayList<>();

    @Override
    public void attach(StreamingPlatform platform) {
        platformList.add(platform);
    }

    @Override
    public void change(String message) {
        System.out.println("Breaking News..");
        for(StreamingPlatform streamingPlatform : platformList){
            streamingPlatform.update(message);
        }
    }
}
