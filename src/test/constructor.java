package test;

public class constructor {

	String name;
	int price;
	String engine;
	
	public constructor(String name,int price,String engine){
		this.name =name;
		this.price =price;
		this.engine =engine;
	}
	
	public static void main(String[] args) {
		constructor obj= new constructor("audi",1000000,"petrol");
		System.out.println(obj.price); 
		System.out.println(obj.name);
		
	}
	
}
