/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 10-Jun-2020
*/


package implementation.easy;

import java.util.HashMap;

public class Sequence_Equation
{
    static int[] permutationEquation(int[] p) {
		HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<p.length;i++)
        {
            hm.put(p[i],i+1);
        }
        int x[] = new int[p.length];
        for(int i=1;i<=p.length;i++)
        {
            x[i-1] = hm.get(hm.get(i));
        }
    return x;
    }
}



/*https://github.com/shahiddhariwala*/