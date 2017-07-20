package level06.lesson11.home02;

import java.util.ArrayList;

/* Static cats
1. In the Cat class, add the public static variable cats (ArrayList <Cat>).
2. Let each new cat (new Cat object) create a new cat in the cats variable.
Create 10 Cat objects.
3. The printCats method should output all cats to the screen. You need to use the variable cats.
*/

public class Cat {
	public Cat() {
    }
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {
        for (int num = 0; num < 10; num++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
       for (Cat cat : cats) System.out.println(cat);
    }
}
