public class Task4 {
    public static void main(String[] args) {
        String[] guessedWords = new String[]{"trance", "recant"};
        System.out.println(totalPoints(guessedWords, "recant"));
    }
    public static int totalPoints(String guessedWords[], String word) {
        int count=0;
        boolean flag;
        String str;
        for (int i=0; i<guessedWords.length;i++) {
            flag = true;
            str = word;
            for (int j=0; j<guessedWords[i].length(); j++) {
                if(!str.contains(String.valueOf(guessedWords[i].charAt(j)))){
                    flag = false;
                    break;
                }
                else {
                    str = str.replaceFirst(String.valueOf(guessedWords[i].charAt(j))," ");
                }
            }
            if(flag && guessedWords[i].length() == 6) {
                count += guessedWords[i].length()-2 +50;
            }
            else if (flag) {
                count += guessedWords[i].length()-2;
            }
        }
    return count;
    }
}
