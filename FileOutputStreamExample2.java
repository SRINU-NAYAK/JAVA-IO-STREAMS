package FileOutputStream;

import java.io.*;
public class FileOutputStreamExample2 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(".\\datafiles\\b.txt");
            String s="Welcome to IOStreams";
            byte[] b=s.getBytes(s);
            fileOutputStream.write(b);

            fileOutputStream.close();
            System.out.println("data is saved");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
