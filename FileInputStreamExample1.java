package FileInputStream;
import java.io.*;
public class FileInputStreamExample1 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        try {

            FileInputStream fileInputStream = new FileInputStream(".\\datafiles\\b.txt");
            int data = fileInputStream.read();
            System.out.println((char)data);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
