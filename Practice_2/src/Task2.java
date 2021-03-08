import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scn.nextLine();
        System.out.print(nameShuffle(str));
    }
    public static String nameShuffle(String x){
        String[] dividedName = x.split(" ");
        String shuffledName = dividedName[1] + " " + dividedName[0];
        return (shuffledName);
    }
}
