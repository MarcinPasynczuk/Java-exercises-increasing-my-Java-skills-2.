import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

String string = "I am a string. Yes, I am.";
//        System.out.println(string);
//        String yourString = string.replace("I", "You");
//        System.out.println(yourString);

//        String alphanumeric = "abcdEEEEf12HggghhhIIIIiiii9874z";
//        System.out.println(alphanumeric.replaceAll(".", "Y"));
//
//        System.out.println(alphanumeric.replaceAll("^abcdEE", "Y"));
//
//        System.out.println(alphanumeric.replaceAll("9874z$", "THE END"));
//
//        System.out.println(alphanumeric.replaceAll("[aei]", "X"));

//        String alphanumeric = "abcdEEEEf12HggghhhIIIIiiii9874z";
//        System.out.println(alphanumeric.replaceAll("[^ei]", "x"));
//
//        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));
//        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));


//        String alphanumeric3 = "abcddddddddddddddE12345f12HggghhhIIIIiiii9874z";
////        System.out.println(alphanumeric3.replaceAll("^abcd+", "XXXX"));
////        System.out.println(alphanumeric3.replaceAll("^abcd*", "XXXX"));
////        System.out.println(alphanumeric3.replaceAll("^abcd*", "XXXX"));
//
//        System.out.println(alphanumeric3.matches(".*d.*"))

        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        String challenge2 = "I want a ball.";

        List<String> list = new ArrayList<>();
        list.add(challenge1);
        list.add(challenge2);

        System.out.println(challenge2.matches("I want a.*"));
        System.out.println(challenge1.matches("I want a.*"));

        String whatToCheck = "I want a (bike|ball).";
        Pattern patten = Pattern.compile(whatToCheck);
        Matcher matcher = patten.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = patten.matcher(challenge2);
        System.out.println(matcher.matches());

        System.out.println("\n\n\n\n");

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));

        String challenge5 = "aaabccccccccdddddefffffg";
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println(challenge5.matches("aaabc.*"));

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("\\D{4}.\\d{3}"));






    }
