package level08_1.lesson08.task01;
/* 20 words with the letter "L"
To create a set of lines (Set <String>), to enter in it 20 words on the letter "L".
*/

import java.util.HashSet;

public class Solution {
	public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<>();
        for (int num = 0; num < 20; num++) {
            set.add("Lines" + num);
        }
        return set;
    }
	/*public static void main(String[] args) {
		System.out.println(createSet());
	}*/
}
