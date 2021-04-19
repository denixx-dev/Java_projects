public class Task9 {
    public static void main(String[] args) {
        System.out.println(memeSum(1222, 30277));
    }
    public static int memeSum(int x, int y) {
        String strX = Integer.toString(x);
        String strY = Integer.toString(y);

        int lenX = strX.length();
        int lenY = strY.length();

        int diff = Math.abs(lenX-lenY);

        if (lenX<lenY) {
            for(int i=1; i<=diff;i++){
                strX = '0' + strX;
            }
        }
        else {
            for(int i=1; i<=diff;i++){
                strY = '0' + strY;
            }
        }

        lenX = strX.length();
        //lenY = strY.length();

        //int newY = Integer.parseInt(strY);
        int res;


        String buffStr="";
       for (int i=0; i<lenX; i++) {
            buffStr += Integer.toString(Character.digit(strX.charAt(i),10)
            +Character.digit(strY.charAt(i),10));
       }

        return Integer.parseInt(buffStr);
    }
}
