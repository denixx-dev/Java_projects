import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите кол-во кадров и минут: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.print(frames(x,y));
    }
    public static int frames(int a , int b ){
        return (a*b*60);
    }
}
