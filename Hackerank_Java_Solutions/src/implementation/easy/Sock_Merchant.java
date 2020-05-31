/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

import java.util.HashSet;

public class Sock_Merchant
{
	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar)
	{
		int count = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < ar.length; i++)
		{
			if(set.contains(ar[i]))
			{
				count++;
				set.remove(ar[i]);
			}
			else
			{
				set.add(ar[i]);
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		System.out.println(sockMerchant(9, new int[]
		{ 10, 20, 20, 10, 10, 30, 50, 10, 20 }));
	}

}

/* https://github.com/shahiddhariwala */