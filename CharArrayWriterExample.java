package WriterSubClasses;
import java.io.*;
public class CharArrayWriterExample {
    public static void main(String args[])throws FileNotFoundException,Exception{
        CharArrayWriter out=new CharArrayWriter();
        out.write("Welcome to java");
        FileWriter f1=new FileWriter(".\\datafiles\\a1.txt");
        FileWriter f2=new FileWriter(".\\datafiles\\b1.txt");
        FileWriter f3=new FileWriter(".\\datafiles\\c1.txt");
        FileWriter f4=new FileWriter(".\\datafiles\\d1.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success...");
    }
}
