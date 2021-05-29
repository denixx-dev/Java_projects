import java.util.ArrayList;
import java.util.HashMap;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!"));
    }
    public static String rearrange(String sentence) {
        String[] splitSent = sentence.split(" ");
        String buffer;
        for (int i=0;i< splitSent.length;i++) {
            for (int j=1; j<= splitSent.length;j++) {
                if(splitSent[i].contains(String.valueOf(j))){
                    buffer = splitSent[i];
                    splitSent[i] = splitSent[j-1];
                    splitSent[j-1] = buffer;
                }
            }
        }
        String res ="";
        for (int i=0; i< splitSent.length;i++) {
            res += splitSent[i] + " ";
        }
        for (int i=0; i<10; i++) {
            res = res.replace(String.valueOf(i), "");
        }
        return res;
    }
}
