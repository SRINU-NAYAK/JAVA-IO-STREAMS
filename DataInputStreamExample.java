package DataInputStream;
import java.io.*;
public class DataInputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream=new FileInputStream(".\\datafiles\\h.txt");
        DataInputStream dataInputStream=new DataInputStream(fileInputStream);

        int i;
        while ((i=dataInputStream.read())!=-1)
        {
            System.out.println((char)i);
        }
        fileInputStream.close();
        dataInputStream.close();

    }
}
