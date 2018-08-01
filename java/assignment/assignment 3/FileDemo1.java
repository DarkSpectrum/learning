import java.io.File;
import java.io.IOException;
public class FileDemo1 {
    public static void main( String[] args ) {
    try {
        File file = new File("FileDemo.txt");

 boolean fvar = file.createNewFile();
    if (fvar) {
        System.out.println("File has been created successfully");
        }
    else {
        System.out.println("File already present at the specified location");
    }
 }
    catch (IOException e) {
        System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}

 /*
 1) createNewFile attempts to create a file.
 2) If the file is created successfully, a boolean returns true
 3) If the file isn't created successfully (already exists), it returns false
 4) If java doesn't have permission or any other errors, throw an exception.
 */