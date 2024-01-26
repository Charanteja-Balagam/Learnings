package test;

public class GreatestChar {

	public static void main(String[] args)
	{
		char[] arr = {'a','c','f','j'};
		char tar = 'k';
		int ans = binarysearch(arr,tar);
		System.out.println(ans);

	}

	static int binarysearch(char[] arr, char tar)
	{

		int start =0;
		int end = arr.length-1;
		if(tar > arr[arr.length -1]) {
			return start;
		}
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




		}
		 return start;
	}

}
