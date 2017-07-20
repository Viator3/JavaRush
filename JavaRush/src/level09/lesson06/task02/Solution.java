package level09.lesson06.task02;
/* Exception while working with strings
To catch an exception (and display it on the screen), specifying its type, 
which occurs when the code is executed:
String s = null;
String m = s.toLowerCase();
*/
public class Solution {
	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) throws Exception {
        try {
        	String s = null;
        	String m = s.toLowerCase();
        }
        catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
