/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 01-Jun-2020
*/

package search.medium;

import java.util.HashSet;

public class Pairs
{
	// Complete the pairs function below.
	static int pairs(int k, int[] arr)
	{
		HashSet<Integer> hs = new HashSet<>();
		int count = 0;
		for (int a : arr)
		{
			hs.add(a);
		}

		for (int i : arr)
		{
			int temp = i + k;
			if (hs.contains(temp))
			{
				count++;
			}
			temp = i - k;
			if (hs.contains(temp))
			{
				count++;
			}
			hs.remove(i);
		}
		return count;

	}
}

/* https://github.com/shahiddhariwala */