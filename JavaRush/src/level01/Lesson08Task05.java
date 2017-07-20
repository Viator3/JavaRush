package level01;
/* Method invocation
Write a program that calls the sum method with parameters 2 and 2
*/

public class Lesson08Task05 {

	public static void main(String[] args) {
		sum(2,2);
	}
	
	public static void sum(int a, int b)
    {
        int c = a + b;
        System.out.print(c);
    }
}
