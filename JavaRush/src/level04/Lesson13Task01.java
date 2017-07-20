package level04;
/* Even numbers
Using the for loop to display even numbers from 1 to 100 inclusive.
Through a space or from a new line.
*/

public class Lesson13Task01 {
	public static void main(String[] args) throws Exception
    {
        for(int num = 1; num <= 100; num++) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
    }
}
