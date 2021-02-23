import java.lang.String;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        System.out.print(and(true,false));
        /*Scanner a = new Scanner(System.in);
        System.out.println("Введите два булевых значение: ");
        boolean x = false;
        try {
            x = a.nextBoolean();
        } catch (Exception e) {
            System.out.println("Неверно введены данные");
        }
        boolean y = false;
        try {
            y = a.nextBoolean();
        } catch (Exception e) {
            System.out.println("Неверно введены данные");
        }
        System.out.print(and(x,y));*/
    }
    public static boolean and(boolean a, boolean b){
        /*boolean res = true;
        if ((a == true) & (b == true)){
            res = true;
        }
        else {
            res = false;
        }*/
        return (a && b);
    }
}
