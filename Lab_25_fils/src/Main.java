import java.io.*;
import static java.lang.System.out;
import java.util.Date;
public class Main {
    public static final String fileName1=
            ".\\test.txt";
    public static final String dirName1=
            ".";
    public static void main (String[] args){
            File f1 =new File(fileName1);
            if (!f1.exists()){
                out.printf("File %s not exist", f1.getAbsolutePath());
            }
            else
                {
                    //String fullName = f1.getCanonicalPath();
                    Date lm = new Date(f1.lastModified());

                    out.printf(" Date: %s Size: %d\n",
                            //fullName,
                            lm.toLocaleString(),
                            f1.length());
       }
        File dir1 = new File(dirName1);
        //out.println(dir1.getCanonicalPath());
        if (dir1.isDirectory())
        {
            File[] files = dir1.listFiles();
            for(File file: files)
            {
                out.println(file.getName());
            }
        }


    }
}
