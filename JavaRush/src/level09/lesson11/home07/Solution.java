package level09.lesson11.home07;
/* Distribute static modifiers
Separate the static modifiers so that the example is compiled.
*/

public class Solution {
	public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    @SuppressWarnings("static-access")
	public void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }
}
