package test;

public class NumsOfEven {

	public static void main(String[] args)
	{
		int[][] arr = {{200,33,4},{4,2,1},{3,22,37},{33,87,100},{103,2,1}};
		int max = Max(arr);
		System.out.println(max);
		System.out.println(arr[1][2]);




	}
	public static int Max(int[][] arr) {

		int max = 0;

		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum += arr[i][j];
			}
			if(sum > max)
			{
				max = sum;
			}

		}
		return max;
	}



}
