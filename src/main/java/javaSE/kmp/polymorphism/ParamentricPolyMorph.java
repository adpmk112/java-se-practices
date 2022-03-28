package javaSE.kmp.polymorphism;
import java.util.ArrayList;
import java.util.List;
interface Jinchuriki
{
    void showName();
}

class Fuu implements Jinchuriki
{
    public void showName()
    {
        System.out.println("My name is Fuu");
    }
}

class Bee implements Jinchuriki
{
    public void showName()
    {
        System.out.println("My name is Bee ~ Yoh ");
    }
}
public class ParamentricPolyMorph {
    public static void main(String[] args) {
        Jinchuriki fuu = new Fuu();
        Jinchuriki bee = new Bee();
        List<Jinchuriki>jinchurikiList = new ArrayList<>();
        jinchurikiList.add(fuu);
        jinchurikiList.add(bee);
        for (Jinchuriki out : jinchurikiList) {
            out.showName();
        }
    }
}
