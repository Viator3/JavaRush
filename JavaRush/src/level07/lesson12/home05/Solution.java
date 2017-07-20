package level07.lesson12.home05;
/* Boom
Write a program that counts down from 30 to 0, and at the end displays the text "Boom!".
The program should reduce the number 10 times per second.
In order to insert a delay in the program, use the function:
Thread.sleep(100); // a delay of one tenth of a second.
Example:
30
29
...
1
0
Boom!
*/

public class Solution {
	public static void main(String[] args) throws InterruptedException
    {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        
        System.out.println("Ѕум!");
    }
}
