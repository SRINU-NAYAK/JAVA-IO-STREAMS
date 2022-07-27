package WriterSubClasses;
import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter(".\\datafiles\\testout1.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success");
    }
}
