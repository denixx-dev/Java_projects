public class Task7 {
    public static void main (String[] args) {
        undefined(8784);
    }
    public static void undefined (int num) {
        String strNum = Integer.toString(num);

        char[] charStr = strNum.toCharArray();

        if (charStr.length  == 3) {
            char k = charStr[0];
            charStr[0] = charStr[2];
            charStr[2] = k;
        }
        if (charStr.length == 4) {
            char k = charStr[1];
            charStr[1] = charStr[3];
            charStr[3] =k;
        }
        if (charStr.length ==2) {
            char k = charStr[0];
            charStr[0] = charStr[1];
            charStr[1] =k;
        }

        /*if (charStr.length % 2 != 0) {
            for (int i =0; i< charStr.length;i+=2) {
                if (i +2 != charStr.length-1) {
                    char replaceChr = charStr[i];
                    charStr[i] = charStr[i+2];
                    charStr[i+2] = replaceChr;
                }
               *//* else{
                    char replaceChr = charStr[i];
                    charStr[i] = charStr[i-2];
                    charStr[i-2] = replaceChr;
                }*//*
            }
        }*/


        int newInt = Integer.parseInt(new String(charStr));

        if (num - newInt < 0) {
            System.out.println("0");
        }
        else
        System.out.println(num - newInt);
    }
}
