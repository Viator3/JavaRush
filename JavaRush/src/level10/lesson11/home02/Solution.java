package level10.lesson11.home02;
/* Correct answer: d = 5.5
Add one operation to convert the type to get the answer: d = 5.5.
*/

public class Solution {
	public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        //double d = a + b/c/e;
        double d = a + b / c / (double)e;
        System.out.println(d);
    }
}
