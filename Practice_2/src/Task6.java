import java.util.Scanner;

public class Task6 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.print(reverseString(str));
    }
    public static String reverseString(String word) {
        char[] array = word.toCharArray();
        String reverse_word = "";
        for (int n = array.length - 1; n >= 0; n--) {
            reverse_word = reverse_word + array[n];
        }
        return (reverse_word);
    }
}
