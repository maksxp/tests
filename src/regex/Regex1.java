package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48,"+
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;"+
                "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18,"+
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"+
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21,"+
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952;";

        // finds any word
//        Pattern pattern = Pattern.compile("\\w+");

        // finds any two digits which are separate "word". Symbol "\b" means boundary of the word or number.
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Matcher matcher = pattern.matcher(s);

        // finds any phone number. In our case phone number consists of symbol "+" and 9 digits after
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
//        Matcher matcher = pattern.matcher(s);

        // finds any email. In first case email consists of:  any symbols + "@" + any symbols + "." + any symbols.
        //In second case email consists of:  any symbols + "@" + any symbols + "." + "ru" OR "com".
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
