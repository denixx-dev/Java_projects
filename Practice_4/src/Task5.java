import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(xPronounce("Inside the box x was a X Xylophone"));
    }
    public static String xPronounce(String str) {
        String[] splitStr = str.split(" ");
        String newStr ="";
        for (int i=0; i < splitStr.length; i++) {
            if(splitStr[i].equals("x")) {
                splitStr[i] = "ecks";
            }
            if(splitStr[i].equals("X")) {
                splitStr[i] = "Ecks";
            }
            if (splitStr[i].startsWith("x")) {
                splitStr[i] = splitStr[i].replace("x","z");
            }
            if (splitStr[i].startsWith("X")) {
                splitStr[i] = splitStr[i].replace("X","Z");
            }
            splitStr[i] = splitStr[i].replace("x","cks");
        }
        return String.join(" ", splitStr);
    }
}
