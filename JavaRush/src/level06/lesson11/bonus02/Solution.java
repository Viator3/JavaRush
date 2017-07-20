package level06.lesson11.bonus02;

import java.io.*;

/* You need to add new functionality to the program
Task: Every cat has a name and a cat-mother. Create a class that describes this situation. 
Create two objects: a cat-daughter and a cat-mother. Display them on the screen.
New challenge: Every cat has a name, cat-dad and cat-mom.
Change the Cat class so that it can describe this situation. Create 6 objects: 
grandfather (father's dad), grandmother (mother's mother), father, mother, son, daughter.
To bring them all to the screen in order: grandfather, grandmother, father, mother, son, daughter.

Example input:
Grandfather Vasya
Grandmother Murka
Father Cotofey
Mother Vasilisa
Son Murchik
Daughter Pushinka

Example output:
Cat name is Grandfather Vasya, no mother, no father
Cat name is Grandmother Murka, no mother, no father
Cat name is Father Cotofey, no mother, father is Grandfather Vasya
Cat name is Mother Vasilisa, mother is Grandmother Murka, no father
Cat name is Son Murchik, mother is Mother Vasilisa, father is Father Cotofey
Cat name is Daughter Pushinka, mother is Mother Vasilisa, father is Father Cotofey
*/

public class Solution {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandmother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);



        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mather) {
            this.name = name;
            this.father = father;
            this.mather = mather;
        }

        @Override
        public String toString() {
            if (mather == null && father == null) {
                return "Cat name is " + name + ", no mother, no father";
            } else {
                if (mather == null) {
                    return "Cat name is " + name + ", no mother, father is " + father.name;
                } else {
                    if (father == null) {
                        return "Cat name is " + name + ", mother is " + mather.name + ", no father";
                    } else {
                        return ("Cat name is " + name + ", mother is " + mather.name + ", father is " + father.name);
                    }
                }
            }
        }
    }
}
