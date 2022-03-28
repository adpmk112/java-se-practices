package abstractDemo;
public class AbstractClass {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.showShape();

        Shape shape1 = new Retangle();;
        shape1.showShape();
    }   
}
abstract class Shape
{
    abstract void showShape();
}
class Retangle extends Shape
{
    void showShape()
    {
        System.out.println("This is Rectangle");
    }
}
class Triangle extends Shape
{
    void showShape()
    {
        System.out.println("This is Triangle");
    }
}

