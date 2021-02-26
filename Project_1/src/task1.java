import java.util.Scanner;
import java.lang.String;

public class task1 {
    public static void main(String[] args){
        System.out.print("Введите кол-во минут: ");
        Scanner scn = new Scanner(System.in);
        float f = scn.nextFloat();
        System.out.print("Кол-во секунд: ");
        System.out.print(minsecconv(f));
        //System.out.print (scn.nextLine ());
    }
    public static float minsecconv(float a){
        return a*60;
    }


}


