package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"charan");
		hm.put(2,"charantej");
		hm.put(3,"hello");
		hm.put(4,"none");
		System.out.println(hm.get(2));
		for(Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey()+" " +m.getValue());
		}
			
		hm.remove(3);
		System.out.println(hm);
		Employee e1 = new Employee(26,"hello","admin");
		Employee e2 = new Employee(28,"charan","developer");
		Employee e3 = new Employee(29,"heo","hr");
		
		HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
		map.put(1, e1);
		map.put(2, e1);
		map.put(3, e1);
		for(Entry<Integer,Employee> m: map.entrySet())
		{
			int key = m.getKey();
			Employee e=m.getValue();
			System.out.println(key +"info");
			System.out.println(e.age+"  "  +e.name +"   "  +e.role);
			
		}
	}

}
