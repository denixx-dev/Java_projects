public class Task8 {
    public static void main(String[] args){
        System.out.print(getXO("zzxx"));
    }
    public static boolean getXO(String x){
        boolean flag = true;
        int xCounter =0;
        int oCounter = 0;

        char[] charStr = x.toCharArray();
        for (int i=0; i< charStr.length; i++){
            if(charStr[i]=='x'){
                xCounter++;
            }
            if(charStr[i]=='o'){
                oCounter++;
            }
        }
        if(xCounter==oCounter){
            flag = true;
        }
        else{
            flag= false;
        }
        return flag;
    }
}
