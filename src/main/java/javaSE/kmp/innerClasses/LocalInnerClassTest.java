package javaSE.kmp.innerClasses;

class OuterClass
{
	private int value = 30;
	
	public void displayValue()
	{
		class LocalInner
		{
			void showValue()
			{
				System.out.println("Value is "+value);
			}
		}
		LocalInner obj = new LocalInner();
		obj.showValue();
	}
}
public class LocalInnerClassTest {
public static void main(String[] args) {
	OuterClass outerClass = new OuterClass();
	outerClass.displayValue();
}
}
