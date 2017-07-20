package level03;
/* 10 percent
Implement the addTenPercent method, which increases the transmitted integer by 10%.
Correct the error in the method signature.
Hint: think about the input and output methods of this method.
*/

public class Lesson03Task03 {

	public static void main(String[] args) {
		System.out.println(addTenPercent(5));
	}
	
	public static double addTenPercent(int i) {
        double doubi = (double) i;
        double res = doubi + doubi / 10;
        return res;
    }

}
