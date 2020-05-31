/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

import java.util.List;

public class Bon_Apetit
{
	static void bonAppetit(List<Integer> bill, int k, int b)
	{
		int sum = 0;
		for (int i : bill)
		{
			sum += i;
		}
		sum =sum-bill.get(k);
		if(b==(sum/2))
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(b-(sum/2));
		}
	}
}

/* https://github.com/shahiddhariwala */