package javaSE.kmp.oop;

enum Food
{
	SpicyRice, Hamburger
}

enum Juice
{
	CocaCola, LemonTea
}

interface FastFoodRestaurant 
{
	void Order(Food food);
	void Order(Juice juice);
	void Order(Food food,Juice juice);
}

class KFC implements FastFoodRestaurant
{

	@Override
	public void Order(Food food) {
		// TODO Auto-generated method stub
		System.out.println("Order is "+food+".");
	}

	@Override
	public void Order(Juice juice) {
		// TODO Auto-generated method stub
		System.out.println("Order is "+juice+".");
	}

	@Override
	public void Order(Food food, Juice juice) {
		// TODO Auto-generated method stub
		System.out.println("Order is "+food+" & "+juice+".");
	}
}

public class AdHoc {
	public static void main(String[] args) {
		FastFoodRestaurant obj = new KFC();
		obj.Order(Food.SpicyRice);
		obj.Order(Juice.LemonTea);
		obj.Order(Food.Hamburger, Juice.CocaCola);
	}
}
	/*	//  Double can access all primitive type numeric (One of AdHoc polymorphism)
	  	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 65;
		byte bt = 5;
		long lg = 44;
		int itg = 7;
		double db = 0.5;
		float ft = 3.3f;
		AdHoc adhoc = new AdHoc();
		adhoc.output("char",ch);
		adhoc.output("byte",bt);
		adhoc.output("long",lg); 
		adhoc.output("int",itg);
		adhoc.output("double",db);
		adhoc.output("float",ft);
	}
	public void output(String string,double value)
	{
		System.out.println(string+" = "+value);
	}
} */
