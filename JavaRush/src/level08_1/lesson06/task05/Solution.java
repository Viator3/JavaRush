package level08_1.lesson06.task05;

import java.util.*;

/* Four methods
Implement 4 methods. They must return a list that is best suited for performing these operations
(The fastest way to cope with a large number of operations). Nothing to measure is not necessary.
*/
@SuppressWarnings("rawtypes")
public class Solution {
	
	public static List  getListForGet() {
        return new ArrayList();
    }

    public static List  getListForSet() {
        return new ArrayList();
    }

    public static List  getListForAddOrInsert() {
        return new LinkedList();
    }

    public static List  getListForRemove() {
        return new LinkedList();
    }
}
