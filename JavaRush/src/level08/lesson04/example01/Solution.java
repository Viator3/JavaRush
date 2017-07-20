package level08.lesson04.example01;
//Check whether 5 seconds have elapsed since the start of the program.

import java.util.Date;

public class Solution {
	public static void main(String[] args) throws Exception
	{
	    Date startTime = new Date();

	    long endTime = startTime.getTime() + 5000;   //    +5 ������
	    Date endDate = new Date(endTime);

	    Thread.sleep(3000);              // ���� 3 ������� 

	    Date currentTime = new Date();
	    if (currentTime.after(endDate))//��������� ��� ����� currentTime ����� endDate
	    {
	        System.out.println("End time!");
	    }
	}
}
