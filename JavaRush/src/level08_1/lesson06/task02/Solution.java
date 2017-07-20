package level08_1.lesson06.task02;

import java.util.*;

/* Conduct 10 thousand inserts, deletions
For arrayList and linkedList, hold 10,000 inserts, deletes, and get and set calls.
*/

@SuppressWarnings("rawtypes")
public class Solution {
	public static void main(String[] args) throws Exception
    {
        // ArrayList
		ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

	@SuppressWarnings("unchecked")
	public static void insert10000(List list)
    {
        for (int num = 0; num < 10000; num++) {
            list.add(num);
        }
    }

    public static void get10000(List list)
    {
        for (int num = 0; num < 10000; num++) {
            list.get(num);
        }
    }

    @SuppressWarnings("unchecked")
	public static void set10000(List list)
    {
        for (int num = 0; num < 10000; num++) {
            list.set(num, num);
        }
    }

    public static void remove10000(List list)
    {
        for (int num = 0; num < 10000; num++) {
            list.remove(0);
        }
    }
}
