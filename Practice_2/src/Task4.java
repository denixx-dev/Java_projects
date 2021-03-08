import java.util.Scanner;

public class Task4 {
    public static void main (String[] args){
        int[] Arr = new int[]{5, 4, 34 ,-6 ,4 ,6};
        System.out.print(differenceMaxMin(Arr));
    }
    public static int differenceMaxMin(int [] Arr){
        int max= Arr[Arr.length-1];
        int min= Arr[Arr.length-1];

        for (int i=0; i< Arr.length; i++){
            if (Arr[i] > max){
                max = Arr[i];
            }
            if (Arr[i]<min){
                min = Arr[i];
            }
        }

        return (max-min);
    }

}
