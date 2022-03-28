package javaSE.kmp.oop;

class MgMg
{
	public void printRole()
	{
		System.out.println("I am MgMg!");
	}
}

class Mother extends MgMg
{
	public void printRole()
	{
		System.out.println("MgMg is son!");
	}
}

class HlaHla extends MgMg
{
	public void printRole()
	{
		System.out.println("MgMg is brother");
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MgMg obj = new Mother();
		obj.printRole();
		MgMg obj1 = new HlaHla();
		obj1.printRole();
		MgMg obj2 = new MgMg();
		obj2.printRole();
	}

}
