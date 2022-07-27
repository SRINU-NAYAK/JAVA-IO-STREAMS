package FilterInputStream;
import java.io.*;
public class FilterInputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            File file=new File(".\\datafiles\\b.txt");
            FileInputStream fileInputStream=new FileInputStream(file);
            FilterInputStream filterInputStream=new BufferedInputStream(fileInputStream);

            int i;
            while((i=filterInputStream.read())!=-1)
                System.out.println(i);
            fileInputStream.close();
            filterInputStream.close();
        }
        catch (Exception e)
        {

        }

    }
}
