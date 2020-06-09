/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.easy;

public class Designer_PDF_Viewer
{
	static int designerPdfViewer(int[] h, String word)
	{
		int len = 0;
		for (char ch : word.toCharArray())
		{
			len = len < h[ch - 'a'] ? h[ch - 'a'] : len;
		}
		return len * word.length();
	}

	public static void main(String[] args)
	{
		System.out.println(designerPdfViewer(new int[]
		{ 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7 }, "zaba"));
	}
}

/* https://github.com/shahiddhariwala */