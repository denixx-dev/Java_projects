public class Task7 {
    public static void main (String[] args){
        System.out.print(doesBrickFit(1,2,2,1,1));
    }
    public static boolean doesBrickFit(int a, int b, int c, int w, int h){
        return (w == a && h == b) || (h == a && a == b) || (w == b && h == c)
                || (w == c && h == a) || (w==c && h == b) || (w==a && h==c);
    }
}
