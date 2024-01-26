package test;

public class sumofdigits {

	public static void main(String[] args) {
		int num=2356;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		
		
		System.out.println("the sum of digits:" +sum);
	}
  

}
