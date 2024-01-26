package test;

public class swapping {
public static void main(String[] args)
{
	int a=10,b=20;
	System.out.println("before swapinng the numbers are: "+a+"  "+b);
	
	/*//Logic1-third variable
	
	int t=a;
	a=b;
	b=t;*/
	
	
	/*
	 * //Logic2- without using 3RD varible a=a+b; b=a-b; a=a-b;
	 */
	/*
	 * //logic 3 - * & / without using variable //value should nt be 0
	 * 
	 * a=a*b; b=a/b; a=a/b;
	 */
	
	/*
	 * //Logic 4 - BIT wise operators (^) a=a^b; b=a^b; a=a^b;
	 */
	
	//Logic 5 single statement
	
	b=a+b-(a=b);
	
	System.out.println("After swapinng the numbers are: "+a+"  "+b);
}
}
