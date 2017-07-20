package level10.lesson11.home01;
/* Correct answer: d = 2.941
Add one operation to convert the type to get the answer: d = 2.941.
Output example: 2.9411764705882355
*/

public class Solution {
	public static void main(String[] args)
    {
        int a = 50;
        int b = 17;
        //double d = a / b;
        double d = (double)a / b;
        System.out.println(d);
    }
}
