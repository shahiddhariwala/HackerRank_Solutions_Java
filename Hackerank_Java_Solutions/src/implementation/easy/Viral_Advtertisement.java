/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

public class Viral_Advtertisement
{
	static int viralAdvertising(int n)
	{
		int likes = 2;

		int shares = 5;
		for (int i = 2; i <= n; i++)
		{
			shares = (int) Math.floor(shares / 2) * 3;
			likes += shares / 2;

		}
		return likes;

	}
}

/* https://github.com/shahiddhariwala */