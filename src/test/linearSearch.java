package test;

public class linearSearch {
public static void main(String[] args)
{
	int[] nums = {2,5,4,6,88,9};
	int tar = 88;
	int ans = linser(nums, tar);
	System.out.println(ans);
}

static int linser(int[] arr, int tar)
{
	if(arr.length == 0)
	{
		return -1;
	}
	for(int i=0;i<arr.length;i++)
	{
		int ele = arr[i];
		if(ele == tar)
		{
			return i;
		}

	}
	return -1;

}
}
