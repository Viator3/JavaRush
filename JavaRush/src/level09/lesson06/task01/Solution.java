package level09.lesson06.task01;
/* Exception while working with numbers
To catch an exception (and display it on the screen), specifying its type, 
which occurs when the code is executed:
int a = 42/0;
*/
public class Solution {
	public static void main(String[] args) throws Exception {
		try {
			@SuppressWarnings("unused")
			int a = 42 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
