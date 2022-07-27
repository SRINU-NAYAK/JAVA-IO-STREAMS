package SequenceInputStream;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream1=new FileInputStream(".\\datafiles\\b.txt");
        FileInputStream fileInputStream2=new FileInputStream(".\\datafiles\\c.txt");
        FileInputStream fileInputStream3=new FileInputStream(".\\datafiles\\d.txt");
        FileInputStream fileInputStream4=new FileInputStream(".\\datafiles\\e.txt");

        Vector v=new Vector();
        v.add(fileInputStream1);
        v.add(fileInputStream2);
        v.add(fileInputStream3);
        v.add(fileInputStream4);

        Enumeration e=v.elements();

        SequenceInputStream sequenceInputStream=new SequenceInputStream(e);
        int i;
        while ((i=sequenceInputStream.read())!=-1)
        {
            System.out.print((char)i);
        }
        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
        fileInputStream4.close();
        sequenceInputStream.close();

    }
}
