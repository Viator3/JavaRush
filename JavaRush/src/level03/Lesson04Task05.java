package level03;
/* Sum of 10 numbers
Display the sum of numbers from 1 to 10 line by line (there should be 10 lines):
1
1 + 2 = 3
1 + 2 + 3 = 6
1 + 2 + 3 + 4 = 10
...
Example output:
1
3
6
10
...
*/

public class Lesson04Task05 {

	public static void main(String[] args) {
		int sum = 0;
        for (int num = 1; num < 11; num++) {
            System.out.println(sum += num);
        }

	}

}
