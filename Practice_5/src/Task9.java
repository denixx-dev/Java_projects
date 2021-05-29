import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(timeDifference("London", "July 31, 1983 23:01", "Rome"));
    }
    public static String timeDifference(String cityA, String strDate, String cityB){
        SimpleDateFormat formater = new SimpleDateFormat("MMMM d, yyyy HH:mm", Locale.ENGLISH);
        SimpleDateFormat formater2 = new SimpleDateFormat("yyyy-M-d HH:mm", Locale.ENGLISH);
        Date date;
        try {
            date = formater.parse(strDate);
        } catch (ParseException e) {
            date = new Date(23);
            e.printStackTrace();
        }
        HashMap<String, Integer> city = new HashMap<>();
        city.put("Los Angeles", -800);
        city.put("New York", -500);
        city.put("Caracas", -430);
        city.put("Buenos Aires", -300);
        city.put("London", 0);
        city.put("Rome", 100);
        city.put("Moscow", 300);
        city.put("Tehran", 330);
        city.put("New Delphi", 530);
        city.put("Beijing", 800);
        city.put("Canberra", 1000);
        int chA = city.get(cityA) / 100;
        int mnA = city.get(cityA) % 100;
        int chB = city.get(cityB) / 100;
        int mnB = city.get(cityB) % 100;
        date.setHours(date.getHours()+chB-chA);
        date.setMinutes(date.getMinutes()+mnB-mnA);
        return formater2.format(date);
    }
}
