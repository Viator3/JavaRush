package level07.lesson12.home06;
/* A family
Create a Human class with the fields name(String), sex(boolean), age(int), father(Human), mother(Human).
Create objects and fill them in order to get:
two grandfathers, two grandmothers, father, mother, three children. Display objects on the screen.
Note:
If you write your own method String toString() in the Human class,
then it will be used when the object is displayed.
Example output:
Name: Anya, gender: female, age: 21, father: Pavel, mother: Katya
Name: Katya, gender: female, age: 55
Name: Igor, gender: male, age: 2, father: Mikhail, mother: Anya
...
*/

public class Solution {
	public static void main(String[] args)
    {
        Human grandfathers1 = new Human("Dima", true, 60);
        Human grandfathers2 = new Human("Kolya", true, 70);
        Human grandmothers1 = new Human("Katia", false, 55);
        Human grandmothers2 = new Human("Lena", false, 62);
        Human father = new Human("Petya", true, 37, grandfathers1, grandmothers1);
        Human mother = new Human("Sveta", false, 32, grandfathers2, grandmothers2);
        Human child1 = new Human("Sergey", true, 7, father, mother);
        Human child2 = new Human("Anya", false, 15, father, mother);
        Human child3 = new Human("Vetalik", true, 2, father, mother);

        System.out.println(grandfathers1);
        System.out.println(grandfathers2);
        System.out.println(grandmothers1);
        System.out.println(grandmothers2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private boolean gender;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, boolean gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        Human(String name, boolean gender, int age, Human father, Human mother) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", gender: " + (this.gender ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}
