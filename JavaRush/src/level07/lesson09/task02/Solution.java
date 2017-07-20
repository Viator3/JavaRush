package level07.lesson09.task02;

import java.io.*;
import java.util.ArrayList;

/* Words in reverse order
Enter 5 words from the keyboard into the list of lines.
Delete the 3rd item in the list, and output the remaining elements in the reverse order.
*/

public class Solution {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        
        for (int num = 0; num < 5; num++) {
            list.add(reader.readLine());
        }
        
        list.remove(2);
        
        for (int num = 1; num <= list.size(); num++) {
            System.out.println(list.get(list.size() - num));
        }
    }
}
