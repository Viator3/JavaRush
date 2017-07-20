package level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/* Delete all numbers greater than 10
Create a set of numbers (Set <Integer>), enter there 20 different numbers.
Remove from the set all numbers greater than 10.
The result is displayed on the screen.
*/
public class Solution {
	public static HashSet<Integer> createSet() {
        HashSet<Integer> integers = new HashSet<>();
        for (int num = 0; num < 20; num++) {
            integers.add(num);
        }
        return integers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) iterator.remove();
        }
        return set;
    }
    
    public static void main(String[] args) {
    	System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
