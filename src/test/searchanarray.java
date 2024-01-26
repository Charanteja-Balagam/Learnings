package test;

public class searchanarray {

	public static void main(String[] args) {
		 int a[]= {10,27,37,46,18};
		 boolean flag=false;
		 int search=19;
		 for(int i=0;i<a.length;i++)
		 {
			 if(search==a[i])
			 {
				 System.out.println("element found at index:" +i);
				 flag = true;
			 }
		 }
if(flag==false)
{
	System.out.println("element not found"); 
}
	}

}
