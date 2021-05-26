import java.util.Arrays;

public class Task7 {
    public static void main (String[] args) {
        undefined(149);
    }
    public static void undefined (int num) {
        String strNum = Integer.toString(num);



        /*if (charStr.length  == 3) {
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
        }*/

        //Перевод числа в массив цифр
        int x = num;
        String s = Integer.toString(x);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x /= 10;
        }
        Arrays.sort(arr);

        char[] charArr = new char[arr.length];

        for(int i=0; i< arr.length;i++) {
            charArr[i] = Character.forDigit(arr[i],10);
        }

        int newInt = Integer.parseInt(new String(charArr));

        if (num - newInt < 0) {
            System.out.println("0");
        }
        else
        System.out.println(num - newInt);
    }
}
