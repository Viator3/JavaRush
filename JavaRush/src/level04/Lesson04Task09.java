package level04;

import java.io.*;

/* Traffic light
The traffic light for pedestrians is programmed as follows:
At the beginning of each hour for three minutes a green signal is on,
Then within one minute - yellow, and then within one minute - red,
Then again three minutes are burning green, and so on.
Enter from the keyboard a real number t, 
meaning the time in minutes that has elapsed since the beginning of the next hour.
Determine the signal of what color is lit for pedestrians at this moment.
The result is displayed in the following form:
"Green" - if the green light is on, "yellow" - if the yellow color is lit,
"Red" - if the red color is on.
Example for number 2.5:
green
Example for number 3:
yellow
Example for number 4:
red
Example for number 5:
green
*/

public class Lesson04Task09 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());

        if (t % 5 >= 0 && t % 5 < 3) System.out.println("green");
        if (t % 5 >= 3 && t % 5 < 4) System.out.println("yellow");
        if (t % 5 >= 4 && t % 5 < 5) System.out.println("red");
    }
}
