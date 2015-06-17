import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.*;

public class Main {
    public static void showDir(File f, int level)
    {
        if (f.isDirectory()) {
            StringBuilder sb = new StringBuilder();

            //  String margin = new String;
            // margin.ap

            for (int i = 0; i < level; i++)
                sb.append("     ");

            out.printf("%s %s",
                    sb.toString(),
                    f.getName().toUpperCase());
            File[] files = f.listFiles();
            for (File file : files) {
                if (file.isDirectory())
                    showDir(file, level + 1);

            }
            for (File file : files) {
                if (file.isFile()) {
                    out.printf("%s %s %s\n",
                            sb.toString(),
                            file.getName().toLowerCase(),
                            (new Date(file.lastModified())).toLocaleString());
                }
                showDir(file, level + 1);

            }
        }

        public static void showDir(File f)
        {
            showDir(f, 0);
        }

        public static void showDir(String path) {
            File f = new File((path));
            if (f.exists())
                showDir(f, 0);
        }


        public static void main(String[] args)
        {
            showDir("..");


        }
}

