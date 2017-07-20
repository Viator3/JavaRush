package level09.lesson06.task04;

import java.util.ArrayList;

/* Exception when working with collections List
To catch an exception (and display it on the screen), specifying its type, 
which occurs when the code is executed:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
*/
public class Solution {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (Exception e) {
                System.out.println(e.getClass() + " : " + e.getMessage());
        }
    }
}
