package WriterSubClasses;
import java.io.*;
public class PrintWriterExample {
    public static void main(String[] args) throws Exception {
        //Data to write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("JavaPoint provides tutorials of all technology.");
        writer.flush();
        writer.close();
//Data to write in File using PrintWriter
        PrintWriter writer1 =null;
        writer1 = new PrintWriter(new File(".\\datafiles\\testout3.txt"));
        writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.flush();
        writer1.close();
    }
}
