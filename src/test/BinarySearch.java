package test;

public class BinarySearch {

	public static void main(String[] args)
	{
		int[] arr = {-19,2,4,5,6,9,22,34,47,56,57};
		int tar = 34;
		int ans = binarysearch(arr,tar,0,arr.length-1);
		System.out.println(ans);

	}

	static int binarysearch(int[] arr, int tar,int start,int end)
	{
		if(start > end) {
			return -1;
		}




			int mid = start+ (end-start)/2;
			if(tar == arr[mid])
			{
				return mid;
			}
			if(tar > arr[mid])
			{
				return binarysearch(arr,tar,mid+1,end);
			}

				return  binarysearch(arr,tar,start,mid-1);









	}



}
