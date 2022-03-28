package javaSE.kmp.solidPrincipleAcat.dip;

public class DieselCar implements Vehicle{

    private Wheel wheel;
    private Gasoline gasoline;

    // can use also like this
   // private Wheel wheel = new Wheel();
   // private Gasoline gasoline = new DieselOil();

    public DieselCar(Wheel wheel,Gasoline gasoline) {
        this.wheel = wheel;
        this.gasoline = gasoline;
    }

    @Override
    public void drive() {
        if(gasoline.isEmpty()||!gasoline.isDiesel()){
            System.out.println("Car cannot drive");
            return;
        }
        this.wheel.rollForward();
    }

    @Override
    public void moveBackward() {
        this.wheel.rollBackward();
    }
}
