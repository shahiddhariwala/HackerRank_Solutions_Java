/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 01-Jun-2020
*/

package implementation.easy;

public class Drawing_Book
{

	static int pageCount(int n, int p)
	{
		int fromLeft = p / 2;
		int fromRight = n / 2 - p / 2;
		return Math.min(fromLeft, fromRight);
	}

	public static void main(String[] args)
	{
		System.out.println(pageCount(6, 2));
		System.out.println(pageCount(5, 4));
	}

}

/* https://github.com/shahiddhariwala */