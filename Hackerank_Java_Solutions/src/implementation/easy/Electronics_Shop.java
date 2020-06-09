/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

public class Electronics_Shop
{
	static int getMoneySpent(int[] keyboards, int[] drives, int b)
	{
		int max=-1;
		for (int i = 0; i < keyboards.length; i++)
		{
			for (int j = 0; j < drives.length; j++)
			{
				if(keyboards[i]+drives[j]<=b)
				{
					max = max < keyboards[i]+drives[j] ? keyboards[i]+drives[j] : max;
				}
			}
		}
		return max;
		
	}

	public static void main(String[] args)
	{
		System.out.println(getMoneySpent(new int[]
		{ 3, 1 }, new int[]
		{ 5, 2, 8 }, 10));
		System.out.println(getMoneySpent(new int[]
		{ 4 }, new int[]
		{ 5 }, 5));
	}

}

/* https://github.com/shahiddhariwala */