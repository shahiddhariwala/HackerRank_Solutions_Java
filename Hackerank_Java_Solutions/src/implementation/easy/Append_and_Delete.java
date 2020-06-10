/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 10-Jun-2020
*/

package implementation.easy;

public class Append_and_Delete
{
	// Complete the appendAndDelete function below.
	static String appendAndDelete(String s, String t, int k)
	{
		int remCount = 0;
		int i = 0;
		int j = 0;
		while (i != s.length() && j != t.length())
		{
			if (s.charAt(i) == t.charAt(j))
			{
				i++;
				j++;
			} else
			{
				break;
			}
		}
		remCount = k - ((s.length() - i) + (t.length() - j));
		if (remCount < 0)
		{
			return "No";
		} else if (remCount == 0)
		{
			return "Yes";
		} else
		{
			if (remCount % 2 == 0)
			{
				return "Yes";
			} else
			{
				if (remCount >= 2 * i)
					return "Yes";
				return "No";
			}
		}
	}

}

/* https://github.com/shahiddhariwala */