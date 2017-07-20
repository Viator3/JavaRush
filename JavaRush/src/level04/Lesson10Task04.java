package level04;
/* S-square
Display a square of 10x10 letters S using the while loop.
The letters in each line can not be separated.
*/

public class Lesson10Task04 {
	public static void main(String[] args) throws Exception
    {
        int x = 0;
        while (x++ < 10) {
            int y = 0;
            while (y++ < 10) {
                System.out.print("S");
            }
            System.out.println();
        }
    }
}
