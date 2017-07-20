package level10.lesson11.home04;
/* Big salary
Display the inscription "I do not want to study Java, I want a big salary" 40 times on the model.
Sample:
I do not want to study Java, I want a big salary
 do not want to study Java, I want a big salary
do not want to study Java, I want a big salary
o not want to study Java, I want a big salary
 not want to study Java, I want a big salary
...
*/

public class Solution {
	public static void main(String[] args)
    {
        String s = "I do not want to study Java, I want a big salary";

        for (int index = 0; index < 40; index++) {
            System.out.println(s.substring(index));
        }
    }
}
