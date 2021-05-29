public class Task8 {
    public static void main(String[] args) {
        System.out.println(maxPossible(523,76));
    }
    public static int maxPossible(int x, int y) {
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);
        for (int i=0; i< strX.length();i++) {
            int subst =-1;
            for (int j=0; j<strY.length();j++) {
                if(Integer.parseInt(String.valueOf(strY.charAt(j)))>
                Integer.parseInt(String.valueOf(strX.charAt(i)))) {
                    strX = strX.replaceFirst(String.valueOf(strX.charAt(i)),String.valueOf(strY.charAt(j)));
                    subst =j;
                }
            }
            if (subst != -1){
                strY = strY.replaceFirst(String.valueOf(strY.charAt(subst)), "0");
            }
        }

        return Integer.parseInt(strX);
    }
}
