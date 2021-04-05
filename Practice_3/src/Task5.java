public class Task5 {
    public static void main(String[] args){
        String str = "прпрпGGddsfЛЛЛ";
        System.out.println(reverseCase(str));
    }
    public static String reverseCase(String str){
        char[] charStr = str.toCharArray();
        for (int i=0; i<charStr.length; i++){
            if (charStr[i] >= 'a' & charStr[i] <= 'z' | charStr[i] >= 'а' & charStr[i] <= 'я' ){
                charStr[i] = Character.toUpperCase(charStr[i]);
            }
            else{
                charStr[i] = Character.toLowerCase(charStr[i]);
            }
        }
        return new String(charStr);
    }
}
