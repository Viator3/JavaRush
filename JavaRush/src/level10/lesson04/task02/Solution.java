package level10.lesson04.task02;
/* Task number 2 for the conversion of integer types
Arrange the cast operators correctly to get the answer: d = 3.765
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;
*/

public class Solution {
	public static void main(String[] args)
    {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
