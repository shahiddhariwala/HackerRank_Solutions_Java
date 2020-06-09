/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/

package implementation.medium;

public class Forming_A_Magic_Square
{
	static int formingMagicSquare(int[][] s)
	{/*
		 * if you want to remember, then simply remember few facts or property.
		 * 
		 * centroid element of the matrix will be 5;
		 * corners will be any permutations of even numbers between 1..N such that sum
		 * of primary diagonal and secondary daigonal should be equal and 15;
		 * remaining 4 positions can be easily filled out by remaining permutaions of
		 * numbers;
		 * you will get a seed magic square matrix which you can mirror or rotate in a
		 * specific symmetry to get other 7 magic squares.
		 */
		int cost = Integer.MAX_VALUE;
		int t[][] =
		{
				{ 4, 9, 2, 3, 5, 7, 8, 1, 6 },
				{ 4, 3, 8, 9, 5, 1, 2, 7, 6 },
				{ 2, 9, 4, 7, 5, 3, 6, 1, 8 },
				{ 2, 7, 6, 9, 5, 1, 4, 3, 8 },
				{ 8, 1, 6, 3, 5, 7, 4, 9, 2 },
				{ 8, 3, 4, 1, 5, 9, 6, 7, 2 },
				{ 6, 7, 2, 1, 5, 9, 8, 3, 4 },
				{ 6, 1, 8, 7, 5, 3, 2, 9, 4 }, };
		int temp = 0;
		for (int i = 0; i < 8; i++)
		{
			temp = Math.abs(s[0][0] - t[i][0]) + Math.abs(s[0][1] - t[i][1]) + Math.abs(s[0][2] - t[i][2])
					+ Math.abs(s[1][0] - t[i][3]) + Math.abs(s[1][1] - t[i][4]) + Math.abs(s[1][2] - t[i][5])
					+ Math.abs(s[2][0] - t[i][6]) + Math.abs(s[2][1] - t[i][7]) + Math.abs(s[2][2] - t[i][8]);
			cost = temp < cost ? temp : cost;
		}
		return cost;

	}

	public static void main(String[] args)
	{
		System.out.println(formingMagicSquare(new int[][]
		{
				{ 4, 8, 2 },
				{ 4, 5, 7 },
				{ 6, 1, 6 } }));

	}

}

/* https://github.com/shahiddhariwala */