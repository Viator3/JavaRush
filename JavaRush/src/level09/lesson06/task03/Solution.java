package level09.lesson06.task03;
/* Exception while working with arrays
To catch an exception (and display it on the screen), specifying its type, 
which occurs when the code is executed:
int[] m = new int[2];
m[8] = 5;
*/
public class Solution {
	public static void main(String[] args) throws Exception {
        try {
        	int[] m = new int[2];
        	m[8]= 5;
        }
        catch (Exception e) {
            System.out.println(e.getClass() + " : " + e.getMessage());
        }
    }
}
