package javaSE.kmp.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionIntro {
		public static void main(String[] args) {
			System.out.println("--- ArrayList ---");
			List<String>data = new ArrayList<>();
			data.add("Mg Mg");
			data.add("Ma Ma");
			for(String out : data)
			{
				System.out.println(out);
			}
			System.out.println("Data Size --> "+data.size());
	//-------------------------------------------------------------------------------------
			System.out.println("--- LinkedList ---");
			List<Integer>data1 = new LinkedList<>();
			data1.add(1);	
			data1.add(2);
			for(Integer out : data1)
			{
				System.out.println(out);
			}
			System.out.println("Data Size --> "+data1.size());	
	//---------------------------------------------------------------------------------------
			System.out.println("--- HashSet ---");
			Set<Integer> data2 = new HashSet<>();
			data2.add(1);
			data2.add(2);
			data2.add(2);
			data2.add(3);
			for(Integer out : data2) {
				System.out.println(out);
			}
			System.out.println("Data Size --> "+data2.size());
	//---------------------------------------------------------------------------------------
			System.out.println("--- HashMap ---");
			Map<String, String>data3 = new HashMap<String, String>();
			data3.put("a", "Mg Mg");
			data3.put("z", "Ma Ma");
			System.out.println(data3.get("a"));
			System.out.println(data3.get("z"));
			
			for(Map.Entry<String, String>out : data3.entrySet())
			{
				System.out.println(out.getKey()+" --> "+out.getValue());
			}
		}
}
			
			

