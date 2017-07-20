package level00;
/* Exchange
Uncomment some lines so that the program displays numbers 12 and 2 (first 12, and then 2).
*/

public class Lesson07Task02 {
	
	public static void main(String[] args) {
		
        int x = 2;
        int y = 12;

        //x = x * 3;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
