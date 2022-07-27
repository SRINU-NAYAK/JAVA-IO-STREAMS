package BufferedOutputStream;
import java.io.*;
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try
        {
            FileInputStream fileInputStream=new FileInputStream(".\\datafiles\\d.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

            int i;
            while ((i=bufferedInputStream.read())!=-1)
            {
                System.out.println((char)i);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
