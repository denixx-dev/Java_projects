import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.imageio.ImageIO;

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
        JPanel upperPanel = new JPanel();
        comboBox.addItem(mandelbrot);
        comboBox.addItem(tricorn);
        comboBox.addItem(burning_ship);
        JLabel label = new JLabel();
        JButton saveBtn = new JButton("Save");
        JPanel lowerPanel = new JPanel();

        imageDisplay = new JImageDisplay(displaySize, displaySize);
        imageDisplay.addMouseListener(new MouseListener());

        //Добавление обработчика нажатия на кнопку сброса
        button.addActionListener(new ActionHandler());


        /** Instance of the MouseHandler on the fractal-display component. **/
        MouseListener click = new MouseListener();
        imageDisplay.addMouseListener(click);

        //Размещение объектов интерфейса
        frame.setLayout(new java.awt.BorderLayout());
        frame.add(imageDisplay, BorderLayout.CENTER);//Создание окна
        frame.add(upperPanel, BorderLayout.SOUTH);//Добавление верхней панели
        frame.add(lowerPanel, BorderLayout.SOUTH);//Добавление нижней панели
        label.setText("Fractal:");//Настройка текста лейбла
        upperPanel.add(label, BorderLayout.NORTH);//Добавление лейбла на панель
        upperPanel.add(comboBox, BorderLayout.NORTH);//Добавление комбобокса на верхнюю панель
        lowerPanel.add(saveBtn, BorderLayout.SOUTH);//Добавление кнопки сохранения на нижнюю панель
        lowerPanel.add(button, BorderLayout.SOUTH);//Добавление кнопки сброса на нижнюю панель
        frame.add(upperPanel,BorderLayout.NORTH);//Добавление самой панели


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Добавление обработчика нажатия на комбобокс
        ActionHandler fractalChooser = new ActionHandler();
        comboBox.addActionListener(fractalChooser);

        //Добаление обработчика нажатия на кнопку Reset
        ActionHandler resetBtnAH = new ActionHandler();
        button.addActionListener(resetBtnAH);

        //Добавление обработчика нажатия на кнопку Save
        ActionHandler saveBtnAH = new ActionHandler();
        saveBtn.addActionListener(saveBtnAH);

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

    private class ActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Reset")) {
                fractalGenerator.getInitialRange(range);
                drawFractal();
            }
            else if (e.getSource() instanceof JComboBox) {
                JComboBox source = (JComboBox) e.getSource();
                fractalGenerator = (FractalGenerator) source.getSelectedItem();
                fractalGenerator.getInitialRange(range);
                drawFractal();
            }
            else if (command.equals("Save")) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("PNG Images", "png");
                FileNameExtensionFilter extensionFilter2 = new FileNameExtensionFilter("jpg images", "jpg");
                fileChooser.setFileFilter(extensionFilter);
                fileChooser.setFileFilter(extensionFilter2);
                fileChooser.setAcceptAllFileFilterUsed(false);
                int userSelection = fileChooser.showSaveDialog(imageDisplay);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    //String fileName = file.toString();
                    try {
                        BufferedImage bufferedImage = imageDisplay.getImage();
                        javax.imageio.ImageIO.write(bufferedImage, "png", file);
                    }
                    catch (Exception exc) {
                        JOptionPane.showMessageDialog(imageDisplay, exc.getMessage(), "Cannot save image", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else return;
            }
        }

    }

    private class MouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            double x = FractalGenerator.getCoord(range.x, range.x + range.width, displaySize, e.getX());
            double y = FractalGenerator.getCoord(range.y, range.y + range.width, displaySize, e.getY());
            fractalGenerator.recenterAndZoomRange(range, x, y, 0.5);
            drawFractal();
        }
    }


    private class FractalWorker extends SwingWorker<Object, Object> {
        //private int Y;
        private final int yCoord;
        private final ArrayList<Integer> computedRGB = new ArrayList<>();

        private FractalWorker(int Y) {
            this.yCoord = Y;
        }

        @Override
        protected Object doInBackground() throws Exception {
            int rgbColor;
            for (int x = 0; x < displaySize; x++) {
                for (int y = 0; y < displaySize; y++) {
                    int counter = fractalGenerator.numIterations(FractalGenerator.getCoord(range.x, range.x + range.width, displaySize, x),
                            fractalGenerator.getCoord(range.y, range.y + range.width, displaySize, y));
                    if (counter == -1) {
                        //imageDisplay.drawPixel(x, y, 0);
                        float hue = 0.7f + (float) counter / 200f;
                        rgbColor = Color.HSBtoRGB(hue,1f,1f);
                        computedRGB.add(rgbColor);
                    }
                    else {
                        float hue = 0.7f + (float) counter / 200f;
                        rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
                        //imageDisplay.drawPixel(x, y, rgbColor);
                        computedRGB.add(rgbColor);
                    }
                }
            }
            return null;
        }
    }
}
