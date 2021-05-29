public class Task6 {
    public static void main(String[] args) {
        String[] arr = {"95%", "83%", "90%", "87%", "88%", "93%"};

        System.out.println(takeDownAverage(arr));
    }
    public static String takeDownAverage(String[] arr){
        int array[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replace("%", "");
            array[i] = Integer.parseInt(arr[i]);
        }
        double sum = 0;
        for(int num : array){
            sum += num;
        }
        sum = sum/array.length;
        return String.valueOf(Math.round(sum - 5*(array.length +1))) + "%";
    }
}
