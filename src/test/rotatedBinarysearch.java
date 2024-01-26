package test;

public class rotatedBinarysearch {

public static void main(String[] args) {
	int[] arr = {4,5,6,7,0,1,2};
	System.out.println(findPivot(arr));
	int ans = search(arr,1);
	System.out.println(ans);


}
public static  int search(int[] nums, int tar)
{
	int pivot = findPivot(nums);

	if(pivot == -1) {

		return binarysearch(nums,tar,0,nums.length-1);

	}
	if(nums[pivot] == tar)
	{
		return pivot;
	}
	if(tar >= nums[0])
	{
		System.out.println("hello");
		return binarysearch(nums,tar,0,pivot-1);
	}else {
	return binarysearch(nums,tar,pivot+1,nums.length-1);
}
}
static int findPivot(int[] arr)
{
	int start =0;
	int end = arr.length-1;
	while(start <= end)
	{
		int mid = start+(end-start)/2;
		if(mid < end && arr[mid] > arr[mid+1])
		{
			return mid;
		}
		if(mid > start && arr[mid] < arr[mid+1])
		{
			return mid-1;
		}
		if(arr[mid] <= arr[start])
		{
			end = mid-1;
		}
		else {
			start = mid+1;
		}

	}
	return -1;

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
