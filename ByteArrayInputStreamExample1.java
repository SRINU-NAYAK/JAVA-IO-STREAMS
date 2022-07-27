package ByteArrayInputStream;
import java.io.*;
public class ByteArrayInputStreamExample1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            byte[] b={2,4,5,8,6,9};
            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(b);

            int i;
            while ((i=byteArrayInputStream.read())!=-1)
            {
                System.out.println((int)i);
            }
            byteArrayInputStream.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
