package projDemo.realLife.members;

import projDemo.realLife.Cigarette;
import projDemo.realLife.Place;
import projDemo.realLife.SmokingPlan;
import projDemo.realLife.Wallet;

public class Member implements Wallet, SmokingPlan {

    private int money;
    private Place place;
    private Cigarette cigarette;

    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public String selectCigarette(Cigarette cigarette) {
        this.cigarette = cigarette;
        return cigarette.name();
    }

    @Override
    public String selectPlace(Place place) {
        this.place = place;
        return place.name();
    }

    @Override
    public void smoke() {
        System.out.println("Smoking "+cigarette+" at "+place);
    }
}
