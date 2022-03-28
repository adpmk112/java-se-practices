package projDemo.realLife.members;

import projDemo.realLife.BeerException;
import projDemo.realLife.DailyRoutine;

public class Sst extends Member implements DailyRoutine {

    private String weather;

    public Sst(String weather) throws BeerException {
        this.weather = weather;
        if(weather == "HardRain"){
            throw new BeerException("It is heavily raining today ! You should grab a beer and relax ^^");
        }
    }

    @Override
    public void coding() {
        System.out.println("Learning Coding !!");
    }

    @Override
    public void watchAnime() {
        System.out.println("Watching Anime ^^");
    }
}
