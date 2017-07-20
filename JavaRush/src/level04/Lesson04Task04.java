package level04;
/* Season
Implement the checkSeason method. By the month number, the method must determine the time of year
(Winter, spring, summer, autumn) and display.
Example for the month number 2:
winter
Example for the month number 5:
Spring
*/

public class Lesson04Task04 {
	public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        if (mount == 12 || mount == 1 || mount == 2) {
            System.out.println("Winter");
        }
        if (mount == 3 || mount == 4 || mount == 5) {
            System.out.println("Spring");
        }
        if (mount == 6 || mount == 7 || mount == 8) {
            System.out.println("Summer");
        }
        if (mount == 9 || mount == 10 || mount == 11) {
            System.out.println("Autumn");
        }
    }
}
