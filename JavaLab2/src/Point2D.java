import java.lang.Math;
import java.text.DecimalFormat;

public class Point2D {
    private double xCoord;
    private double yCoord;

    // Конструктор инициализации полей класса
    public Point2D(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    // Конструктор инициализации полей при пустых аргументах
    public Point2D() {
        this(0, 0);
    }

    // Вывод каждой из координат
    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    // Изменения координат в main
    public void setX(double val) {
        this.xCoord = val;
    }

    public void setY(double val) {
        this.yCoord = val;
    }
}