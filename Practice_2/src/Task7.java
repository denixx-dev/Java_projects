import java.util.Scanner;

public class Task7 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int prog1 = scan.nextInt();
        int prog2 = scan.nextInt();
        int prog3 = scan.nextInt();
        System.out.print(programmers(prog1, prog2, prog3));
    }
    public static int programmers(int prog1, int prog2, int prog3){
        int max =prog1;
        int min = prog1;
        if (max<prog2){
            max = prog2;
        }
        if (max<prog3){
            max = prog3;
        }
        if (min>prog2){
            min = prog2;
        }
        if (min>prog3){
            min = prog3;
        }
        return max - min;
    }
}
