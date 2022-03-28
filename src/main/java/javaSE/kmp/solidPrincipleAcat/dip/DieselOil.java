package javaSE.kmp.solidPrincipleAcat.dip;

public class DieselOil implements Gasoline{
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isDiesel() {
        return true;
    }
}
