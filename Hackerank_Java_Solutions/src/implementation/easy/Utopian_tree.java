/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

public class Utopian_tree
{
	// Complete the utopianTree function below.
	static int utopianTree(int n)
	{
		int height = 1;
		for(int i=1;i<=n;i++)
		{
			if((i&1)==1)
			{
				height = height * 2;
			}
			else
			{
				height+=1;
			}
		}
		return height;

	}

	public static void main(String[] args)
	{
		System.out.println(utopianTree(0));
		System.out.println(utopianTree(1));
		System.out.println(utopianTree(4));
		System.out.println(utopianTree(5));

	}

}

/* https://github.com/shahiddhariwala */