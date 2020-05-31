/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;

public class Staircase
{
	// Complete the staircase function below.
	static void staircase(int n)
	{

		for (int row = 1, nsp = n - 1, nst = 1; row <= n; row++)
		{
			for (int csp = 0; csp < nsp; csp++)
			{
				System.out.print(" ");
			}
			for (int cst = 0; cst < nst; cst++)
			{
				System.out.print("#");

			}
			nsp--;
			nst++;
			System.out.println();
		}

	}

	public static void main(String[] args)
	{
		staircase(6);
		staircase(4);

	}

}

/* https://github.com/shahiddhariwala */