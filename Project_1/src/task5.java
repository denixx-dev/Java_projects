import java.lang.String;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        //Scanner b = new Scanner(System.in);
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
        System.out.print(and(x,y));
    }
    public static boolean and(boolean a, boolean b){
        boolean res = true;
        if ((a == true) & (b == true)){
            res = true;
        }
        else {
            res = false;
        }
        return (res);
    }
}
