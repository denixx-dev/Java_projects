public class Task5 {
    public static void main (String[] args) {
        System.out.println(longestRun(new int[]{3,2,1,5,6,7}));
    }
    public static int longestRun (int[] arr) {
        int count=0;
        int mx = 1;
        int mn = 1;
        int max = 0;
        int min = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1] - 1){
                mx += 1;
            }
            else{mx = 1;}

            if(arr[i] == arr[i+1] + 1){
                mn += 1;
            }
            else{mn = 1;}
            if(mx > max){ max = mx;}
            if(mn > min){ min = mn;}
        }
        if(min > max){
            return min;
        }
        return max;
    }
}
