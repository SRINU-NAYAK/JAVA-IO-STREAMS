package ByteArrayOutputStream;
import java.io.*;
public class ByteArrayOutputStreamExample2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            String s="welcome to home";
            byte[] bytes=s.getBytes();
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            byteArrayOutputStream.write(bytes);

            FileOutputStream outputStream1=new FileOutputStream(".\\datafiles\\f.txt");
            outputStream1.write(bytes);
            FileOutputStream outputStream2=new FileOutputStream(".\\datafiles\\g.txt");
            outputStream2.write(bytes);

            byteArrayOutputStream.close();
            outputStream1.close();
            outputStream2.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
