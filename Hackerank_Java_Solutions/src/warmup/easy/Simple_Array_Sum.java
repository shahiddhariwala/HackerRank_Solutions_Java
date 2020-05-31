/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

/*
 * Given an array of integers, find the sum of its elements.

For example, if the array , , so return .

Function Description

Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):

ar: an array of integers
Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.

Constraints


Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11
Sample Output

31

 */

package warmup.easy;

public class Simple_Array_Sum
{
	static int simpleArraySum(int[] ar)
	{
		int sum = 0;
		for (int i = 0; i < ar.length; i++)
		{
			sum += ar[i];
		}
		return sum;

	}

	public static void main(String[] args)
	{

	}

}

/* https://github.com/shahiddhariwala */