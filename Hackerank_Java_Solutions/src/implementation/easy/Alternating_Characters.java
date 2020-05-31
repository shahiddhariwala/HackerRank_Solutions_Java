/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 01-Jun-2020
*/

package implementation.easy;

import java.util.Stack;

public class Alternating_Characters
{
	static int alternatingCharacters(String s)
	{
		int count = 0;

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray())
		{
			if (!stack.isEmpty())
			{
				if (stack.peek() == c)
				{
					count++;
					continue;
				}
			}
			stack.push(c);

		}
		return count;

	}
}

/* https://github.com/shahiddhariwala */