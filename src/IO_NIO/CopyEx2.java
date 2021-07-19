package IO_NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Сяйво\\Desktop\\java.jpg");
             FileOutputStream outputStream = new FileOutputStream("java.jpg");
             ) {
            int i;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
            System.out.println("done");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
