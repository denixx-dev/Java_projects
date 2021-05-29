public class Task2 {
    public static void main(String[] args) {
        System.out.println(spiderVSFly("A4", "B2"));
    }
    public static String spiderVSFly(String spider, String fly) {
       int spiderX = spider.charAt(0)-65;
       int spiderY = spider.charAt(1)-48;
       int flyX = fly.charAt(0)-65;
       int flyY = fly.charAt(1)-48;

       double distance1 = spiderY+flyY;
       double distance2 = Math.abs(spiderY-flyY) + ((spiderX+flyX)%8)* flyY*0.785398;

       String finalPath = "";

       if(distance1 <= distance2) {
           for (int i =0; i< spiderY;i++) {
                finalPath += String.valueOf(spider.charAt(0)) + String.valueOf(spiderY-i) + "-";
           }
           finalPath += "A0-";
           for (int i=0; i<flyY; i++) {
               finalPath += String.valueOf(fly.charAt(0)) + String.valueOf(i+1) + "-";
           }
       }
       else {
        for (int i=0; i<Math.abs(spiderY-flyY); i++) {
            finalPath += spider.charAt(0);
            if (spiderY > flyY) {
                finalPath += spiderY - 1;
            } else {
                finalPath += spiderY + i;
            }
            finalPath += '-';
        }
        for(int i=0; i<=(spiderX+flyX)%8; i++) {
            finalPath +=(char)(65+(spiderX+i)%8)+String.valueOf(fly.charAt(1)) +"-";
        }

       }
        return finalPath.substring(0, finalPath.length()-1);
    }
}
