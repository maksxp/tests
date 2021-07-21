package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {
    public static void main(String[] args) {
        // card number: valid day - symbols from [17 to 20]; last 3 symbols are CVV code
        String myString = "12345697986263970325987;"+
                          "98749473136514890921654;"+
                          "65425622657792461222333;";
        // 03/25 1234 5697 9862 6397 (987) - estimated result=myNewString from the first card

        //each regex in "()" is a group
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

        // symbol "$" and number of group uses to replace groups in new string
//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);

        //print interested number of group only
        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
