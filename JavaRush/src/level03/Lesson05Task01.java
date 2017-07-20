package level03;
/* Change the program
Think about what the program does.
Change the public static void method printFullName (Student student). The method should output the full name of the student to the screen.
Words are separated by a space.
Example output:
Mark Elliot Zuckerberg
*/

public class Lesson05Task01 {

	public static void main(String[] args) {
		Student student = new Student();
        student.firstName = "Mark";
        student.middleName = "Elliot";
        student.lastName = "Zuckerberg";
        printFullName(student);
	}
	
	public static void printFullName(Student student) {
        System.out.print(student.firstName + " " + student.middleName + " " + student.lastName);
    }

    public static class Student
    {
        public String firstName;
        public String middleName;
        public String lastName;
    }
}
