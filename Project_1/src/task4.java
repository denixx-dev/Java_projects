import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.print(divisibleByFive(a));

    }
    public static boolean divisibleByFive(int a){
        boolean flag;
        if (a % 5 > 0){
            flag = false;
        }
        else{
            flag = true;
        }
        return (flag);
    }
}
