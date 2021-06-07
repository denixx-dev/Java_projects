import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;

public class Crawler {
    static LinkedList<URLDepthPair> findLink = new LinkedList<URLDepthPair>();
    static LinkedList<URLDepthPair> viewedLink = new LinkedList<URLDepthPair>();
    public static void showResult(LinkedList<URLDepthPair> list) {
        for(URLDepthPair pair : list) {
            System.out.println("Depth: "+ pair.getDepth()+ "\tLink : "+ pair.getURL());
        }
    }
    public static void main(String[] args) {
        /*Scanner scn = new Scanner(System.in);
        System.out.println("Введите URL-адрес: ");
        String url = scn.nextLine();
        System.out.println("Введите глубину: ");
        int depth = scn.nextInt();*/
        String[] pair = new String[]{"https://www.youtube.com/", "1"};
        try{
            getSites(pair[0], Integer.parseInt(pair[1]));
        }
        catch(NumberFormatException | IOException e){
            System.out.println("usage: java Crawler: " + pair[0] +" "+ pair[1]);
        }
    }
    public static void getSites(String pair, int maxDepth) throws IOException {
        findLink.add(new URLDepthPair(pair, 0));
        while (!findLink.isEmpty()) {
            //Вычленение из линкд-листа первой пары для ее обработки
            URLDepthPair currentPair = findLink.removeFirst();
            if (currentPair.depth < maxDepth) {
                Socket socket = new Socket(currentPair.getHost(), 443);
                socket.setSoTimeout(1000);
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    request(out, currentPair);
                    String line;
                    while ((line = in.readLine()) != null) {
                        if (line.contains(URLDepthPair.URL_PREFIX) && line.indexOf('"') != -1) {
                            StringBuilder currentLink = new StringBuilder();
                            int i = line.indexOf(currentPair.URL_PREFIX);
                            while (line.charAt(i) != '"' && line.charAt(i) != ' ') {
                                if(line.charAt(i) != '<') {
                                    currentLink.append(line.charAt(i));
                                    i++;
                                }
                                else{
                                    currentLink.deleteCharAt(currentLink.length()-1);
                                    i++;
                                }
                            }
                            URLDepthPair newPair = new URLDepthPair(currentLink.toString(), currentPair.depth + 1);
                            if (currentPair.check(findLink, newPair) && currentPair.check(viewedLink, newPair) && !currentPair.URL.equals(newPair.URL))
                                findLink.add(newPair);
                        }
                    }
                    socket.close();
                } catch (SocketTimeoutException e) {
                    socket.close();
                }
            }

            viewedLink.add(currentPair);
        }
        showResult(viewedLink);
    }

    public static void request(PrintWriter out, URLDepthPair pair) throws MalformedURLException {
        System.out.println("Get" + pair.getPath()+ " http/1.1");
        System.out.println("Host: " + pair.getHost());
        System.out.println("Connection closed");
        System.out.println();
        System.out.flush();
    }


}
