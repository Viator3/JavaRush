package level03;
/* Shielding characters
For screening characters in Java, read the additional material for the lecture.
Display the following text - two lines:

It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

public class Lesson06Task04 {

	public static void main(String[] args) {
		String s1 = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String s2 = "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        System.out.println(s1);
        System.out.println(s2);
	}

}
