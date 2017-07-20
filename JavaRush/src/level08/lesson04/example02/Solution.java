package level08.lesson04.example02;

import java.util.Date;

// We figure out how much time has passed since the beginning of today.

public class Solution {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception
	{
	    Date currentTime = new Date();
	    int hours = currentTime.getHours();
	    int mins = currentTime.getMinutes();
	    int secs = currentTime.getSeconds();

	    System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
	}
}
