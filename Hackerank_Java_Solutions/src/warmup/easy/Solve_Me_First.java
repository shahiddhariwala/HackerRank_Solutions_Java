/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

/*
 * Complete the function solveMeFirst to compute the sum of two integers.

Function prototype:

int solveMeFirst(int a, int b);

where,

a is the first integer input.
b is the second integer input
Return values

sum of the above two integers
Sample Input

a = 2
b = 3
Sample Output

5
Explanation

The sum of the two integers  and  is computed as: .
 */
package warmup.easy;

import java.util.Scanner;

public class Solve_Me_First
{

	static int solveMeFirst(int a, int b)
	{
		return a+b;
	}

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a;
	        a = in.nextInt();
	        int b;
	        b = in.nextInt();
	        int sum;
	        sum = solveMeFirst(a, b);
	        System.out.println(sum);
	   }

}

/* https://github.com/shahiddhariwala */