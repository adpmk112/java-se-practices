package javaSE.kmp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lombok.AllArgsConstructor;

import java.util.SortedSet;
import java.util.TreeSet;

@AllArgsConstructor
// how to sort object
class Person3 
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class SortingAList {

	public static void main(String[] args) {
		List<Person3>people = new ArrayList<>();
		people.add(new Person3(2,"MgMg"));
		people.add(new Person3(1,"AungAung"));
		people.add(new Person3(3,"HlaHla"));
		Collections.sort(people, Comparator.comparingInt(Person3::getId));
		for(Person3 out : people)
		{
			System.out.println(out.getId()+" "+out.getName()); 
		}
		
		System.out.println("------------------------------");

		SortedSet<String>data = new TreeSet<>();
		data.add("b");
		data.add("a");
		data.add("c");
		
		for(String out:data)
		{
			System.out.println(out);
		}
		
		System.out.println("------------------------------");
		
		SortedSet<Integer>data2 = new TreeSet<>();
		data2.add(3);
		data2.add(2);
		data2.add(1);
		
		for(Integer out:data2)
		{
			System.out.println(out);
		}
	}
}
