package level09.lesson11.home03;

import java.io.*;
import java.io.IOException;
import java.util.*;

/* Method in try..catch
Enter numbers from the keyboard.
The code for reading numbers from the keyboard is put into a separate readData method.
Wrap the whole body (all the code inside readData, except for the declaration of the list, 
where the numbers and BufferedReader - a) this method in try..catch.
If the user entered some text, instead of entering a number, then the method should catch an exception
And display all entered numbers as a result.
Numbers output from a new line preserving the order of input.
*/

public class Solution {
	public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
        List<Integer> integers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                integers.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (NumberFormatException e) {
            for (int num : integers) {
                System.out.println(num);
            }
        }
    }
}
