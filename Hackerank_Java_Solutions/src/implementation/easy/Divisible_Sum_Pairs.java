/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

public class Divisible_Sum_Pairs
{
	static int divisibleSumPairs(int n, int k, int[] ar)
	{

		int count = 0;
		for (int i = 0; i < ar.length - 1; i++)
		{
			for (int j = i + 1; j < ar.length; j++)
			{
				if ((ar[i] + ar[j]) % k == 0)
				{
					count++;
				}
			}
		}
		return count;

	}
}

/* https://github.com/shahiddhariwala */