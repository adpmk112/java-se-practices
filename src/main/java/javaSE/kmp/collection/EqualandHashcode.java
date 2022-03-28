package javaSE.kmp.collection;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

class Person2
{
	private int id;
}

public class EqualandHashcode {
	public static void main(String[] args) {
		Integer v1 = new Integer(1);
		Integer v2 = new Integer(1);
		
		Map<Integer,String>data = new HashMap<Integer,String>();
		data.put(v1, "MgMg");
		data.put(v2, "MaMa");
		System.out.println(data.size()+"-->"+data); //get final desicion
		
		Person2 p1 = new Person2(1);
		Person2 p2 = new Person2(1);
		
		Map<Person2,String>data1 = new HashMap<Person2,String>();
		data1.put(p1, "Mg Mg");
		data1.put(p2, "Hla Hla");
		System.out.println(data1.size()+"-->"+data1);
	}
}
