package test;

import java.util.Arrays;

public class FirstLast {
	public static void main(String[] args)
	{
		int[] arr = {-19,2,4,5,6,9,22,22,22,22,34,47,56,57};
		int tar = 21;
		int[] ans = binarysearch(arr,tar);
		System.out.println(Arrays.toString(ans));


	}

	static int[] binarysearch(int[] arr, int tar)
	{
		int[] res = {-1,-1};;
		int start =0;
		int end = arr.length-1;

		while(start <= end)
		{
			int mid = start+ (end-start)/2;
			if(tar < arr[mid])
			{
				end = mid-1;
			} else if(tar > arr[mid])
			{
				start = mid+1;
			}
			else {
				 res[0] = mid;
				 res[1] = mid;

				 int left = mid-1;
				 int right = mid+1;

				 while(left >=0 && arr[left] == tar)
				 {
					 res[0] = left;
					 left--;

				 }
				 while(right < arr.length && arr[right] == tar)
				 {
					 res[1] = right;
					 right ++;
				 }
				 break;

			}



		}

		return res;




	}
}
