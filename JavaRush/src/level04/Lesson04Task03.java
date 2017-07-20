package level04;
/* Interval
Implement the checkInterval(int a) method. 
The method should check whether an integer in the range from 50 to 100
And report the result to the screen in the 
following form: "The number a is not contained in the interval."
Or "The number a is contained in the interval.",
Where a is the argument of the method.
Example for number 112:
The number 112 is not in the interval.
Example for the number 60:
The number 60 is contained in the interval.
*/

public class Lesson04Task03 {
	public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a){
        if (a >= 50 && a <= 100) {
            System.out.println("The number " + a + " is contained in the interval.");
        } else {
            System.out.println("The number " + a + " is not in the interval.");
        }
    }
}
