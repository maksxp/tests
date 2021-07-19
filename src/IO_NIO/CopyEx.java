package IO_NIO;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
//                new FileReader("test2.txt"));
             new FileReader("C:\\Users\\Сяйво\\Desktop\\java.jpg"));
             BufferedWriter writer = new BufferedWriter(
                 new FileWriter("java.jpg"));)
             {
                 int character;
                 while ((character=reader.read())!=-1){
                     writer.write(character);
                 }

//                 String line;
//                 while ((line= reader.readLine())!=null){
//                     writer.write(line);
//                     writer.write('\n');
//                 }
                 System.out.println("done");
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
