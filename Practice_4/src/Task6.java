import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args){

        int[] intArr = new int[]{14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};

        System.out.println(largestGap(intArr));

    }
    public static int largestGap(int[] intArr) {
        Arrays.sort(intArr);

        int max = intArr[0]-intArr[1];

        for (int i=1; i<intArr.length-1;i++){
            if (Math.abs(intArr[i]-intArr[i-1])>max) {
                max = Math.abs(intArr[i]-intArr[i-1]);
            }
        }
        return max;

    }
}
