public class Task4 {
    public static void main(String[] args){
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!" ));
    }
    public static String noYelling(String str) {
        int i = str.length()-1;
        int index;
        while ((str.charAt(i) == '?' | str.charAt(i) == '!') & (str.charAt(i-1)=='!' | str.charAt(i-1)=='?')) {
            i--;
        }
        i++;
        return str.substring(0,i);
    }
}
