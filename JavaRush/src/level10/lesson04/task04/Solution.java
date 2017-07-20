package level10.lesson04.task04;
/* Problem # 4 for the conversion of integer types
Add one operation for the type conversion to get the answer: nine = 9
short number = 9;
char zero = '0';
int nine = (zero + number);
*/

public class Solution {
	public static void main(String[] args)
    {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char)nine);
    }
}
