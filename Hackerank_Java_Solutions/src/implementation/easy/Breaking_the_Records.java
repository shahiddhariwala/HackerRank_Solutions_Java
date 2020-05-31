/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

import java.util.Arrays;

public class Breaking_the_Records
{
	static int[] breakingRecords(int[] scores)
	{
		int ans[] = new int[2];
		int max = scores[0];
		int min = scores[0];

		for (int i = 1; i < scores.length; i++)
		{
			if (scores[i] > max)
			{
				max = scores[i];
				ans[0]++;
			} else if (scores[i] < min)
			{
				min = scores[i];
				ans[1]++;
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(breakingRecords(new int[]
		{ 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 })));

		System.out.println(Arrays.toString(breakingRecords(new int[]
		{ 10, 5, 20, 20, 4, 5, 2, 25, 1 })));
	}
}

/* https://github.com/shahiddhariwala */