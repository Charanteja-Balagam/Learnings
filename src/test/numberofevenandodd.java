package test;

public class numberofevenandodd {

	public static void main(String[] args) {
		int num=234567;
	int	eve_count=0;
	int odd_count=0;
	
	while(num>0)
	{
		int rem=num%10;
		if(rem%2==0)
		{
			eve_count++;
		}
		else
		{
			odd_count++;
		}
		num=num/10;
		
	}
		System.out.println("odd count of the digits:" +odd_count);
		System.out.println("even count of the digits:" +eve_count);

	}

}
