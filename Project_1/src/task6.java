import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = 0;
        int w = 0;
        int h = 0;
        try {
            n = scn.nextInt();
            w = scn.nextInt();
            h = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Введено вещественное число");
        }
        try {
            System.out.println(howManyWalls(n,w,h));
        } catch (Exception e) {
            System.out.print("Ошибка");
        }
    }
    public static int howManyWalls(int a, int b, int c){
        return (a/(b*c));
    }
}
