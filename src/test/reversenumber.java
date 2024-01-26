package test;

import java.util.Scanner;

public class reversenumber {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int num=sc.nextInt();
	// using algorithm
	/*
	 * int rev=0; while(num!=0) { rev =rev*10+num%10; num=num/10; }
	 */
	
	/*
	 * //using string buffer
	 * 
	 * StringBuffer rev; StringBuffer sb = new StringBuffer(String.valueOf(num));
	 * rev=sb.reverse();
	 */
	//using StringBuilder
	StringBuilder sbl= new StringBuilder();
	sbl.append(num);
	StringBuilder rev = sbl.reverse();
	
	System.out.println("reverse of the number:" +rev);
}
}
