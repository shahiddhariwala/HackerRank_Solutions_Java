/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 01-Jun-2020
*/

package strings.easy;

import java.util.HashSet;

public class Two_Strings
{
	static String twoStrings(String s1, String s2)
	{
		HashSet<Character> hs = new HashSet<>();
		for (char c : s2.toCharArray())
		{
			hs.add(c);
		}
		for (int i = 0; i < s1.length(); i++)
		{
			if (hs.contains(s1.charAt(i)))
			{
				return "YES";
			}
		}
		return "NO";
	}
}

/* https://github.com/shahiddhariwala */