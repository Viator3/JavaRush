package level09.lesson03.example01;
//The program that intercepts the exception is the division by 0, and continues to work.

public class Solution {
	public static void main(String[] args)
    {
        System.out.println("Program starts");

        try {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown");
        }
        catch (Exception e) {
           System.out.println("Exception has been caught");
        }
        System.out.println("Program is still running");
    }

    public static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}
