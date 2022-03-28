package javaSE.kmp.collection;

// modify with interator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Person1
{
	private int id;
	private String name;
	private int age;
	public Person1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
public class TestIterator
{
	public static void main(String[] args) {
		List<Person1>people = new ArrayList<>();
		people.add(new Person1(1,"Mg Mg",21));
		people.add(new Person1(2,"Ma Ma",23));
		people.add(new Person1(3,"Hla Hla",21));
		
		System.out.println("Data Size --> "+people.size());
		
		Iterator<Person1>it = people.iterator();
		while(it.hasNext())
		{
			Person1 person1 = it.next();
			if(person1.getId()==1)
			{
				person1.setName("Aung Aung");
			}
			if(person1.getAge()==23)
			{
				person1.setAge(21);
			}
		} 
		for(Person1 person1 : people)
		{
			System.out.println(person1.getId()+"," +person1.getName()+ ","+person1.getAge());
		}
		System.out.println("-------------------------------------");
		
		List<String>data = new ArrayList<>();
		data.add("Mg Mg");
		data.add("Ma Ma");
		data.add("Mg Mg");
		data.remove("Mg Mg");
		Iterator<String> it1 = data.iterator();
		while(it1.hasNext())
		{
			String value = it1.next();
			if(value.equals("Mg Mg"))
			{
				it1.remove();
			}
		}
		for(String out:data)
		{
			System.out.println(out);
		}
		System.out.println("Data Size --> "+data.size());
	}
}

