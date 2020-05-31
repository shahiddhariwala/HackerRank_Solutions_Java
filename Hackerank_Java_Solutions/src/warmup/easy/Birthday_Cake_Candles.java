/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;

import java.util.Arrays;

public class Birthday_Cake_Candles
{
	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar)
	{
		int count = 1;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++)
		{
			if (max == ar[i])
			{
				count++;
			} else if (max < ar[i])
			{
				count = 1;
				max = ar[i];
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		System.out.println(birthdayCakeCandles(new int[] {3,2,1,3}));
	}
}

/* https://github.com/shahiddhariwala */