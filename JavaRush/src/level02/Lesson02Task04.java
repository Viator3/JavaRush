package level02;
/* Salary increase
Implement the method public static void salary (int a).
The method should increase the transmitted number by 100 and display on the screen the inscription:
 "Your salary is: a dollar a month."
Where a is a number that is increased by 100.
Example output to the screen for a = 700:
Your salary is: $ 800 per month.
*/

public class Lesson02Task04 {

	public static void main(String[] args) {
		salary(700);
	}
	
	public static void salary(int a)
    {
        System.out.println("Your salary is: " + (a + 100) + " dollar a month.");
    }
}
