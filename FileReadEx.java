import java.io.*;

public class FileReadEx
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("/home/yagnik/Workspaces/Java/File_Hanling/test.txt");
            int text = fis.read();
            while((text = fis.read())!=-1)
            {
                System.out.print((char)text);
            }
        }
        catch(Exception e)
        {

        }
    }
}
