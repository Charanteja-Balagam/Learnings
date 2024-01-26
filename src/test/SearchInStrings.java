package test;

import java.util.Scanner;

public class SearchInStrings {

	public static void main(String[] args)
	{
		String[] str = {"charan","teja","balagam"};

		System.out.println("enter the char:");
		Scanner in = new Scanner(System.in);
		char tar = in.next().charAt(0);
		search(str, tar);




	}

	static void search(String[] arr, char tar)
	{
		if(arr.length == 0)
		{
			System.out.println("no elements");
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j <arr[i].length();j++) {
	      if(arr[i].charAt(j) == tar)
	      {
	    	  System.out.println("character found at :" +i +j);

	      }
		}


	}


}
}
