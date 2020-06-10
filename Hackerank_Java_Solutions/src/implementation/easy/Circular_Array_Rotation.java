/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 10-Jun-2020
*/

package implementation.easy;

public class Circular_Array_Rotation
{
	static int[] circularArrayRotation(int[] a, int k, int[] queries)
	{
		int ans[] = new int[queries.length];
		int newArray[] = new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			int newIndex = (i + k) % a.length;
			newArray[newIndex] = a[i];
		}
		for (int i = 0; i < queries.length; i++)
		{
			ans[i] = newArray[queries[i]];
		}
		return ans;
	}
}

/* https://github.com/shahiddhariwala */