package DataOutputStream;
import java.io.*;
public class DataOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            FileOutputStream fileOutputStream=new FileOutputStream(".\\datafiles\\h.txt");
            DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);

            dataOutputStream.write(65);
            dataOutputStream.close();
            fileOutputStream.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
