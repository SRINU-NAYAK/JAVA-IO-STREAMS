package WriterSubClasses;
import java.io.*;
public class OutputStreamWriterExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {


            try {
                OutputStream outputStream = new FileOutputStream(".\\datafiles\\output");
                Writer outputStreamWriter = new OutputStreamWriter(outputStream);

                outputStreamWriter.write("Hello World");

                outputStreamWriter.close();
            } catch (Exception e) {
                e.getMessage();
            }

    }
}
