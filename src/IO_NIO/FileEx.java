package IO_NIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test_2.txt");
        File folder = new File("C:\\Users\\Сяйво\\Desktop\\A");
        File file2 = new File("C:\\Users\\Сяйво\\Desktop\\A\\test_.txt");
        File folder2 = new File("C:\\Users\\Сяйво\\Desktop\\B");

        System.out.println("file "+file.getAbsolutePath());
        System.out.println("folder "+folder.getAbsolutePath());
        System.out.println("_________________________________________");

        System.out.println("file absolute "+file.isAbsolute());
        System.out.println("folder absolute "+folder.isAbsolute());
        System.out.println("_________________________________________");

        System.out.println("file is directory "+file.isDirectory());
        System.out.println("folder is directory "+folder.isDirectory());
        System.out.println("_________________________________________");

        System.out.println("file exists "+file.exists());
        System.out.println("folder exists "+folder.exists());
        System.out.println("file2 exists "+file2.exists());
        System.out.println("folder2 exists "+folder2.exists());
        System.out.println("_________________________________________");

        System.out.println("file2 create "+file2.createNewFile());
        System.out.println("folder2 mkdir "+folder2.mkdir());
        System.out.println("_________________________________________");

        System.out.println("file2 length "+file2.length());
        System.out.println("folder2 length "+folder2.length());
        System.out.println("_________________________________________");

//        System.out.println("folder delete "+folder.delete());
//        System.out.println("folder2 delete "+folder2.delete());
//        System.out.println("file2 delete "+file2.delete());
//        System.out.println("_________________________________________");

        File [] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("_________________________________________");

        System.out.println("file 2 is hidden "+file2.isHidden());
        System.out.println("file 2 can read "+file2.canRead());
        System.out.println("file 2 can write "+file2.canWrite());
        System.out.println("file 2 can execute "+file2.canExecute());
    }
}
