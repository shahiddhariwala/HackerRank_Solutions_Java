/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 10-Jun-2020
*/

package implementation.easy;

public class Jumping_On_the_Clouds_Revisited
{
	static int jumpingOnClouds(int[] c, int k)
	{
		int i = 0;
		int n = c.length;
		int pow = 100;
		while (pow != 0)
		{
			i = (i + k) % n;

			if (c[i] == 1)
			{
				pow -= 2;
			}
			pow -= 1;
			if (i == 0)
			{
				return pow;
			}

		}
		return pow;
	}
}

/* https://github.com/shahiddhariwala */