package level09.lesson11.home01;
/* Division by zero
Create a method public static void divisionByZero, 
in which divide any number by zero and display the result of division.
Wrap the divisionByZero method call in try..catch. 
Output the exception stack stack using the exception.printStackTrace() method
*/

public class Solution {
	public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
    }

    public static void divisionByZero() {
        int num = 20 / 0;
        System.out.println(num);
    }
}
