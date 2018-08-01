import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileDemo3 {
    public static void main(String[] args) {
    FileOutputStream fos = null;
    File file;
    String mycontent = "This is my Data which needs" + " to be written into the file";
    try {
        //File
        file = new File("FileDemo.txt");
        fos = new FileOutputStream(file);

        if (!file.exists()) {
            file.createNewFile();
        }
 /*String content cannot be directly written into
 * a file. It needs to be converted into bytes
 */
        byte[] bytesArray = mycontent.getBytes();
        fos.write(bytesArray);
        fos.flush();
        System.out.println("File Written Successfully");
    }
 
    catch (IOException ioe) {
        ioe.printStackTrace();
    }
    
    finally {
        try {
            if (fos != null) {
        fos.close();
        }
    }
        catch (IOException ioe) {
        System.out.println("Error in closing the Stream");
        }
    }
    }
}

/*
1) Get the directory of the file and load it into FileInputStream.
2) Pass it into BufferedInputStream which lists the amount of bytes in the file
3) If the file exists, create a new one.
4) Turn the content into an array and read it back to the file.
5) Check it completed okay, if it doesn't, throw an exception.
*/