package FileInputStream;
import java.io.*;
public class FileInputStreamExample2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try
        {
            FileInputStream fileInputStream=new FileInputStream(".\\datafiles\\c.txt");
            int i;
            while((i=fileInputStream.read())!=-1)
            {
                System.out.println("data is "+i+"\t"+(char)i);
            }
            fileInputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
