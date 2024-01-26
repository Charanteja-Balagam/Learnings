package test;

import java.util.HashSet;

public class dupicateelementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[] = {"hello","java","python","c++","java"};
/*
 * for(int i=0;i<=arr.length-1;i++) { for(int j=i+1;j<=arr.length-1;j++) {
 * if(arr[i]==arr[j]) { System.out.println("the duplicate element is:" +arr[i]);
 * }
 * 
 * } }
 */

//approach with hash set.
boolean flag=false;
HashSet <String> lang=new HashSet();
for(String l:arr)
{
	if(lang.add(l)==false)
	{
		System.out.println("there is duplicate string:"  +l);
		flag = true;
	}
	
	
		
}
if(flag==false)
{
	System.out.println("there is no duplicate string");
	
}

		
	}

}
