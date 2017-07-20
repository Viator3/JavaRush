package level04;
/* The nearest to 10
Implement the closeToTen method.
The method should display the nearest to 10 of the two numbers written in the arguments of the method.
For example, among the numbers 8 and 11 closest to ten 11.
If both numbers are at an equal length to 10, then display any of them.
Tip: use the public static int abs(int a) method, which returns the absolute value of the number.
*/

public class Lesson04Task02 {
	public static void main(String[] args)
    {
        closeToTen(8,11);
        closeToTen(14,7);
    }

    public static void closeToTen(int a, int b)
    {
        if (abs(a - 10) > abs(b - 10)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }

    public static int abs(int a)
    {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
