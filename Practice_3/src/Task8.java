public class Task8 {
    public static void main (String[] args){
        System.out.printf("%.2f",totalDistance(36.1, 8.6, 3, true));
    }
    public static double totalDistance(double fuel, double fuelCons, int passNum, boolean cond){

        return fuel*100/(fuelCons * (cond ? 1.1 : 1) * (1+ passNum*0.05));
    }
}
