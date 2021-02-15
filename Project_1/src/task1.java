import java.util.Scanner;
import java.lang.String;

public class task1 {
    public static void main(String[] args){
        System.out.print("Введите кол-во минут: ");//Вывод сообщения
        Scanner scn = new Scanner(System.in);//Инициализация объекта scn
        float f = scn.nextFloat();//Присваивание введенного значения в переменную f
        System.out.print("Кол-во секунд: ");//Вывод сообщения
        System.out.print(minsecconv(f));//Вызов и вывод значения функции
    }
    public static float minsecconv(float a){
        return a*60;
    }
}
