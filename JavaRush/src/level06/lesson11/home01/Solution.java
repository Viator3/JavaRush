package level06.lesson11.home01;
/* Cat class and static variable catCount
In the Cat class, create a static variable public int catCount.
Create the [public Cat ()] constructor. Let each time a cat is created (a new Cat object)
The static variable catCount is incremented by 1.
Create 10 Cat objects and display the value of the catCount variable on the screen.
*/

public class Solution {
	public static void main(String[] args) {
        for (int num = 0; num < 10; num++) {
            new Cat();
        }
        
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount;

        public  Cat() {
            catCount++;
        }
    }
}

