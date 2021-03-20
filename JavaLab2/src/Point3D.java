import java.lang.Math;
import java.text.DecimalFormat;

public class Point3D extends Point2D{
    private double zCoord;

    // Конструктор инициализации полей класса
    public Point3D(double x, double y, double z){
        zCoord = z;
    }

    // Конструктор инициализации полей при пустых аргументах
    public Point3D(){
        this(0, 0,0);
    }

    // Вывод каждой из координат
    public double getZ(){
        return zCoord;
    }

    // Изменения координат в main
    public void setZ(double val){
        this.zCoord = val;
    }
    
    // Метод по сравнению координат через объекты
    public boolean equalCoords(Point3D point1, Point3D point2){
        return (point1.getX()== point2.getX())
                & (point1.getY()==point2.getY()) & (point1.getZ()==point2.getZ());
    }

    // Метод рассчета расстояния между точками через объекты
    public double distanceTo(Point3D point1, Point3D point2){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result = Math.sqrt(Math.pow(point1.getX()-point2.getX(),2)
                + Math.pow(point1.getY()- point2.getY(),2) + Math.pow(point1.getZ()- point2.getZ(),2));
        return result;
    }
}
