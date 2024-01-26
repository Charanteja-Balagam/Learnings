package test;

public class rec {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(fun(nums,0));


	}

	static boolean  fun(int[] nums, int index)
	{
		if(index == nums.length-1)
		{
			return true;
		}

		return nums[index] < nums[index+1] && fun(nums,index+1);





	}
}
