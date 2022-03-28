package abstractDemo;
abstract class Heroes
{
    abstract void ShowRole();
}

class Johnson extends Heroes
{
    void ShowRole()
    {
        System.out.println("Tank");
    }
}

class Chou extends Heroes
{
    void ShowRole()
    {
        System.out.println("Fighter");
    }
}

public class AbstractExample
{
    public static void main(String[] args) {
        Heroes hero = new Johnson();
        hero.ShowRole();

        Heroes hero1 = new Chou();
        hero1.ShowRole();
    }
}