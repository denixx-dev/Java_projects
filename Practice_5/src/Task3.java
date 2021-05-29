public class Task3 {
    public static void main(String[] args) {
        System.out.println(digitsCount(100));
    }
    public static int digitsCount(int x) {
        if(x>0) {
            return digitsCount(x/10)+1;
        }
        return 0;
    }
}
