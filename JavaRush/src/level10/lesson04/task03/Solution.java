package level10.lesson04.task03;
/* Task # 3 for the conversion of integer types
Add one type conversion operation to get the answer: b = 0
float f = (float) 128.50;
int i = (int) f;
int b = (int) (i + f);
*/

public class Solution {
	public static void main(String[] args)
    {
        float f = (float)128.50;
        int i = (int)f;
        int b = (byte)(int)(i + f);

        System.out.println(b);
    }
}
