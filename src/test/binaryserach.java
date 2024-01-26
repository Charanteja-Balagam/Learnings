package test;

public class binaryserach {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		int len = a.length;
		int search = 70;
		int l=0;
		int mid =(l+len)/2;
		if(a[mid] == search)
		{
			System.out.println("element found at" +mid);
		}
		else if(search>a[mid])
		{
			for(int i=mid+1;i<=len-1;i++)
			{
				if(a[i]==search)
				{
					System.out.println("element found at:" +" " +i);
				}
			}
		}
		else if(search<a[mid])
		{
			for(int i=0;i<mid;i++)
			{
				if(a[i]==search)
				{
					System.out.println("element found at"+" "  +i);
				}
			}
		}
	}

}
