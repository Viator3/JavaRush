package level04;
/* Less than 5
Implement the compare (int a) method. The method should print a line to the "Number less than 5" screen,
If the method parameter is less than 5,
Output the string "Number greater than 5" if the method parameter is greater than 5,
And print the line "Number is 5" if the method parameter is 5.
*/

public class Lesson04Task01 {
	public static void main(String[] args)
    {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a)
    {
        if (a > 5) {
            System.out.println("Number greater than 5");
        } else {
            if (a < 5) {
                System.out.println("Number less than 5");
            } else {
                System.out.println("Number is 5");
            }
        }
    }
}
