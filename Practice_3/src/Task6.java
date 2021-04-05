import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main (String[] args){
        String str = "Dooma";
        System.out.println(doofenShmirtz(str));
    }
    public static String doofenShmirtz (String str){
        int length = str.length();
        String res= "";
        ArrayList<Character> charArray = new ArrayList<>();
        charArray.add('a');
        charArray.add('e');
        charArray.add('i');
        charArray.add('o');
        charArray.add('u');
        charArray.add('y');

        if (charArray.contains(str.charAt(length-1))){
            int model = (int)(length * 1E3);
            str += "-inator "+model;
        }
        else{
            int model = (int)(length * 1E3);
            str += "inator "+model;
        }
        return str;
    }
}
