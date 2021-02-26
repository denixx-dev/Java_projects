import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Palindrome {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       String text = scn.nextLine();
        String[] sp = text.split(" ");
        for (int i=0; i < sp.length; i++){
            System.out.print(isPalindrome(sp[i]) + " ");
        }
    }
    private static boolean isPalindrome(String x){
        return(x.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(x.replaceAll("\\W",""))
                        .reverse().toString()));
    }
}
