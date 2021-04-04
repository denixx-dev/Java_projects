import java.util.Locale;

public class Task9 {
    public static void main(String[] args){
        System.out.print(bomb("Be careful it is a BomB!!!!"));
    }
    public static String bomb(String str){
        String note ="Relax, there is no bomb";
        String[] strArr = str.split("[\\W]");
        for (int i =0; i< strArr.length; i++){
            String upperWord = strArr[i].toUpperCase(Locale.ROOT);
            if (upperWord.equals("BOMB")){
                note = "DUCK!";
            }
        }

        return note;
    }
}
