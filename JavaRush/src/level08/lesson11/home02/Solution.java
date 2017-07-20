package level08.lesson11.home02;

import java.util.*;

/* Set of all animals
1. Inside the Solution class, create public static Cat, Dog classes.
2. Implement the createCats method, which must return a set with 4 cats.
3. Implement the createDogs method, which must return a set with 3 dogs.
4. Implement the join method, which must return the combined set of all animals - all cats and dogs.
5. Implement the removeCats method,
which must remove from the set of pets all cats that are in the set of cats.
6. Implement the printPets method, which should display all the animals that are in it.
Every animal from a new line.
*/

public class Solution
{
	public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int num = 0; num < 4; num++) {
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<>();
        
        for (int num = 0; num < 3; num++) {
            result.add(new Dog());
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        /*//1
        Set<Object> copy = new HashSet<Object>(pets);

        for (Object pat : copy) {
            if (cats.contains(pat)) {
                pets.remove(pat);
            }
        }*/
    	
    	/*//2*
    	for (Cat cat : cats) {
            pets.remove(cat);
        }*/

        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
