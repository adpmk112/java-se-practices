package javaSE.kmp.oop;

class AungAung
{
	public static void showRole()
	{
		System.out.println("I am AungAung");
	}
}

class Father extends AungAung
{
	public static void showRole()
	{
		System.out.println("AungAung is son");
	}
}

class ZawZaw extends AungAung
{
	public static void showRole()
	{
		System.out.println("AungAung is friend");
	}
}
public class StaticBinding {
		public static void main(String[] args) {
			AungAung aungaung = new Father();
			aungaung.showRole();
			AungAung aungaung1 = new ZawZaw();
			aungaung1.showRole();
		}
}
