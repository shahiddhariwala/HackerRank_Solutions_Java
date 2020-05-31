/*
Code by  : Shahid Dhariwala
LinkedIn : https://www.linkedin.com/in/shahiddhariwala/
Twitter  : https://twitter.com/shahiddhariwala
Date     : 31-May-2020
*/

package warmup.easy;
import java.util.List;
public class Grading_Students
{
	//TC : O(n)  SC: O(1)
	public static List<Integer> gradingStudents(List<Integer> grades)
	{
		for (int i = 0; i < grades.size(); i++)
		{
			int num = grades.get(i);
			if(num>=38)
			{
				int rem = num%5;
				if(rem >= 3)
				{
					grades.remove(i);
					grades.add(i,num-rem+5);
				}
			}
		}
		return grades;
	}
}

/* https://github.com/shahiddhariwala */