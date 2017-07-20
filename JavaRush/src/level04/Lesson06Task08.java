package level04;

import java.io.*;

/* Coordinate quarters
Enter from the keyboard two integers, which will be the coordinates of the point,
Not lying on the coordinate axes OX and OY.
Display the number of the coordinate quarter in which the point is located.
Hint:
The belonging of a point with coordinates (a, b) to one of the quarters is defined as follows:
For the first quarter a> 0 and b> 0;
For the second quarter a <0 and b> 0;
For the third quarter a <0 and b <0;
For the fourth quarter a> 0 and b <0.
Example for numbers 4 6:
1
Example for numbers -6 -6:
3
*/

public class Lesson06Task08 {
	public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int quarters = 0;

        if (a > 0 && b > 0) quarters = 1;
        if (a < 0 && b > 0) quarters = 2;
        if (a < 0 && b < 0) quarters = 3;
        if (a > 0 && b < 0) quarters = 4;
        System.out.println(quarters);
    }
}
