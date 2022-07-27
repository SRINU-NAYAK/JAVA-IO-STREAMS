package WriterSubClasses;
import java.io.*;
public class CharArrayReaderExample {
    public static void main(String[] ag) throws Exception {
        char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
        CharArrayReader reader = new CharArrayReader(ary);
        int k = 0;
        // Read until the end of a file
        while ((k = reader.read()) != -1) {
            System.out.print((char) k +" : ");
            System.out.println(k);
        }
    }
}
