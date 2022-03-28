package javaSE.kmp.polymorphism;
class Sasuke
{
    public void print()
    {
        System.out.println("I am Uchiha Sasuke");
    }
}

class Konoha extends Sasuke
{
    public void print()
    {
        System.out.println("Rough Ninja");
    }
}

class Team7 extends Sasuke
{
    public void print()
    {
        System.out.println("Teammate");
    }
}
public class DynamicPolymorph {
    public static void main(String[] args) {
        Sasuke sasuke = new Sasuke();
        sasuke.print();

        Sasuke sasuke1 = new Konoha();
        sasuke1.print();

        Sasuke sasuke2 = new Team7();
        sasuke2.print();
    }
}
