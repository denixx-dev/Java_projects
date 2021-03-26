import java.util.ArrayList;
import java.util.HashMap;

public class Task1 {
    public static void main (String[] args){
        HashMap<String, Integer> townAndPopulation = new HashMap<>();
        townAndPopulation.put("Nice", 942208);
        townAndPopulation.put("Abu Dhabi", 1482816);
        townAndPopulation.put("Naples", 2186853);


        System.out.println(millionsRounding(townAndPopulation));
    }
    public static HashMap<String, Integer> millionsRounding(HashMap<String, Integer> a){
        int pop1 = a.get("Nice");
        int pop2 = a.get("Abu Dhabi");
        int pop3 = a.get("Naples");

        int res1 = (int)(Math.round((pop1 / 1E6))*1E6);
        a.put("Nice", res1);
        int res2 = (int)(Math.round((pop2 / 1E6))*1E6);
        a.put("Abu Dhabi", res2);
        int res3 = (int)(Math.round((pop3 / 1E6))*1E6);
        a.put("Naples", res3);

        return a;

    }
}
