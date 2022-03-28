 package javaSE.kmp.oop;
 import java.util.ArrayList;
import java.util.List;
 interface Animal
 {
	 void greet();
 }
 
 class Dog implements Animal
 {

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Woof");
	}
 }
 
 class Cat implements Animal
 {
	 public void greet()
	 {
		 System.out.println("Meow");
	 }
 }
public class Paramatric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		List<Animal>animalList = new ArrayList<>();
		animalList.add(cat);
		animalList.add(dog);
		for(Animal out : animalList)
		{
			out.greet();
		}
	}

}
