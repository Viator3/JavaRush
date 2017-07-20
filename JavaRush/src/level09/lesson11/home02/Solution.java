package level09.lesson11.home02;
/* Countdown from 10 to 0
Write a loop countdown from 10 to 0. To delay using Thread.sleep(100);
Wrap the call to sleep in try..catch.
*/

public class Solution {
	public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
            }
        }
    }
}
