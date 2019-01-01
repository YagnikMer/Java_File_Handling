import java.io.*;

public class FileWriteEx
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("/home/yagnik/Workspaces/Java/File_Hanling/test.txt");
            fos.write(88);
            fos.close();
        }
        catch(Exception e)
        {

        }
    }
}
