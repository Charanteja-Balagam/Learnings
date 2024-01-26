package test;

import java.util.ArrayList;
import java.util.List;

public class MiisingNumArray {


	public static void main(String[] args) {
		int[] arr= {3,4,5,8,1,2,4,3};
	   List<Integer> res= missingnumber(arr);
	   System.out.println(res);

	}

	static List<Integer> missingnumber(int[] arr)
	{

		int i = 0;
		while(i<arr.length) {

			int correctIndex = arr[i] -1;
			if( arr[i] != arr[correctIndex])
			{
				swap(arr,i,correctIndex);

			}else {
				i++;
			}
		}


		List<Integer> ans = new ArrayList<>();
		for(int index=0;index < arr.length;index++)
		{
			if(arr[index] != index+1)
			{
				ans.add(index+1);

			}

		}

		return ans;
	}



	static void swap(int[] arr, int first, int second)
	{
		int temp = arr[first];
		 arr[first] = arr[second];
		 arr[second] = temp;
	}
}
