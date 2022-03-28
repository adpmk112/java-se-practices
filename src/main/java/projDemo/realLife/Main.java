package projDemo.realLife;


import projDemo.realLife.members.Member;
import projDemo.realLife.members.Sst;

public class Main {
    public static void main(String[] args) throws BeerException {
      /*  DailyRoutine sst = new Sst("HardRain");
        sst.coding();
        sst.watchAnime(); */

        Member sst = new Sst("Normal");
        sst.selectCigarette(Cigarette.MALBORO);
        sst.selectPlace(Place.OUTDOOR);
        sst.smoke();
    }
}
