package test;

public class sumofarray {

	public static void main(String[] args) {
		int a[]= {2,5,4,3,7,8};
		int sum =0;
		/*
		 * for(int i=0;i<=a.length-1;i++) { sum=sum+a[i]; } System.out.println(sum);
		 */
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println(sum);
	}

}
