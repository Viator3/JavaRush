package level03;
/* Implementation of the method
Implement the method public static void writeToConsole (String s), which adds to the beginning of the line the expression "printing:"
And displays the changed line on the screen, each time with a new line.
Example output for "Hello world!":
printing: Hello world!
*/

public class Lesson05Task02 {

	public static void main(String[] args) {
		writeToConsole("Hello world!");
	}
	
	public static void writeToConsole(String s)
    {
        System.out.println("printing: " + s);
    }
	
}
