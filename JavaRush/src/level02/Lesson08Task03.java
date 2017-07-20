package level02;
/* A minimum of three numbers
Write a function that computes a minimum of three numbers.
Hint:
You need to write the body of the existing min function and fix the return value.
*/

public class Lesson08Task03 {
	
	public static int min(int a, int b, int c)
    {
        if (a <= b) {
            if (a <= c) return a;
            else return c;
        } else {
            if (b <= c) return b;
            else return c;
        }
    }

	public static void main(String[] args) {
		System.out.println( min(1,2,3) );
        System.out.println( min(-1,-2,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
	}

}
