public class Task10 {
    public static void main(String[] args){
        System.out.print(sameAscii("EdAbit", "EDABIT"));
    }
    public static boolean sameAscii(String a, String b){
        char[] aParsed = a.toCharArray();
        char[] bParsed = b.toCharArray();
        int aAscii=0;
        int bAscii=0;
        for (int i=0; i< aParsed.length;i++){
            aAscii += (int)aParsed[i];
        }
        for(int i=0; i< bParsed.length;i++){
            bAscii += (int)bParsed[i];
        }
        return (aAscii==bAscii);
    }
}
