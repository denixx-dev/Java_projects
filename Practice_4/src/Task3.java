public class Task3 {
    public static void main(String[] args) {
        System.out.println(unmix("lPaeesh le pemu mnxit ehess rtnisg"));
    }
    public static String unmix(String str) {
        char[] charStr = str.toCharArray();
        for (int i=1; i< charStr.length; i+=2){
                char buff = charStr[i];
                charStr[i] = charStr[i-1];
                charStr[i-1] = buff;
        }
        return new String(charStr);
    }
}
