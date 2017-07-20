package level10.lesson04.task01;
/* Task number 1 for the conversion of integer types
Arrange the correct cast operators correctly to get the answer: d> 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a * b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
*/

public class Solution {
	public static void main(String[] args)
    {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (short) 1234.15;
        long d = (char) (a + f / c + b);
        System.out.println(d);
    }
}
