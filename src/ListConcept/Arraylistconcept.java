package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistconcept {
	

	public static void main(String[] args) {
		
		int a[]=new int[4];
		
		ArrayList arr = new ArrayList();
		
			arr.add(8);
			arr.add(6);
			arr.add(4);
			arr.add(3);
			arr.add(2);
			arr.add("hello");
			
		
		
		System.out.println(arr.size());
		arr.add(8);
		System.out.println(arr.size());
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
			
		}
		
		
		Employee e1 = new Employee(20,"chran","develper");
		Employee e2 = new Employee(30,"helo","yes");
		Employee e3 = new Employee(40,"jukil","just");
		ArrayList<Employee> ar1=new ArrayList<Employee>();
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		Iterator<Employee> it= ar1.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			
		}
	}

}
