import java.lang.Math;

public class Point3D {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    // Конструктор инициализации полей класса
    public Point3D(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    // Конструктор инициализации полей при пустых аргументах
    public Point3D(){
        this(0, 0,0);
    }

    // Вывод каждой из координат
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }

    // Изменения координат в main
    public void setX(double val){
        this.xCoord = val;
    }
    public void setY(double val){
        this.yCoord = val;
    }
    public void setZ(double val){
        this.zCoord = val;
    }

    // Метод по сравнению координат
    public boolean equalCoords(double x1, double x2, double y1, double y2, double z1, double z2){
        return (x1==x2)&(y1==y2)&(z1==z2);
    }

}
