package test;

public class reverseofstring {
public static void main(String[] args)
{
	String str=" dinebhkcd";
	String rev="";
	
	/*
	 * int len=str.length();
	 * 
	 * for(int i=len-1;i>=0;i--) { rev = rev+str.charAt(i); }
	 */
	
	/*
	 * char a[]=str.toCharArray(); int len=a.length; for(int i=len-1;i>=0;i--) {
	 * rev=rev+a[i]; }
	 */
	
	//using String Buffer
	
	StringBuffer sb=new StringBuffer(str);
	sb.reverse();
	System.out.println(sb);
}
}
