package ByteArrayOutputStream;
import java.io.*;
public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            FileOutputStream fileOutputStream1=new FileOutputStream(".\\datafiles\\f.txt");
            FileOutputStream fileOutputStream2=new FileOutputStream(".\\datafiles\\g.txt");

            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            byteArrayOutputStream.write(5);
            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
