public class Task9 {
    public static void main (String[] args){
        int[] arr = {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
        System.out.println(mean(arr));
    }
    public static double mean (int[] arr){
        double sum=0;
        for (int summ : arr){
            sum+=summ;
        }
        return sum/arr.length;
    }
}
