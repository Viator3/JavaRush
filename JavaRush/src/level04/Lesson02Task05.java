package level04;
/* Count the number of cats
Write the code to correctly count the number of cats created (count) 
and display the correct number of cats.
*/
public class Lesson02Task05 {
	public static void main(String[] args)
    {
        new Cat();
        Cat.count++;

        new Cat();
        Cat.count++;

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}
