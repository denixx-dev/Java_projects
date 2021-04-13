import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {27 ,55 ,9};
        System.out.print(sevenBoom(arr));
    }
    public static String sevenBoom (int[] arr) {
        boolean flag=false;
        String res;
        ArrayList<String> strArr = new ArrayList<>();

        for (int elem : arr){
            String strElem = Integer.toString(elem);
            strArr.add(strElem);
        }
        for(String arrElem : strArr){
            char[] charElems = arrElem.toCharArray();
            for (char chrElem : charElems){
                if (chrElem == '7') {
                    flag = true;
                    break;
                }
            }
        }
        if (flag){
            res = "Boom!";
        }
        else{
            res = "there is no 7 in the array";
        }
        return res;
    }
}
