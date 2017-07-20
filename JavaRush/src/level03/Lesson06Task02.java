package level03;
/* Multiplication table
Display the multiplication table 10 to 10 in the following form:
1 2 3 ...
2 4 6 ...
3 6 9 ...
...
*/

public class Lesson06Task02 {

	public static void main(String[] args) {
		for (int num1 = 1; num1 < 11; num1++) {
            for (int num2 = 1; num2 < 11; num2++) {
                if (num2 != 10) System.out.print(num1 * num2 + " ");
                else System.out.println(num1 * num2);
            }
        }
	}

}
