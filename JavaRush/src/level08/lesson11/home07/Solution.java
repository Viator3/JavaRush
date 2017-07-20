package level08.lesson11.home07;
/* Drop one static modifier
Drop one static modifier to make the example compile.
*/

public class Solution {
	//public int A = 5;
	public static int A = 5;
    public static int B = 2;

    public int C = A*B;
    public static int D = B*A;

    public static void main(String[] args) {
    }
    
    //public static int getValue() {
    public int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}
