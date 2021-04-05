import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(rps("paper", "scissors"));
    }

    public static String rps(String player1, String player2) {
        String res = "Неверно введены данные";
        //HashMap<String, Boolean> words = new HashMap<>();
        first:
            if (player1 == "scissors" & player2 == "scissors") {
             res = "TIE";
             break first;
            }
        second:
            if (player1 == "scissors" & player2 == "paper") {
                res = "Player 1 wins";
                break second;
            }
            else if (player1 == "paper" & player2 == "scissors") {
            res = "Player 2 wins";
            break second;
            }
        third:
            if (player1 == "scissors" & player2 == "rock") {
                res = "Player 2 wins";
                break third;
            }
            else if (player1 == "rock" & player2 == "scissors"){
                res = "Player 1 wins";
                break third;
            }
        fourth:
            if(player1 == "paper" & player2 == "paper"){
                res = "TIE";
                break fourth;
            }
        fifth:
            if (player1 == "paper" & player2 == "rock"){
                res = "Player 1 wins";
                break fifth;
            }
            else if (player1 == "rock" & player2 == "paper"){
                res = "Player 2 wins";
                break fifth;
            }
        sixth:
            if (player1 == "rock" & player2 == "rock"){
                res = "TIE";
                break sixth;
            }
        return res;
        /*final int scissors1 = 1;
        final int paper1 = 1<<1;
        final int rock1 = 1<<2;
        final int scissors2 = 1<<3;
        final int paper2 = 1<<4;
        final int rock2 = 1<<5;

        final int tie = 0;
        final int win1 = 1;
        final int win2 =2;*/
    }
}
