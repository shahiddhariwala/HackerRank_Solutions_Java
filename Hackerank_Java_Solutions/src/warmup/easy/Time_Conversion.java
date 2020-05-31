/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;

public class Time_Conversion
{
	static String timeConversion(String s)
	{
		String time[] = s.split(":");
		String sec = time[2].substring(0, 2);
		String min = time[1];
		int hr = Integer.parseInt(time[0]);
		if (time[2].charAt(2) == 'P')
		{
			// Its PM
			if (hr != 12)
			{
				hr += 12;
			}
		} else
		{

			if (hr == 12)
			{// its AM and its 12 AM
				hr = 0;
			}
		}
		return (hr < 10 ? 0 + "" + hr : hr) + ":" + min + ":" + sec;
	}

	public static void main(String[] args)
	{
		System.out.println(timeConversion("12:05:45AM"));

	}

}

/* https://github.com/shahiddhariwala */