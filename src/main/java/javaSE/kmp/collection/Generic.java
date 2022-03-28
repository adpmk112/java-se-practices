package javaSE.kmp.collection;
//T,K,V,E (Most Used) <Can use any word here>
class Box<T>
{
	public void print(T data)
	{
		System.out.println(data);
	}
}

interface LivingCreature
{
	void printName();
}

class Person4 implements LivingCreature
{
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("I am human");
	}
}
class Dog1 implements LivingCreature
{
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("I am Jackie!");
	}
}

class ShowLivingCreatureName<T extends LivingCreature>
{
	public T getData(T data)
	{
		return data;
	}
}

public class Generic {
	public static <E> void printArray (E[] elements)
	{
		for(E out:elements)
		{
			System.out.println(out);
		}
	}
	
	public static void main(String[] args) {
		Box<Integer> obj = new Box<>();
		System.out.println("--- Box ---");
		obj.print(1);
		
		Integer[] intArray = {1,2,3,4,5};
		String[]strArray = {"p","m","k"};
		
		System.out.println("--- Int Arrray ---");
		printArray(intArray);
		System.out.println("--- Str Arrray ---");
		printArray(strArray);
		
		System.out.println("------------------");
		Person4 prn = new Person4();
		Dog1 dog = new Dog1();
		
		ShowLivingCreatureName<Person4>obj1= new ShowLivingCreatureName();
		obj1.getData(prn).printName();
		
		ShowLivingCreatureName<Dog1>obj2=new ShowLivingCreatureName();
		obj2.getData(dog).printName();
	}
}
