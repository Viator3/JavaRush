package level04;
/* Multiplication table
Display the multiplication table 10x10 using the while loop.
The numbers are separated by a space.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Lesson10Task05 {
	public static void main(String[] args) throws Exception
    {
        int x = 0;
        while (x++ < 10) {
            int y = 0;
            while (y++ < 10) {
                System.out.print(x * y + " ");
            }
            System.out.println();
        }
    }
}
