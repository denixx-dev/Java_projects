import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите кол-во 2-х очковых бросков: ");
        int a = scn.nextInt();
        System.out.println(' ');
        System.out.print("Введите кол-во 3-х очковых бросков: ");
        int b = scn.nextInt();
        System.out.print(points(a,b));
    }
    public static int points(int a, int b){
        return (2*a + 3*b);
    }
}
