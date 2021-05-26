import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args){

        int[] intArr = new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};

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
