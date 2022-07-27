package FileOutputStream;
import java.io.*;
public class FileOutputStreamExample1 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("a.txt");
            fileOutputStream.write(5);
            System.out.println("data is saved");
            fileOutputStream.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
