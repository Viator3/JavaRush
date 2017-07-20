package level09.lesson08.task01;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* Exceptions
There is a method that throws out two exceptions inherited from Exception and two 
inherited from RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

It is necessary to intercept NullPointerException and FileNotFoundException, but not to intercept
ArithmeticException and URISyntaxException. How to do it?
*/

public class Solution {
	public static void main(String[] args) throws Exception {
        try {
            method1();
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException,
    	FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
