package level04;
/* Shadowing variables
Think about what the program does.
Correct the error in the program so that the age variable of the person object changes its value.
Tip: carefully review the adjustAge method
*/

public class Lesson01Task01 {

	public static void main(String[] args) {
		Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
	}
	
	public static class Person
    {
        public int age = 20;

        public void adjustAge(int age)
        {
        	//age = age + 20;
        	this.age = age + 20;
            System.out.println("The Age in adjustAge() is " + age);
        }
    }
}
