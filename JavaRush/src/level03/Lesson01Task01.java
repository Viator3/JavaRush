package level03;
/* Implementation of the method
Implement the method public static void div (int a, int b).
The method must divide the first number by the second, and display the result of dividing a / b.
*/

public class Lesson01Task01 {

	public static void main(String[] args) {
		div(6,3);
        div(10,6);
        div(2,4);
	}
	
	public static void div(int a, int b){
        double res = (double) a / b;
        System.out.println(res);
    }
	
}
