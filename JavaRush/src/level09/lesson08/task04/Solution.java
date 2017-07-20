package level09.lesson08.task04;

import java.io.*;
import java.rmi.RemoteException;

/* Interception of checked exceptions
In the processExceptions method, process all checked exceptions.
You need to display every checked exception that appears.
You can only use one try block ..
*/

public class Solution {
	public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RemoteException e) {
            System.out.println(e);
        }
        catch (NoSuchFieldException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
