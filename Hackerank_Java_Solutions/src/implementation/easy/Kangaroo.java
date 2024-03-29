/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package implementation.easy;

import java.io.*;
import java.util.*;

public class Kangaroo
{

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2)
	{

		if ((x1 > x2 && v1 >= v2) || (x2 > x1 && v2 >= v1))
		{
			return "NO";
		}
		
		if(Math.abs(x2-x1)%Math.abs(v2-v1)==0)
            return "YES";
        else
            return "NO"; 
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);

		scanner.close();
	}
}

/* https://github.com/shahiddhariwala */