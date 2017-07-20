package level04;
/* 10 numbers, vice versa
Display numbers from 10 to 1 using the while loop.
*/

public class Lesson10Task02 {
	public static void main(String[] args) throws Exception
    {
        int num = 10;
        while (num > 0) {
            System.out.println(num--);
        }
    }
}
