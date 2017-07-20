package level08_1.lesson11.home06;

import java.util.ArrayList;

/* Whole family to gather
1. Create a Human class with the fields name (String), gender (boolean), age (int),
children (ArrayList <Human>).
2. Create objects and fill them up so that it turns out: two grandfathers, two grandmothers,
father, mother, three children.
3. Display all Human objects on the screen.
*/

public class Solution {
	public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> children2 = new ArrayList<>();
        ArrayList<Human> children3 = new ArrayList<>();

        children.add(new Human("Sergey", true, 7, new ArrayList<>()));
        children.add(new Human("Anya", false, 15, new ArrayList<>()));
        children.add(new Human("Vetalik", true, 2, new ArrayList<>()));

        children1.add(new Human("Petya", true, 37, children));
        children2.add(new Human("Sveta", false, 32, children));

        children3.add(new Human("Dima", true, 60, children1));
        children3.add(new Human("Kolya", true, 70, children2));
        children3.add(new Human("Katia", false, 55, children1));
        children3.add(new Human("Lena", false, 62, children2));

        for (Human ch3 : children3) {
            System.out.println(ch3);
        }
        System.out.println(children1.get(0));
        System.out.println(children2.get(0));
        for (Human ch : children) {
            System.out.println(ch);
        }
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        Human(String name, boolean gender, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = gender;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", gender: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
