public class Task10 {
    public static void main(String[] args) {
        System.out.println(isNew(321));
    }
    public static boolean isNew(int num) {
        String snum = String.valueOf(num);
        int[] arr = new int[snum.length()];
        if(num < 21){ return true; }
        else{
            for(int i = 1; i < snum.length(); i++){
                arr[i] = Integer.parseInt(String.valueOf(snum.charAt(i)));
            }
            for(int i = 0; i < arr.length-1; i++){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] < arr[i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
