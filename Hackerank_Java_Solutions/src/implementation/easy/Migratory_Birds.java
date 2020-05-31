/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

import java.util.List;

public class Migratory_Birds
{
	static int migratoryBirds(List<Integer> arr)
	{

		int birdCount[] = new int[6];
		int max=0;
		int maxBird=0;
		for(int b : arr)
		{
			birdCount[b]++;
		}
		
		for(int i=1;i<=5;i++)
		{
			if(birdCount[i]>max)
			{
				max=birdCount[i];
				maxBird=i;
			}
		}
		return maxBird;
		
	}

}

/* https://github.com/shahiddhariwala */