package level10.lesson11.home06;
/* Designers of the Human class
Write the Human class with 6 fields. Invent and implement 10 different designers for it. 
Every constructor should make sense.
*/

public class Solution {
	public static void main(String[] args) {
    }

    public static class Human {
        String firstName;
        String lastName;
        int age;
        boolean sex;
        String city;
        int growth;

        Human(String firstName) {
            this.firstName = firstName;
        }
        
        Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        
        Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        
        Human(String firstName, String lastName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }
        
        Human(String firstName, String lastName, int age, boolean sex, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.city = city;
        }
        
        Human(String firstName, String lastName, int age, boolean sex, String city, int growth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.city = city;
            this.growth = growth;
        }
        
        Human(String firstName, String lastName, int age, boolean sex, int growth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.growth = growth;
        }
        
        Human(int age, boolean sex, String city, int growth) {
            this.age = age;
            this.sex = sex;
            this.city = city;
            this.growth = growth;
        }
        
        Human(String firstName, String lastName, int age,String city, int growth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
            this.growth = growth;
        }
        
        Human(String firstName,boolean sex) {
            this.firstName = firstName;
            this.sex = sex;
        }
    }
}
