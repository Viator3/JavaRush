package level04;
/* Draw a triangle
Using the for loop, display a rectangular triangle of eight with sides 10 and 10.
Example:
8
88
888
...
*/

public class Lesson13Task03 {
	public static void main(String[] args) throws Exception
    {
        for (int x = 1; x < 11; x++) {
            for (int y = 0; y != x; y++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
