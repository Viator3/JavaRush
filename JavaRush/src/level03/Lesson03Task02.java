package level03;
/* Currency Converter
Implement the method convertEurToUsd, which translates euro into dollars at a given rate.
Call it twice in the main method with any parameters. Output the results on the screen, each time with a new line.
Hint:
The calculation is performed using the formula: US dollar = euro * rate
*/

public class Lesson03Task02 {

	public static void main(String[] args) {
		System.out.println(convertEurToUsd(2, 1.2));
        System.out.println(convertEurToUsd(5, 1.15));
	}

	public static double convertEurToUsd(int eur, double course){
        double usd = eur * course;
        return usd;
    }
	
}
