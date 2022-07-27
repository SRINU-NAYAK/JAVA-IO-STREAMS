package WriterSubClasses;
import java.io.*;
public class FileReaderExample {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader(".\\datafiles\\testout.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
        }
}
