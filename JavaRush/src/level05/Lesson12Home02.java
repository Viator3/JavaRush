package level05;
/* Man and Woman
1. Inside the Solution class, create the public static Man and Woman classes.
2. The classes must have fields: name(String), age(int), address(String).
3. Create constructors, to which all possible parameters are passed.
4. Create two objects of each class with all data using the constructor.
5. Display the objects in this format [name + " " + age + " " + address].
*/

public class Lesson12Home02 {
	public static void main(String[] args)
    {
        Man man1 = new Man("Valera", 36, "Kharkiv");
        Man man2 = new Man("Dima", 33, "Kyiv");

        Woman woman1  = new Woman("Katya", 22, "Kharkiv");
        Woman woman2 = new Woman("Sveta", 25, "Kyiv");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
