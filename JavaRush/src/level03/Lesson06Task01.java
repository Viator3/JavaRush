package level03;
/* Mom soap frame
Display all possible combinations of the words "Mom", "Soap", "Frame" on the screen.
Hint: there are 6 of them. Output each combination from a new line. Words can not be divided. Example:
SoapFrameMom
FrameMomSoap
...
*/

public class Lesson06Task01 {

	public static void main(String[] args) {
		String s1 = "Mom";
        String s2 = "Soap";
        String s3 = "Frame";

        System.out.println(s1 + s2 + s3);
        System.out.println(s1 + s3 + s2);
        System.out.println(s2 + s1 + s3);
        System.out.println(s2 + s3 + s1);
        System.out.println(s3 + s2 + s1);
        System.out.println(s3 + s1 + s2);
	}

}
