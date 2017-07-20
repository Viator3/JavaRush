package level08_1.lesson06.task04;

import java.util.Date;
import java.util.*;

/* Measure how long it takes 10,000 calls to get for each list
Measure how long it takes 10,000 calls to get for each list.
The getTimeMsOfGet method must return the execution time in milliseconds.
*/
@SuppressWarnings("rawtypes")
public class Solution {
	public static void main(String[] args)
    {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

	@SuppressWarnings("unchecked")
	private static List fill(List list)
    {
        for(int i = 0; i < 21; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long  getTimeMsOfGet(List list)
    {
        Date startData = new Date();

        get10000(list);

        Date currentDate = new Date();
        long getTimeMsOfInsert = currentDate.getTime() - startData.getTime();
        return getTimeMsOfInsert;
    }

    public static void get10000(List list)
    {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
