package level09.lesson11.bonus02;

import java.io.*;

/* You need to add new functionality to the program
Task: The program enters two file names. 
And copies the first file to the location given by the second name.
New task: The program enters two file names. 
And copies the first file to the location given by the second name.
If the file (which you want to copy) with the specified name does not exist, then
The program should display "File does not exist." 
And read the file name again from the console, and then read the file for writing.
*/

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        FileInputStream fileInputStream = null;
        String sourceFileName = reader.readLine();
        
        while (true) {
        	try {
        		fileInputStream = new FileInputStream(sourceFileName);
        		break;
        	}
        	catch (FileNotFoundException e){
        		System.out.println("Файл не существует.");
        		sourceFileName = reader.readLine();
        	}
        }
        
        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
