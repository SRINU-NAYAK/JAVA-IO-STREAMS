package FilterOutputStream;
import java.io.*;
import java.util.logging.Filter;

public class FilterOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            File file=new File(".\\datafiles\\i.txt");
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            FilterOutputStream filterOutputStream= new FilterOutputStream(fileOutputStream);
            filterOutputStream.write(5);
            filterOutputStream.flush();
            fileOutputStream.close();
            filterOutputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
