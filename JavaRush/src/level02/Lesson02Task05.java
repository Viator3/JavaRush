package level02;
/* Calling methods
Think about what the program does.
By analogy with the method printName (Student student), in the main method, add method calls
PrintAge (Student student) and printMoney (Student student)
*/

public class Lesson02Task05 {

	public static void main(String[] args) {
		Student student = new Student();
        printName(student);
        printAge(student);
        printMoney(student);
	}
	
	public static void printName(Student student) {
        System.out.println(student.name);
    }

    public static void printAge(Student student) {
        System.out.println(student.age);
    }

    public static void printMoney(Student student) {
        System.out.println(student.money);
    }


    public static class Student {
        String name = "Amigo";
        int age = 2;
        int money = 0;
    }
}
