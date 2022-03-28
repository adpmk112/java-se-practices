package javaSE.kmp.solidPrincipleAcat.isp;

public class Egret extends AbstractLivingCreature implements
        LandCreature,FlyingCreature,AquaticCreature{
    @Override
    public void swim() {
        System.out.println("Egret is swimming!");
    }

    @Override
    public void fly() {
        System.out.println("Egret is flying");
    }

    @Override
    public void walk() {
        System.out.println("Egret is walking");
    }
}
