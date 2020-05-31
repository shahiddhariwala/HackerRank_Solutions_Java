/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;

public class Plus_Minus
{
	static void plusMinus(int[] arr)
	{
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for (int num : arr)
		{
			if (num > 0)
			{
				pos++;
			} else if (num < 0)
			{
				neg++;
			} else
			{
				zero++;
			}
		}
		int len = arr.length;
		double p = pos / (double) len;
		System.out.printf("%.6f\n", p);
		double n = neg / (double) len;
		System.out.printf("%.6f\n", n);
		double z = zero / (double) len;
		System.out.printf("%.6f\n", z);

	}

	public static void main(String[] args)
	{
		plusMinus(new int[]
		{ -4, 3, -9, 0, 4, 1 });
	}
}

/* https://github.com/shahiddhariwala */