package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
          //"ABC" in string
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

         //"AB" and any symbol from range in [] and OP after it
//        String s1 = "ABCOPABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

         //"abc" and NOT any symbol from range in [] after it
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

         //"abc" and "e" or "5" after it
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");

          //"abc" and any symbol (except new string) after it
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");

          //"abc" at the START of string
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abc");

         //"bch" at the END of string
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("bch$");

        //two first patterns matches any digit in string
        // third one matches any NON digit in string
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("[0-9]");
//        Pattern pattern1 = Pattern.compile("\\d");
//        Pattern pattern1 = Pattern.compile("\\D");

        // descriptions are to the right of the pattern
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // the same is "[A-Za-z0-9_]"
//        Pattern pattern1 = Pattern.compile("\\W"); // the same is "[^A-Za-z0-9_]"

        // descriptions are to the right of the pattern
//        String s1 = "abcd abce abc5&==abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+"); // the same is "[A-Za-z0-9_]" + 1 or more repetitions of it
//        Pattern pattern1 = Pattern.compile("\\W+"); // the same is "[^A-Za-z0-9_]" + 1 or more repetitions of it

        // descriptions are to the right of the pattern
//        String s1 = "abcd abc abce abczabcyabclf rter";
//        Pattern pattern1 = Pattern.compile("\\w{4}"); // the same is "[A-Za-z0-9_]" 4 times. {n} - n times

        // finds any number of spaces with any symbol at the start and at the end of them
//        String s1 = "abcd    abc   abce a bczabcyabclf    rter";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); // pattern "\s" means the same as [\t\n\r\f]

//        String s1 = "abcd abce3 abcfa78abcg6a!!!!!!!!!!!";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}"); //finds NOT numbers with length from 2 to 6
//        Pattern pattern1 = Pattern.compile("\\D{2,}"); //finds NOT numbers with length from 2 to infinity

//        String s1 = "ABCABABABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,6}"); //finds repetitions of "AB" from 2 to 6 times

//        String s1 = "DABCDABABDABABABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}"); //finds D with 2 or more repetitions of "AB" exact after D

//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)?"); //finds D with 0 or 1 repetitions of "AB" exact after D

//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)*"); //finds D with 0 or more repetitions of "AB" exact after D

//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("\\Aabcd"); //finds if "abcd" is a beginning of string

//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("bch\\Z"); //finds if "bch" is an end of string

        //finds if "abcd" is a beginning of string AND "bch" is an end of string
        String s1 = "abcd abce abcfabcgabch";
        Pattern pattern1 = Pattern.compile("\\Aabcd.*bch\\Z");
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()){
            System.out.println("Position: "+matcher.start()+" "+matcher.group());
        }
    }
}
