package level05;
/* Spend three battles in pairs between cats
Create three cats using the Cat class.
Spend three battles in pairs between cats.
You do not need to create the Cat class. For combat use the method boolean fight(Cat anotherCat).
The result of each battle is displayed on the screen.
*/

public class Lesson05Task05 {
	public static void main(String[] args) {
        Cat cat1 = new Cat("Vas", 3, 4, 5);
        Cat cat2 = new Cat("Gas", 1, 9, 50);
        Cat cat3 = new Cat("Das", 5, 3, 1);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 1;
        }
    }
}
