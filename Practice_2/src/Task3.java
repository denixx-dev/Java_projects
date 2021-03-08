import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        System.out.println("Введите цену и скидку: ");
        Scanner scan = new Scanner(System.in);
        float price = scan.nextInt();
        float disc = scan.nextInt();
        System.out.print(discount(price,disc));
    }
    public static float discount (float price, float disc){
        return price-(price*disc/100);
    }
}
