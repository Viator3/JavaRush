package level08_1.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set of cats
1. Inside the Solution class, create a public static Cat class - Cat.
2. Implement a method createCats, it must create multiple (Set) cats, and add to it a cat 3.
3. In the main method, remove one cat from the Set cats.
4. Implement the printCats method, it should display all the cats that are left in the set.
Every cat with a new line.
*/

public class Solution
{
	public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        iterator.next();
        iterator.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int num = 0; num < 3; num++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

    }
}
