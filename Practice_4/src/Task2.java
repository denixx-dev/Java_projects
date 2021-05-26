import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task2 {
    public static void main (String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(1);
        arrList.add(4);
        arrList.add(3);
        arrList.add(2);

        int[] array = new int[]{5,1,4,3,2};

        System.out.println(cons(arrList));

    }
    public static boolean cons (ArrayList<Integer> arrList){
        boolean flag=true;

        Collections.sort(arrList);

        int diff = arrList.get(1)- arrList.get(0);

        for(int i=1; i< arrList.size()-1; i++){

            if (arrList.get(i)- arrList.get(i-1) != diff){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
