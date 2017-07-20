package level08.lesson06.task03;

import java.util.*;
import java.util.Date;

/* Measure how long it takes 10,000 inserts for each list
Measure how long it takes 10,000 inserts for each list.
The getTimeMsOfInsert method must return the execution time in milliseconds.
*/
@SuppressWarnings("rawtypes")
public class Solution {
	
	public static void main(String[] args)
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        Date startData = new Date();

        insert10000(list);

        Date currentDate = new Date();
        long getTimeMsOfInsert = currentDate.getTime() - startData.getTime();
        return getTimeMsOfInsert;
    }

    @SuppressWarnings("unchecked")
	public static void insert10000(List list)
    {
        for (int i = 0; i < 10000; i++)
        {
            list.add(0, new Object());
        }
    }
}
