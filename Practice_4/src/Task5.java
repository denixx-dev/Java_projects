import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(xPronounce("Inside the boX was a excellent"));
    }
    public static String xPronounce(String str) {
        String[] splitStr = str.split(" ");
        /*for (int i = 0; i < splitStr.length; i++) {
            splitStr[i] = splitStr[i].replace("x", "ecks");
        }*/
        String changedStr="";
        /*for (String word : splitStr) {
            Pattern patternX = Pattern.compile("[Xx]");
            Matcher matcher = patternX.matcher(word);
            word = matcher.replaceFirst("ecks");
            changedStr += word + " ";

        }*/
        Pattern patternX = Pattern.compile("[Xx]");
        Matcher matcher = patternX.matcher(str);
        str = matcher.replaceFirst("ecks");
        return str;
    }
}
