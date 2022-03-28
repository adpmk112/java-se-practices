package javaSE.kmp.innerClasses;

class Outer1
{
	private static int value = 50;
	
	static class Inner
	{
		public void show()
		{
			System.out.println("Value is "+value);
		}
	}
}

public class StaticNestedClass {
public static void main(String[] args) {
		Outer1.Inner inner = new Outer1.Inner();
		inner.show();
}
}
