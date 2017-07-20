package level06.lesson11.bonus01;

import java.io.*;

/* You need to fix the program to compile and work
Task: The program enters two numbers from the keyboard and displays them maximum in the form "Max is 25"
*/

public class Solution {
	public static int max = 100;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String max = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }
}
