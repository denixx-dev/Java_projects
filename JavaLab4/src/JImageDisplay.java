import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;


public class JImageDisplay extends JComponent {
    private final BufferedImage img;

    public BufferedImage getImage(){
        return img;
    }


    //Конструктор для управления изображением, содержимое которого нужно записать
    public JImageDisplay(int w, int h) {
        img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Dimension dim = new Dimension(w, h);
        super.setPreferredSize(dim);
    }

    //Метод для вызова графического интерфейса
    /*public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JButton jButton = new JButton();
        BorderLayout borderLayout = new BorderLayout();
    }*/

    public void clearImage() {
        int[] blankArray = new int[getHeight()*getWidth()];
        img.setRGB(0,0,getWidth(),getHeight(),blankArray,0,1);
    }

    public void drawPixel(int x, int y, int rgbColor) {
        img.setRGB(x,y,rgbColor);
    }

    @Override
    public void setPreferredSize(Dimension preferredSize) {
        super.setPreferredSize(preferredSize);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.setColor(Color.blue);
        //g.fill3DRect(10, 10, 100, 200,true);
        g.drawImage(img,0,0,img.getWidth(),img.getHeight(),null);
    }


}
