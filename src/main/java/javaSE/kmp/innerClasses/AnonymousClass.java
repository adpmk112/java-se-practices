package javaSE.kmp.innerClasses;

abstract class Person
{
	abstract void eat();
}

public class AnonymousClass {
	public static void main(String[] args) {
	Person p = new Person() {
		@Override
		void eat()
		{
			System.out.println("Person is eating.");
		}
	};
	p.eat();
}
}
