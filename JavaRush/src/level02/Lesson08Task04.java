package level02;
/* At least four numbers
Write a function that computes a minimum of four numbers.
The function min (a, b, c, d) should use (call) the function min (a, b)
Hint:
You need to write the body of both existing min functions and fix their return values.
*/

public class Lesson08Task04 {
	
	public static int min(int a, int b, int c, int d)
    {
        if (min(a, b) <= c) {
            if (min(a, b) <= d) return min(a, b);
            else return d;
        } else {
            if (c <= d) return c;
            else return d;
        }
    }

    public static int min(int a, int b)
    {
        if (a <= b) return a;
        else return b;
    }

	public static void main(String[] args) {
		System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
	}

}
