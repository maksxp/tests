package regex;

import java.util.regex.Pattern;

public class CheckIP {
    void checkIP (String ip) {
        String regex = "(([01]?\\d?\\d|2[0-4]\\d|25[0-5])(\\.)){3}[01]?\\d?\\d|2[0-4]\\d|25[0-5]";
        System.out.println(ip+" IP is OK? "+ Pattern.matches(regex,ip));
    }
    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255 - it's IP
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        CheckIP checkIP = new CheckIP();
        checkIP.checkIP(ip1);
        System.out.println("____________________________");
        checkIP.checkIP(ip2);

    }
}
