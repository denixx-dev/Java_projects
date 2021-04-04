public class Task5 {
    public static void main(String[] args){
        String str = "lllllUUUU";
        System.out.println(reverseCase(str));
    }
    public static String reverseCase(String str){
        char[] charStr = str.toCharArray();
        for (int i=0; i<charStr.length; i++){
            if ((int)charStr[i] >= 97 & (int)charStr[i] <= 122 ){
                charStr[i] = Character.toUpperCase(charStr[i]);
            }
            else{
                charStr[i] = Character.toLowerCase(charStr[i]);
            }
        }
        return new String(charStr);
    }
}
