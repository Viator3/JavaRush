package level06.lesson05.task03;
/* For 100,000 Cat and Dog objects
Create a cycle of 100,000 Cat and Dog objects. (The Java machine should begin to destroy unused,
And the finalize method is called at least once).
*/

public class Solution {
	public static void main(String[] args)
    {
        for (int num = 0; num < 100000; num++) {
            new Cat();
            new Dog();
        }
    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}