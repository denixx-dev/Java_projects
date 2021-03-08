import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
        int numCol1 =1;
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

    for (int i=0;i<b+1;i++){
        for (int j =0;j<3;j++){
            System.out.print(Arr[i][j]);
        }
        System.out.println("");
    }
    System.out.print(oppositeHouse(a,b));
    }

    private static int oppositeHouse(int x, int b) {
        int numCol1 =1;
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
        }
        return (res);
    }
}
