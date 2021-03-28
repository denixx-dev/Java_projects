import java.util.ArrayList;
import java.util.HashMap;

public class Task1 {
    public static void main (String[] args){
        HashMap<String, Integer> townAndPopulation = new HashMap<>();
        townAndPopulation.put("Nice", 11200000);
        townAndPopulation.put("Abu Dhabi", 499000);
        townAndPopulation.put("Naples", 2186853);
        townAndPopulation.put("Moscow", 15500000);


        System.out.println(millionsRounding(townAndPopulation));
    }
    public static HashMap<String, Integer> millionsRounding(HashMap<String, Integer> a){
        ArrayList<Integer> values = new ArrayList<>(a.values());
        int eachPop=0;
        int i=0;
        ArrayList<String> keys = new ArrayList<>(a.keySet());
        for (Integer value : values) {
            eachPop = (int)(Math.round(value/1E6)*1E6);
            a.replace(keys.get(i), eachPop);
            i++;
        }

        return a;

    }
}
