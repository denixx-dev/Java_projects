import java.util.Scanner;

public class Task5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.print(equal(a,b,c));
    }
    public static int equal(int a, int b, int c){
        int kol=0;
        if (a==b){
            kol=2;
        }
        if(b==c){
            kol=2;
        }
        if(a==c){
            kol=2;
        }
        if((a==b)&(a==c)&(b==c)){
            kol++;
        }
        return(kol);
    }
    public static int pub(){
        return Task5.pri();

    }
    private static int pri(){
        return 2;
    }
}
