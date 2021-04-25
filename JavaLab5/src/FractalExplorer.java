import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class FractalExplorer {
    private final int displaySize;
    private JImageDisplay imageDisplay;
    private FractalGenerator fractalGenerator;
    private Rectangle2D.Double range;

    private FractalExplorer (int size) {
        displaySize = size;

        /** Initializes the fractal-generator and range objects. **/
        fractalGenerator = new Mandelbrot();
        range = new Rectangle2D.Double();
        fractalGenerator.getInitialRange(range);
        imageDisplay = new JImageDisplay(displaySize, displaySize);

    }

    public static void main(String[] args) {
        FractalExplorer fractalExplorer = new FractalExplorer(600);
        fractalExplorer.setGUI();
        fractalExplorer.drawFractal();
    }

    // задание интерфейса
    public void setGUI() {
        FractalGenerator mandelbrot = new Mandelbrot();
        FractalGenerator tricorn = new Tricorn();
        FractalGenerator burning_ship = new Burning_ship();
        //Инициализация объектов интерфейса
        JFrame frame = new JFrame("Fractal Generator");
        JButton button = new JButton("Reset");
        JComboBox comboBox = new JComboBox();
        JPanel panel = new JPanel();
        comboBox.addItem(mandelbrot);
        comboBox.addItem(tricorn);
        comboBox.addItem(burning_ship);
        JLabel label = new JLabel();

        imageDisplay = new JImageDisplay(displaySize, displaySize);
        imageDisplay.addMouseListener(new MouseListener());

        //Добавление обработчика нажатия на кнопку сброса
        button.addActionListener(new ActionHandler());


/*        *//** Instance of the MouseHandler on the fractal-display component. **//*
        MouseListener click = new MouseListener();
        imageDisplay.addMouseListener(click);*/

        //Размещение объектов интерфейса
        frame.setLayout(new java.awt.BorderLayout());
        frame.add(imageDisplay, BorderLayout.CENTER);//Создание окна
        frame.add(button, BorderLayout.SOUTH);//Добавление кнопки сброса
        label.setText("Fractal:");
        panel.add(label, BorderLayout.NORTH);//Добавление лейбла на панель
        panel.add(comboBox, BorderLayout.NORTH);//Добавление комбобокса на панель
        frame.add(panel,BorderLayout.NORTH);//Добавление самой панели


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Добавление обработчика нажатия на комбобокс
        ActionHandler fractalChooser = new ActionHandler();
        comboBox.addActionListener(fractalChooser);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    // отрисовка фрактала в JImageDisplay
    private void drawFractal() {
        for (int x = 0; x < displaySize; x++) {
            for (int y = 0; y < displaySize; y++) {
                int counter = fractalGenerator.numIterations(FractalGenerator.getCoord(range.x, range.x + range.width, displaySize, x),
                        fractalGenerator.getCoord(range.y, range.y + range.width, displaySize, y));
                if (counter == -1) {
                    imageDisplay.drawPixel(x, y, 0);
                }
                else {
                    float hue = 0.7f + (float) counter / 200f;
                    int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                    imageDisplay.drawPixel(x, y, rgbColor);
                }
            }
        }
        imageDisplay.repaint();
    }

    public class ActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command == "Reset") {
                fractalGenerator.getInitialRange(range);
                drawFractal();
            }
            else if (e.getSource() instanceof JComboBox) {
                JComboBox source = (JComboBox) e.getSource();
                fractalGenerator = (FractalGenerator) source.getSelectedItem();
                fractalGenerator.getInitialRange(range);
                drawFractal();
            }
        }

    }

    public class MouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            double x = FractalGenerator.getCoord(range.x, range.x + range.width, displaySize, e.getX());
            double y = FractalGenerator.getCoord(range.y, range.y + range.width, displaySize, e.getY());
            fractalGenerator.recenterAndZoomRange(range, x, y, 0.5);
            drawFractal();
        }
    }
}
