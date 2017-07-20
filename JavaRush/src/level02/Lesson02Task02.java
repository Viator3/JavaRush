package level02;
/* Subtraction of numbers
Implement the method public static int subtraction (int a, int b). The method returns the subtraction result from the number a of the number b.
*/

public class Lesson02Task02 {

	public static void main(String[] args) {
		int c = subtraction(10,5);
        System.out.println(c);
	}
	
	public static int subtraction(int a, int b)
    {
        return (a - b);
    }
}
