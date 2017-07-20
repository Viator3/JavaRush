package level09.lesson02.task05;
/* The method must return the result - the depth of its stack-traces
Write a method that returns the result - the depth of its stack of traces - the amount
Methods in it (the number of items in the list). The same method should be displayed on the screen.
*/

public class Solution {
	 public static int getStackTraceDeep() {
		 int length = Thread.currentThread().getStackTrace().length;
	     System.out.println(length);
	     return length;
	 }
}
