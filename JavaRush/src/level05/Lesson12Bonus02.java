package level05;

import java.io.*;

/* You need to add new functionality to the program
Task: The program enters two numbers from the keyboard and displays the minimum of them on the screen.
New task: The program enters five numbers from the keyboard and displays the minimum 
of them on the screen.
*/

public class Lesson12Bonus02 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numList = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            numList[i] = num;
        }

        int minimum = min(numList);
        System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] numList) {
        int min = numList[0];
        for (int num : numList) {
            if (num < min) min = num;
        }
        return min;
    }

}
