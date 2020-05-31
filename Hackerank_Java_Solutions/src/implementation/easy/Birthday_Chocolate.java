/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

import java.util.List;

public class Birthday_Chocolate
{
	static int birthday(List<Integer> s, int d, int m)
	{

		int count = 0;
		int sum = 0;

		for (int i = 0; i < s.size(); i++)
		{
			sum += s.get(i);
			if (i >= m-1)
			{
				if(sum==d)
				{
					count++;
				}
				sum=sum-s.get(i-m+1);
			}
			
		}

		return count;

	}
}

/* https://github.com/shahiddhariwala */