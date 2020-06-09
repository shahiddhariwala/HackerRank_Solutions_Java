/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Picking_Numbers
{
	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : a)
		{
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		int max = 0;
		for (int key : hm.keySet())
		{
			int temp = hm.get(key) + hm.getOrDefault(key + 1, 0);
			if (temp > max)
			{
				max = temp;
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		System.out.println(pickingNumbers(Arrays.asList(new Integer[]
		{ 1, 2, 2, 3, 1, 2 })));
		System.out.println(pickingNumbers(Arrays.asList(new Integer[]
		{ 4, 6, 5, 3, 3, 1 })));

	}

}

/* https://github.com/shahiddhariwala */