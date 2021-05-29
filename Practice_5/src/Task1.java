public class Task1 {
    public static void main(String[] args) {
        System.out.println(sameLetterPattern("FFGG", "CDCD"));
    }
    public static boolean sameLetterPattern(String str1, String str2) {
        for (int i=0; i<str2.length();i++) {
            str2 = str2.replace(str2.charAt(i), str1.charAt(i));
        }
        return str1.equals(str2);
    }
}
