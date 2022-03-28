package designPattern.creationalDesign;

abstract class Audio
{
    abstract void generateAudio();
}

abstract class Video
{
    abstract void generateVideo();
}

abstract class ExtensionFactory
{
    abstract Audio createAudio();
    abstract Video createVideo();
}

class Mp4Audio extends Audio
{
    @Override
    void generateAudio() {       
        System.out.println("Mp4 Audio");
    }
}

class Mp4Video extends Video
{
    @Override
    void generateVideo()
    {
        System.out.println("Mp4 Video");
    }
}

class Mp4Factory extends ExtensionFactory
{
    @Override
    Audio createAudio()
    {
        return new Mp4Audio();
    }

    @Override
    Video createVideo()
    {
        return new Mp4Video();
    }
}

class WmvAudio extends Audio
{
    @Override
    void generateAudio()
    {
        System.out.println("Wmv Audio");
    }
}

class WmvVideo extends Video
{
    @Override
    void generateVideo()
    {
        System.out.println("Wmv Video");
    }
}

class WmvFactory extends ExtensionFactory
{
    @Override
    Audio createAudio()
    {
        return new WmvAudio();
    }

    Video createVideo()
    {
        return new WmvVideo();
    }
}

class FlvAudio extends Audio
{
    @Override
    void generateAudio()
    {
        System.out.println("Flv Audio");
    }
}

class FlvVideo extends Video
{
    @Override
    void generateVideo()
    {
        System.out.println("Flv Video");
    }
}

class FlvFactory extends ExtensionFactory
{
    @Override
    Audio createAudio()
    {
        return new FlvAudio();
    }
    
    @Override
    Video createVideo()
    {
        return new FlvVideo();
    }
}

public class AbstractFactoryEg
{
    public static void main(String[] args) {
        ExtensionFactory eFactory = new Mp4Factory();
        Audio audio = eFactory.createAudio();
        Video video = eFactory.createVideo();

        audio.generateAudio();
        video.generateVideo();
    }
}