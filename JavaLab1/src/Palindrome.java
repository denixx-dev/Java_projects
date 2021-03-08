import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Palindrome {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       String text = scn.nextLine();
        String[] sp = text.split(" ");
        String reverse_string = "";
        for (int i=0; i < sp.length; i++){
            reverse_string += reverseString(sp[i]) + " ";
        }
        //System.out.println(reverse_string);
        String[] revSp = reverse_string.split(" ");
        for (int j=0; j < sp.length; j++){
            System.out.print(isPalindrome(sp[j], revSp[j]) + " ");
        }
    }
    public static String reverseString(String word) {
        char[] array = word.toCharArray();
        String reverse_word = "";
        for (int n = array.length - 1; n >= 0; n--) {
            reverse_word = reverse_word + array[n];
        }
        return reverse_word;
    }
    private static boolean isPalindrome(String reverse_word, String normal_word) {
        boolean result;
        if (normal_word.equals(reverse_word)) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
        /*return(x.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(x.replaceAll("\\W",""))
                        .reverse().toString()));*/
    }

}
