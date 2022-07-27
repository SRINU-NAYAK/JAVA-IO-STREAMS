package WriterSubClasses;

import java.io.StringReader;

public class StringReaderExample {
    public static void main(String[] args) throws Exception {
        String srg = "Hello Java!! \nWelcome to Java.";
        StringReader reader = new StringReader(srg);
        int k = 0;
        while ((k = reader.read()) != -1) {
            System.out.print((char) k);
        }
    }
}
