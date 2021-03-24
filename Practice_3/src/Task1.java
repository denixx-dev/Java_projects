import java.util.ArrayList;

public class Task1 {
    public static void main (String[] args){
        String[] townAndPopulation = new String[]{"Nepal", "572"};
        System.out.print(millionsRounding(townAndPopulation));
    }
    public static String millionsRounding(String[] townsAndPopulation){
        //String town = townsAndPopulation[0];
        String pop = townsAndPopulation[1];
        /**
         * Представление строки в виде числа
         */
        int population = Integer.parseInt(townsAndPopulation[1]);
        //int length = townsAndPopulation[1].length();
        int div = (int)(population / Math.pow(10,6));
        int res=0;
        /**
         * Проверка на то, является ли число меньшим, чем миллион
         */
        if (div == 0){
            double diff = Math.pow(10,6)*(div+1)-population;
            if (diff <= 500000){
                res = (int)Math.pow(10,6)*(div+1);
            }
        }
        else{
            double diff = population-Math.pow(10,6)*div;
            if(diff <= 500000){
                res = (int)Math.pow(10,6)*div;
            }
        }
        pop = Integer.toString(res);
        return townsAndPopulation[0]+' '+pop;

    }
}
