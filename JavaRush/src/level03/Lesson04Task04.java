package level03;
/* The product of 10 numbers
Display the product of 10 numbers from 1 to 10. The result is 1 number.
Hint: there will be three million with a tail.
*/

public class Lesson04Task04 {

	public static void main(String[] args) {
		long sum = 1;
        for (int num = 2; num < 11; num++) {
            sum *= num;
        }
        System.out.println(sum);
	}

}
