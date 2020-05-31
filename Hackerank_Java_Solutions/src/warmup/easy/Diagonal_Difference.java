/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;
import java.util.*;
public class Diagonal_Difference
{
	public static int diagonalDifference(List<List<Integer>> arr)
	{
		int pD = 0;
		int sD = 0;
		
		for(int i=0;i<arr.size();i++)
		{
			pD+= arr.get(i).get(i);
			sD+= arr.get(i).get(arr.size()-i-1);
		}
		return Math.abs(pD-sD);

	}
}

/* https://github.com/shahiddhariwala */