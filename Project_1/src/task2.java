import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(points(a,b));
    }
    public static int points(int a, int b){
        return (2*a + 3*b);
    }
}
