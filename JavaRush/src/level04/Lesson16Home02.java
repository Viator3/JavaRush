package level04;

import java.io.*;
import java.util.ArrayList;

/* Average is average
Enter three numbers from the keyboard, display the average of them.
Those. Not the largest and not the smallest.
*/

public class Lesson16Home02 {
	public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = Integer.parseInt(reader.readLine());
        list.add(num);

        for (int i = 0; i < 2; i++) {
            num = Integer.parseInt(reader.readLine());
            for (int numList : list)
            {
                if (num > numList) {
                    list.add(list.indexOf(numList), num);
                    break;
                }
                if (list.indexOf(numList) + 1 == list.size()) {
                    list.add(num);
                    break;
                }
            }
        }

        System.out.println(list.get(1));
    }
}
