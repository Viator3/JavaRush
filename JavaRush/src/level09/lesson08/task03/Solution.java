package level09.lesson08.task03;

import java.io.*;
import java.nio.file.FileSystemException;

/* Intercepting selective exceptions
1. Understand the exceptions thrown by the BEAN.methodThrowExceptions method.
2. The processExceptions method must call the BEAN.methodThrowExceptions method and handle exceptions:
2.1. If there is an exception FileSystemException, then log it (call the method BEAN.log) 
and throw further
2.2. If there is a CharConversionException or any other IOException,
Then just log it - call the method BEAN.log
3. Add an exception class to the processExceptions method signature, which you skip in step 2.1.
4. In the main method, process the remaining exception-log it. Use try..catch

Hint:
If you captured the exception MyException, which you did not want to capture, 
you can throw it further with a code like:
Catch (MyException e) {
Throw e;
}
*/
public class Solution {
	public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            processExceptions();
        }
        catch (FileSystemException e) {
            BEAN.log(e);
        }
    }

    public static void processExceptions() throws FileSystemException {
        try {
            BEAN.methodThrowExceptions();
        }
        catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        }
        catch (CharConversionException e) {
            BEAN.log(e);
        }
        catch (IOException e) {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException,
        		IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }


    }
}
