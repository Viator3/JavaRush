package level02;
/* Implementation of the method
Implement the print method. The method should display the transmitted string 4 times. Every time with a new line.
*/

public class Lesson01Task01 {

	public static void main(String[] args) {
		print("Java easy to learn!");
	}
	
	public static void print(String s)
    {
        for (int i = 0; i < 4; i++) {
            System.out.println(s);
        }
    }
}
