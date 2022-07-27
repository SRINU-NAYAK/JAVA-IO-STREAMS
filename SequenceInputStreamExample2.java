package SequenceInputStream;
import java.io.*;
public class SequenceInputStreamExample2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            FileInputStream fileInputStream1=new FileInputStream(".\\datafiles\\c.txt");
            FileInputStream fileInputStream2=new FileInputStream(".\\datafiles\\d.txt");

            FileOutputStream fileOutputStream=new FileOutputStream(".\\datafiles\\e.txt");
            SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream1,fileInputStream2);
            int i;
            while((i=sequenceInputStream.read())!=-1)
            {
                fileOutputStream.write(i);
            }
            fileInputStream1.close();
            fileInputStream2.close();
            fileOutputStream.close();
            sequenceInputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
