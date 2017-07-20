package level02;
/* Duplicate string
Write a function that prints the transmitted string to the screen three times, each time with a new line.
*/

public class Lesson08Task05 {
	
	 public static void print3(String s)
	    {
	        for (int num = 0; num < 3; num++) {
	            System.out.println(s);
	        }
	    }

	public static void main(String[] args) {
		 print3("I love you!");
	}

}
