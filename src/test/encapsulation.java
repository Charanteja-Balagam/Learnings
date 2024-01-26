package test;

public class encapsulation {

	private int ssn;
	private String name;
	private int salary;
	
	
	
	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public static void main(String[] args)
	{
		encapsulation emp= new encapsulation();
		emp.setName("tom");
		emp.setSalary(100);
		emp.setSsn(2);
		
		System.out.println(emp.getName());
	}
	
}
