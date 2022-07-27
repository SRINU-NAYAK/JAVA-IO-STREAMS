package SequenceInputStream;
import java.io.*;
public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try
        {
            FileInputStream fileInputStream1=new FileInputStream(".\\datafiles\\c.txt");
            FileInputStream fileInputStream2=new FileInputStream(".\\datafiles\\d.txt");

            SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream1,fileInputStream2);

            int i;
            while((i=sequenceInputStream.read())!=-1)
            {
                System.out.println((char)i);
            }
            fileInputStream1.close();
            fileInputStream2.close();
            sequenceInputStream.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
