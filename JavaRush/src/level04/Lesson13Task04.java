package level04;
/* Draw lines
Using the for loop to display:
- a horizontal line of 10 eights
- a vertical line of 10 eights.
*/

public class Lesson13Task04 {
	public static void main(String[] args) throws Exception
    {
        for (int x = 0; x < 9; x++) {
            System.out.print("8");
        }
        for (int x = 0; x < 11; x++) {
            System.out.println("8");
        }
    }
}
