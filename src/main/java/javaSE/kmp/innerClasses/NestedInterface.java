package javaSE.kmp.innerClasses;

interface Showable
{
	interface Message
	{
		void msg();
	}
	
	interface Alert
	{
		void alert();
	}
}
public class NestedInterface implements Showable.Alert {
		public static void main(String[] args) {
			NestedInterface obj = new NestedInterface();
			obj.alert();
		}

		@Override
		public void alert() {
			// TODO Auto-generated method stub
			System.out.println("Warning ! ");
		}
}
