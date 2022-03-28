package javaSE.kmp.oop;

abstract class Shape
{
	abstract void showShape();
}
class Rectangle extends Shape
{
	void showShape()
	{
		System.out.println("This is Rectangle");
	}
}
class Circle extends Shape
{
	void showShape()
	{
		System.out.println("This is Circle");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Shape obj = new Rectangle();
		Shape obj2 = new Circle();
		obj.showShape();
		obj2.showShape();
		
	}
}
