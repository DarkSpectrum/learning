import java.io.*;
    public class FileDemo2 {
        public static void main(String[] args) { 
        File file = new File("FileDemo.txt"); //Path here
        BufferedInputStream bis = null;
        FileInputStream fis= null;
    try {
        fis = new FileInputStream(file);
        bis = new BufferedInputStream(fis);
        /*available() method of BufferedInputStream
        * returns 0 when there are no more bytes
        * present in the file to be read*/
        while( bis.available() > 0 ){
            System.out.print((char)bis.read());
        }
    }
    catch(FileNotFoundException fnfe) {
        System.out.println("The specified file not found" + fnfe);
    }
    catch(IOException ioe) {
        System.out.println("I/O Exception: " + ioe);
    }
    finally {
        try {
            if(bis != null && fis!=null) {
        fis.close();
        bis.close();
        }
    }
    catch(IOException ioe) {
        System.out.println("Error in InputStream close(): " + ioe);
        }
    }
    }
}

/*
1) Get the directory of the file and load it into FileInputStream
2) Pass it into BufferedInputStream which lists the amount of bytes in the file
3) While there are more bytes in the file than zero, print them out
4) If the while code won't run and it has an exception, print the specifed exception.

This means that all the text is in the document printed out.
*/