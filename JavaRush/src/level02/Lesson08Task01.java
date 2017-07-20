package level02;
/* A minimum of two numbers
Write a function that returns a minimum of two numbers.
Hint:
You need to write the body of the existing min function and fix the return value.
*/

public class Lesson08Task01 {
	
	public static int min(int a, int b)
    {
        if (a <= b) return a;
        else return b;
    }

	public static void main(String[] args) {
		System.out.println( min(12,33) );
        System.out.println( min(-20,0) );
        System.out.println( min(-10,-20) );
	}

}
