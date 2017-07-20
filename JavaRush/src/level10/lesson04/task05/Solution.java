package level10.lesson04.task05;
/* Problem # 5 for the conversion of integer types
Arrange the cast operators correctly to get the answer: c = 256
int a = (byte) 44;
int b = (byte) 300;
short c = (byte) (b - a);
*/

public class Solution {
	public static void main(String[] args)
    {
        int a = (byte)44;
        int b = 300;
        short c = (short) (b - (byte)a);
        System.out.println(c);
    }
}
