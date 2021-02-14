import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число: ");
        float x = scn.nextFloat();
        System.out.print(squared(x));
    }
    public static float squared(float b){
        return(b*b);
    }
}
