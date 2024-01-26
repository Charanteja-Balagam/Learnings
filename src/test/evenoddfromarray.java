package test;

public class evenoddfromarray {

	public static void main(String[] args) {
		int a[]= {2,4,3,5,6,4,6};
		for(int value:a)
		{
			if(value%2==0) {
				System.out.println(+value +"is a even number");
			}
			else {
				System.out.println(+value +"is a odd number");
			}
		}

	}

}
