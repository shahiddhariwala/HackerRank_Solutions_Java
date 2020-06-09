/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

public class Beautiful_Day_At_Movies
{// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k)
	{
		int count = 0;
		for (int x = i; x <= j; x++)
		{
			if (Math.abs(x - reverse(x)) % k == 0)
				count++;
		}
		return count;
	}

	private static int reverse(int i)
	{
		int num=0;
		while(i!=0)
		{
			num = (num*10) + (i%10);
			i=i/10;
		}
		
		return num;
	}

	public static void main(String[] args)
	{
		System.out.println(beautifulDays(20, 23, 6));
	}

}

/* https://github.com/shahiddhariwala */