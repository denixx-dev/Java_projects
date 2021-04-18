import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class FractalExplorer {
    //Размер экрана
    private int displaySize;

    //Ссылка для обновления отображения
    private JImageDisplay display;

    //Объект для создания разных видов фракталов
    private FractalGenerator fractalGenerator;

    //Диапазон поля для просмотра
    private Rectangle2D.Double range;

    //Конструктор, принимающий значения размера и создающий объекты диапазона и фрактального генератора
    public FractalExplorer(int size) {
        displaySize = size;
        range = new Rectangle2D.Double();
        fractalGenerator = new Mandelbrot();
        fractalGenerator.getInitialRange(range);
        display = new JImageDisplay(size, size);
    }

    //Метод по отображению графического интерфейса
    public void createAndShowGUI() {
        JFrame jFrame = new JFrame("Fractal Explorer");
        jFrame.add(display, BorderLayout.CENTER);

        JPanel jPanel =new JPanel();
        jFrame.add(jPanel, BorderLayout.SOUTH);

        JButton resetBtn = new JButton("Reset");
        jPanel.add(resetBtn);

        //jFrame.add(resetBtn,BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setResizable(false);
    }

    private void drawFractal() {
        for (int x =0; x < displaySize; x++) {
            for (int y=0; y<displaySize; y++) {
                double xCoord = fractalGenerator.getCoord(range.x, range.x+range.width, displaySize, x);
                double yCoord = fractalGenerator.getCoord(range.y, range.y+range.height, displaySize, y);

                int locIterations = fractalGenerator.numIterations(xCoord, yCoord);

                if (locIterations == -1)
                    display.drawPixel(x,y,0);
                else {
                    float hue = 0.7f + (float)locIterations/200f;
                    int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                    display.drawPixel(x,y,rgbColor);
                }
            }
        }
        display.repaint();
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            //Обработка нажатия на кнопку сброса
            if (command.equals("Reset")) {
                fractalGenerator.getInitialRange(range);
                drawFractal();
            }
        }
    }

    private class MouseHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            double xCoord = fractalGenerator.getCoord(range.x, range.x+range.width, displaySize,x);

            int y = e.getY();
            double yCoord = fractalGenerator.getCoord(range.y, range.y+range.height, displaySize, y);

            fractalGenerator.recenterAndZoomRange(range, xCoord, yCoord, 0.5);

            drawFractal();

        }
    }

    public static void main(String[] args)
    {
        FractalExplorer displayExplorer = new FractalExplorer(800);
        displayExplorer.createAndShowGUI();
        displayExplorer.drawFractal();
    }





}
