import java.util.ArrayList;

public class Task1 {
    public static void main (String[] args){
        String[] townAndPopulation = new String[]{"Nepal", "2186853"};
        System.out.print(millionsRounding(townAndPopulation));
    }
    public static double millionsRounding(String[] townsAndPopulation){
        int population = Integer.parseInt(townsAndPopulation[1]);
        int length = townsAndPopulation[1].length();
        double diff = Math.pow(10,length)-population;
        if ((diff <= 500000)&(population < Math.pow(10,length))) {
            return Math.pow(10,length);
        }
        else{
            return 0;
        }
        //return 0;
    }
}
