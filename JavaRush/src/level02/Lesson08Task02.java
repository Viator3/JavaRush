package level02;
/* Maximum of two numbers
Write a function that calculates a maximum of two numbers.
Hint:
You need to write the body of the existing max function and fix the return value.
*/

public class Lesson08Task02 {
	
	 public static int max(int a, int b)
	    {
	        if (a >= b) return a;
	        else return b;
	    }

	public static void main(String[] args) {
		System.out.println( max(10,20) );
        System.out.println( max(-10,-20) );
        System.out.println( max(-100,0) );
	}

}
