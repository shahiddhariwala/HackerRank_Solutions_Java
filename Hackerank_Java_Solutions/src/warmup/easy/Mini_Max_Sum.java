/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;

public class Mini_Max_Sum
{
	static void miniMaxSum(int[] arr)
	{
		long min = Integer.MAX_VALUE;
		long max = Integer.MIN_VALUE;
		long sum = 0;
		for (int num : arr)
		{
			sum += num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.println((sum-max) + " " + (sum-min));
	}
}

/* https://github.com/shahiddhariwala */