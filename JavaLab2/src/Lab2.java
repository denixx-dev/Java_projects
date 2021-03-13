import java.text.DecimalFormat;

public class Lab2 {
    public static void main (String[] args) {
        Point3D firstPoint = new Point3D(6,1,0);
        Point3D secondPoint = new Point3D(2, 2 ,2);
        Point3D thirdPoint = new Point3D();
        Point3D testPoint = new Point3D();

        double xCoord1 = firstPoint.getX();
        double yCoord1 = firstPoint.getY();
        double zCoord1 = firstPoint.getZ();

        double xCoord2 = secondPoint.getX();
        double yCoord2 = secondPoint.getY();
        double zCoord2 = secondPoint.getZ();

        double xCoord3 = thirdPoint.getX();
        double yCoord3 = thirdPoint.getY();
        double zCoord3 = thirdPoint.getZ();

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Расстояние между точками");

        System.out.println(distanceTo(xCoord1, xCoord2, yCoord1, yCoord2, zCoord1, zCoord2));
        System.out.print(testPoint.equalCoords(xCoord1, xCoord2,
               yCoord1, yCoord2, zCoord1, zCoord2));
    }
    public static double distanceTo(double x1, double x2, double y1, double y2, double z1, double z2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)+Math.pow(z2-z1,2));
    }
}
