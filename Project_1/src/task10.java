import java.util.Scanner;

public class task10 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число и делитель: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(mod(x,y));
    }
    public static int mod (int a, int b){
        int res =0;
        while (a >= b){
            a= a -b;
            res = a;
        }
        return (res);
    }
}
