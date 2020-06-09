/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

import java.util.Arrays;

public class The_Hurdle_Race
{
	static int hurdleRace(int k, int[] height)
	{
		int max = 0;
		for (int el : height)
		{
			max = max < el ? el : max;
		}
		if(k>=max)
		{
			return 0;
		}
		return max-k;

	}

	public static void main(String[] args)
	{
		System.out.println(hurdleRace(7, new int[]
		{ 2, 5, 4, 5, 2 }));
		System.out.println(hurdleRace(4, new int[]
		{ 1, 6, 3, 5, 2 }));

	}

}

/* https://github.com/shahiddhariwala */