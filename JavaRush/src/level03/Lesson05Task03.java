package level03;
/* Time converter
Add the public static int convertToSeconds (int hour) method that will convert the clock to seconds.
Call it twice in the main method with any parameters. Output the results on the screen, each time with a new line.
*/

public class Lesson05Task03 {

	public static int convertToSeconds(int hour) {
        int sec = hour * 60 * 60;
        return sec;
    }
	
	public static void main(String[] args) {
		System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(1));
	}
	
}
