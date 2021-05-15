import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(unrepeated("call 911 666    3fffg"));
    }
    public static String unrepeated(String str) {
        StringBuilder strBuild = new StringBuilder();
        HashMap<Character, Integer> chrHash = new HashMap<>();
        ArrayList<Character> chrArr = new ArrayList<>();
        
        for (int i=0; i< str.length(); i++) {
            if (!chrArr.contains(str.charAt(i))) {
                chrArr.add(str.charAt(i));
                strBuild.append(str.charAt(i));
            }
        }
        return strBuild.toString();
    }
}

