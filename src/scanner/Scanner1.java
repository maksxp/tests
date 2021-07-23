package scanner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        //to work with console we should use constructor with parameter "System.in"
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //Scanner can work not with console only!!!
//        Scanner scanner1 = new Scanner("abcd");
//        // if we need to get char from any next element (String?)
//        System.out.println(scanner1.next().charAt(2));
        System.out.println(i);
    }
}
