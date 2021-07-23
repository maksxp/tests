package scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {

    public static void main(String[] args) {
        // we need to print unique words from the file sorted alphabetically
        Scanner scanner = null;
        Set <String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader("text.txt"));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()){
                set.add(scanner.next());
            }
            for (String word: set){
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("we have a problem");
        }
        finally {
            scanner.close();
        }

    }
}
