/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 10-Jun-2020
*/

package implementation.medium;

import java.math.BigInteger;

public class Extra_Long_Factorials
{
	// Complete the extraLongFactorials function below.
	static void extraLongFactorials(int n)
	{
		BigInteger bi = BigInteger.valueOf(1);
		for (int i = 2; i <= n; i++)
		{
			bi = bi.multiply(BigInteger.valueOf(i));
		}
		System.out.println(bi);

	}

	public static void main(String[] args)
	{
		extraLongFactorials(25);
		// 15511210043330985984000000

	}

}

/* https://github.com/shahiddhariwala */