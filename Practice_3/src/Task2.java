import java.text.DecimalFormat;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args){
        System.out.print(otherSides(2));
    }
    public static ArrayList<String> otherSides(float x){
        ArrayList<String> arr = new ArrayList<>();
        DecimalFormat dec = new DecimalFormat("#.##");
        arr.add(dec.format((float)(x*Math.sqrt(3))));
        arr.add (dec.format(2*x));

        return arr;
    }
}
