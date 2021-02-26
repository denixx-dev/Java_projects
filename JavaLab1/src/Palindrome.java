import java.util.Scanner;
import java.lang.String;

public class Palindrome {
    public static void main(String[] args){
       /*for (int i =0; i< args.length;i++){
           String s = args[i];
       }*/
       int space =0;
       Scanner scn = new Scanner(System.in);
       String text = scn.nextLine();
       int len = text.length();
       for (int i=0; i<text.length();i++){
           if (text.charAt(i)== ' '){
               space++;
           }
       }
       space++;
       //System.out.print(space);
       System.out.print(reverseString(text));
    }
    public static boolean reverseString(String x){
        /*String str = "";
        int len = x.length();
        for (int j=len; j > 0; j--){
            str += x[j];
        }*/
        return(x.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(x.replaceAll("\\W",""))
                        .reverse().toString()));
    }
}
