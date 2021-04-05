public class Task10 {
    public static void main(String[] args){
        System.out.println(parityAnalysis(3));
    }
    public static boolean parityAnalysis(Integer x){
        String intStr = x.toString();
        char[] symArr = intStr.toCharArray();
        int sum=0;
        for (Character charNum : symArr){
            int num = Character.digit(charNum, 10);
            sum += num;
        }
        return (sum%2)==(x%2);
    }
}
