import java.util.Scanner;

public class Primes {
    public static void main (String[] args){
        for (int j =2; j <= 100; j++){
          if (isPrime(j)==false){
              System.out.print(j + " ");
          }
        }
    }
    public static boolean isPrime(int n){
        boolean flag=false;
        int i;
        for (i=2; i < n; i++){
            if (n%i==0){
                flag =true;
                break;
            }
        }
        return(flag);
    }
}
