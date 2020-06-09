/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

public class Save_The_Prisoner
{
	static int saveThePrisoner(int n, int m, int s)
	{
		return ((s - 1) + (m - 1)) % n + 1;
	}
}

/* https://github.com/shahiddhariwala */