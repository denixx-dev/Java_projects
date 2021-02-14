import java.util.Scanner;

public class task8 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        float prob = scn.nextFloat();
        int prize = scn.nextInt();
        int pay = scn.nextInt();
        System.out.println(profitableGamble(prob, prize, pay));
    }
    public static boolean profitableGamble(float a, int b, int c){
        boolean res = false;
        if (a*b > c){
            res = true;
        }
        return (res);
    }
}
