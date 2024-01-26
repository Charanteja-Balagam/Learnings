package Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		h.put(1,"charan");
		h.put(2,"teja");
		h.put(3,"ram");
		h.put(4,"rahul");
		System.out.println(h);
		Hashtable h1=new Hashtable();
		h1=(Hashtable) h.clone();
		
        h1.clear();
        System.out.println(h1);
        Hashtable ht=new Hashtable();
        ht.put("A","employee");
        ht.put("B","manager");
        ht.put("c","work");
        if(ht.contains("manager")) {
        	System.out.println("value is found");
        	
        }
        	
        	Enumeration e = ht.elements();
        	while(e.hasMoreElements())
        	{
        	
        		System.out.println(e.nextElement());
        	}
        	
        Set m =	ht.entrySet();
        System.out.println(m);
        Hashtable ht1=new Hashtable();
        ht1.put("A","employee");
        ht1.put("B","manager");
        ht1.put("c","work");
         
        if(ht.equals(ht1))
        
        {
        	System.out.println("values are equal");
        }
     System.out.println(ht1.get("A"));  
     System.out.println(ht1.hashCode());
	}

}
