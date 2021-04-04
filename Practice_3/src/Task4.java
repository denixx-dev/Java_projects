public class Task4 {
    public static void main(String[] args){
        int[] arr = {12,90,75};
        System.out.print(warOfNumbers(arr));
    }
    public static int warOfNumbers (int[] arr){
        int sumChet =0;
        int sumNechet =0;

        for (int i =0; i<arr.length; i++){
            if (arr[i]%2 == 0){
                sumChet += arr[i];
            }
            else{
                sumNechet += arr[i];
            }

        }
        return Math.abs(sumChet-sumNechet);
    }
}
