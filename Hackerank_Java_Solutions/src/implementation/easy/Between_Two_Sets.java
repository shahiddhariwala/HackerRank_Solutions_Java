/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Between_Two_Sets
{
	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 * 1. INTEGER_ARRAY a
	 * 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b)
	{
		// Write your code here
		 List<Integer> factorsOfArrayB = new ArrayList<Integer>();
         List<Integer> factorsFromArrayA = new ArrayList<Integer>();
         
            //numbers which are factors of b arraylist and less thanb or equal to minOf(b)
            for(int i=1;i<=Collections.min(b);i++)
            {
                int temp=0;
                for(int j=0;j<b.size();j++)
                {
                     if(b.get(j)%i!=0)
                         continue;
                     else
                         temp++;
                }
                if(temp==b.size())
                     factorsOfArrayB.add(i);

            }
            
        // System.out.println(factorsOfArrayB);
         //numbers from array A which are factors of 'factorsOfArrayB' :P
         for(int i=0;i<factorsOfArrayB.size();i++)
            {
                int temp=0;
                for(int j=0;j<a.size();j++)
                {
                     if(factorsOfArrayB.get(i)%a.get(j)!=0)
                         continue;
                     else
                         temp++;
                }
                if(temp==a.size())
                     factorsFromArrayA.add(i);

            }
         return factorsFromArrayA.size();
	}
}

/* https://github.com/shahiddhariwala */