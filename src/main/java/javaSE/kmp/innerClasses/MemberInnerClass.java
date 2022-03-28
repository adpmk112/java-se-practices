package javaSE.kmp.innerClasses;

class Outer
{
	private int value = 20; 	
	
	private class Inner
	{
		void show()
		{
			System.out.println("Value is "+value);
		}
	}
	public void display()
	{
		Inner obj = new Inner();
		obj.show();
	}
}
public class MemberInnerClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();
		
	/*	Outer.Inner inner = outer.new Inner();
		inner.show(); */ // can use if not inner class is private
	}
}
