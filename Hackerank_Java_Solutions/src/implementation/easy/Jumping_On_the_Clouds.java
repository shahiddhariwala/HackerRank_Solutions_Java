/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 01-Jun-2020
*/

package implementation.easy;

public class Jumping_On_the_Clouds
{
	static int jumpingOnClouds(int[] c)
	{
		int steps = 0;
		int i = 0;
		while (i < c.length - 2)
		{
			if (c[i + 2] != 1)
			{

				i = i + 2;
			} else
			{
				i = i + 1;
			}
			steps++;
		}
		return i == c.length - 1 ? steps : steps + 1;
	}

	public static void main(String[] args)
	{
		System.out.println(jumpingOnClouds(new int[]
		{ 0, 0, 1, 0, 0, 1, 0 }));
	}

}

/* https://github.com/shahiddhariwala */