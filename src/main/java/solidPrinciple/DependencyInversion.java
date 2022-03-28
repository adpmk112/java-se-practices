package solidPrinciple;

interface Input
{
    void start();
}

class Mouse implements Input
{
    @Override
    public void start()
    {
        System.out.println("Mouse is working.");
    }
}
class Keyboard implements Input
{
    @Override
    public void start()
    {
        System.out.println("Keyboard is working.");
    }
}
class GamingMouse implements Input
{
    @Override
    public void start()
    {
        System.out.println("GamingMouse is working");
    }
}
class Laptop
{
    Input input1;
    Input input2;
   
    Laptop(Input input1,Input input2)
    {
       this.input1 = input1;
       this.input2 = input2;
    }
    public void laptopStart()
    {
        System.out.println("Window starts");
        this.input1.start();
        this.input2.start();
    }
}
public class DependencyInversion
{
    public static void main(String[] args) {
        Input input1 = new Keyboard();
        Input input2 = new GamingMouse();

        Laptop laptop = new Laptop(input1,input2);
        laptop.laptopStart();
    }
}