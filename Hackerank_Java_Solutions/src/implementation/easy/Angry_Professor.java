/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

public class Angry_Professor
{
	// Complete the angryProfessor function below.
	static String angryProfessor(int k, int[] a)
	{

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] <= 0)
			{
				k--;
			}
		}
		return k <= 0 ? "NO" : "YES";
	}
}

/* https://github.com/shahiddhariwala */