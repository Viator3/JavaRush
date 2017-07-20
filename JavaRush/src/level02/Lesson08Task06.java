package level02;
/* Display text on the screen
Write a function that prints the transmitted string (word) to the screen three times, but in one line.
Words must be separated by a space and should not merge into one.
*/

public class Lesson08Task06 {
	
	public static void print3(String s)
    {
        System.out.println(s + " " + s + " " + s);
    }

	public static void main(String[] args) {
		print3("window");
        print3("file");
	}

}
