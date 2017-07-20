package level07.lesson12.home07;
/* Drop one static modifier
Drop one static modifier to make the example compile.
*/

public class Solution {
	//public final int A = 5;
	public final static int A = 5;
    public final static int B = 2;
    public final static int C = A*B;

    public static void main(String[] args)
    {
    }

    //public int static getValue() {
    public int getValue() {
        return C;
    }
}
