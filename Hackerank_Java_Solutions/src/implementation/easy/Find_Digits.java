/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 10-Jun-2020
*/

package implementation.easy;

public class Find_Digits
{
	static int findDigits(int n)
	{
		int ans = 0;
		int temp = n;
		int digit = 0;
		while (temp > 0)
		{
			digit = temp % 10;
			if (digit != 0 && n % digit == 0)
			{
				ans++;
			}
			temp = temp / 10;
		}

		return ans;
	}
}

/* https://github.com/shahiddhariwala */