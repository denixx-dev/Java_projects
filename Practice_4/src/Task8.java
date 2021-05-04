import java.util.*;

public class Task8 {
    public static void main (String[] args) {
         System.out.print(commonLastVowel("OOI UUI EEI AAAAI"));
    }
    public static String commonLastVowel (String str) {
        str = str.toLowerCase().replaceAll("[,.!?:;-]+", "");
        List<String> s = Arrays.asList("euioay".split(""));
        String[] w = str.split(" ");
        HashMap<Integer, String> map = new HashMap<>();
        int k = 0;
        for (String t : w) {
            String v = t.substring(t.length() - 1);
            if (s.contains(v)) {
                map.put(k, v);
                k++;
            }
        }
        return map.get(k - 1);
    }
}
