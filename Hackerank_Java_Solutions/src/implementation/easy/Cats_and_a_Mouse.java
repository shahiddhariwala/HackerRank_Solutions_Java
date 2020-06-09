/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 09-Jun-2020
*/


package implementation.easy;

public class Cats_and_a_Mouse
{
    static String catAndMouse(int x, int y, int z) {
    	int a = Math.abs(x-z);
    	int b = Math.abs(y-z);
    	if(a>b)
    	{
    		return "Cat B";
    	}
    	else if(b>a)
    	{
    		return "Cat A";
    	}
    	else
    	{
    		return "Mouse C";
    	}

    }

	public static void main(String[] args)
	{
		System.out.println(catAndMouse(1, 2, 3));
		System.out.println(catAndMouse(1, 3, 2));

	}

}



/*https://github.com/shahiddhariwala*/