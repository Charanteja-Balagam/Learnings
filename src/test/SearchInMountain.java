package test;

public class SearchInMountain {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,3,1};
		int tar = 3;
		int ans = ser(arr,tar);
		System.out.println(ans);
	}

	static int ser(int[] arr,int tar)
	{
		int peak = search(arr);
		int firsttry = binarysearch(arr,tar,0,peak);
		if(firsttry!=-1)
		{
			return firsttry;
		}
		else {

			return binarysearch(arr,tar,peak+1,arr.length-1);
		}
	}
	static int search(int[] arr)
	{

	int start =0;
	int end = arr.length-1;


	while(start < end)
	{
		int mid = start+ (end-start)/2;
		if(arr[mid] > arr[mid+1])
		{
			end = mid;
		}
		else {
			start = mid+1;
		}
	}

	return start;



	}
	static int binarysearch(int[] arr, int tar,int start,int end)
	{




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
				return mid;
			}



		}
		 return -1;
	}



}
