/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

public class Day_Of_The_Programmer
{
	static String dayOfProgrammer(int year)
	{
		if ((year % 4 == 0 && year <= 1917)
				|| (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year >= 1919))
			return "12.09." + year;
		else if (year == 1918)
			return "26.09.1918";
		else
			return "13.09." + year;

	}
}

/* https://github.com/shahiddhariwala */