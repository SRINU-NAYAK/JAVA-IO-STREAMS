package BufferedOutputStream;
import java.io.*;
public class BufferedOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        try
        {
            FileOutputStream fileOutputStream=new FileOutputStream(".\\datafiles\\d.txt");
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            String s="Welcome";
            byte[] b=s.getBytes();
            bufferedOutputStream.write(b);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
