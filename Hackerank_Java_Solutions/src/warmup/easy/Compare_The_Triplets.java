/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_The_Triplets
{
	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
	{
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < a.size(); i++)
		{
			if (a.get(i) > b.get(i))
			{
				alice++;
			} else if (a.get(i) < b.get(i))
			{
				bob++;
			}

		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(alice);
		al.add(bob);
		return al;
	}
}

/* https://github.com/shahiddhariwala */