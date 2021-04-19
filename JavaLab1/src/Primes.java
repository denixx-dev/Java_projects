public class Primes{
    public static void main(String[] args){
        for(int i=2; i<=100; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static boolean isPrime(int n){
        boolean sosiska=true;
        for(int i=2; i<n; i++)
            if (n%i == 0){
                sosiska = false;
                break;
            }
        return sosiska;
    }
}