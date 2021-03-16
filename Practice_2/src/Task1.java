import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    /*for (int i=0;i<b;i++){
        for (int j =0;j<2;j++){
            System.out.print(Arr[i][j]);
        }
        System.out.println("");
    }*/
    System.out.print(oppositeHouse(a,b));
    }

    private static int oppositeHouse(int x, int b) {
        int rowNum;
        int res=0;
        if (x%2==0){
            rowNum = (2*b - x)/2 + 1;
        }
        else{
            rowNum = (1 + x)/2;
        }

        if (x%2==0){
            res = (2*b-1)-(b - rowNum)*2;
        }
        else{
            res = (b - rowNum)*2+2;
        }

        /*int numCol1 =1;
        int numCol2 = 2*b;
        int res=0;
        int[][] Arr = new int[b+1][3];
        for (int i=1;i<=b;i++){
            Arr[i][1]=numCol1;
            numCol1 += 2;
        }
        for(int i =1;i<=b;i++){
            Arr[i][2]= numCol2;
            numCol2 -= 2;
        }
        for (int i=1; i<=b;i++){
            for (int j =1; j<3;j++){
                if ((Arr[i][j] == x)){
                    if((Arr[i][j] % 2) ==0){
                        res = Arr[i][j-1];
                    }
                    if ((Arr[i][j] % 2) !=0) {
                        res = Arr[i][j+1];
                    }
                }
            }
        }*/
        return (res);
    }
    //public static int oppositeHouse
}

// От макс знач. четного дома отнять текущий четный дом, разделить на два и прибавить единицу(номер строки для четных домов)

// К мин значению нечетного дома прибавить текущий нечетный дом и разделить на два(номер строки нечетного дома)

// По строке текущего четного дома вычисляем кол-во промежутков между макс. четным и текущим четным,
// умножаем это на разницу между каждым домом и вычитаем из макс значения четного дома

// По строке текущего нечетного дома вычисляем кол-во промежутков между мин. нечетным и текущим нечетным,
// умножаем это на разницу между каждым домом и прибавляем к ммн. значению нечетного дома