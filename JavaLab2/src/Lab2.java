import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2 {
    public static void main (String[] args) {
        Point3D firstPoint = new Point3D();
        Point3D secondPoint = new Point3D();
        Point3D thirdPoint = new Point3D();
        //Point3D testPoint = new Point3D();

        System.out.println("Введите координаты первой точки: ");
        Scanner scan = new Scanner((System.in));

        double xCoord1 = scan.nextDouble();
        firstPoint.setX(xCoord1);
        double yCoord1 = scan.nextDouble();
        firstPoint.setY(yCoord1);
        double zCoord1 = scan.nextDouble();
        firstPoint.setZ(zCoord1);

        System.out.println("Введите координаты второй точки: ");

        double xCoord2 = scan.nextDouble();
        secondPoint.setX(xCoord2);
        double yCoord2 = scan.nextDouble();
        secondPoint.setY(yCoord2);
        double zCoord2 = scan.nextDouble();
        secondPoint.setZ(zCoord2);

        System.out.println("Введите координаты третьей точки: ");

        double xCoord3 = scan.nextDouble();
        thirdPoint.setX(xCoord3);
        double yCoord3 = scan.nextDouble();
        thirdPoint.setY(yCoord3);
        double zCoord3 = scan.nextDouble();
        thirdPoint.setZ(zCoord3);

        // Вывод метода рассчета расстояния между двумя точками
        System.out.print("Расстояние между точками: ");
        System.out.printf("%.2f", firstPoint.distanceTo1(secondPoint));
        System.out.println("");

        // Вывод метода проверки равенства координат двух точек
        System.out.print("Равенство двух точек с координатами " + "(" + xCoord1 + " " + yCoord1 + " " + zCoord1
                + ")" + " и " + "(" + xCoord3 + " " + yCoord3 + " " + zCoord3 + ")" + ": ");
        System.out.println(firstPoint.equalCoords1(thirdPoint));

        // Проверка на равенство координат трех точек и вывод площади треугольника в случае, если точки не равны
        if ((firstPoint.equalCoords1(secondPoint)) | (firstPoint.equalCoords1(thirdPoint)) | (secondPoint.equalCoords1(thirdPoint))){
            System.out.print("Невозможно посчитать площадь по заданным точкам");
        }
        else{

            System.out.print("Площадь треугольника: " + computeArea1(firstPoint, secondPoint, thirdPoint));
        }

    }

    // Метод рассчета площади треугольника, образованного тремя точками
    /*public static double computeArea (Point3D firsPoint, Point3D secondPoint, Point3D thirdPoint){
        double a = Math.sqrt(Math.pow(firsPoint.getX()-secondPoint.getX(),2)
                + Math.pow(firsPoint.getY()-secondPoint.getY(),2) + Math.pow(firsPoint.getZ()- secondPoint.getZ(),2));
        double b = Math.sqrt(Math.pow(secondPoint.getX()- thirdPoint.getX(),2)
                + Math.pow(secondPoint.getY()- thirdPoint.getY(),2) + Math.pow(secondPoint.getZ()- thirdPoint.getZ(),2));
        double c = Math.sqrt(Math.pow(thirdPoint.getX()- firsPoint.getX(),2)
                + Math.pow(thirdPoint.getY()- firsPoint.getY(),2) + Math.pow(thirdPoint.getZ()- firsPoint.getZ(),2));

        double p = (a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }*/

    public static double computeArea1(Point3D firstPoint, Point3D secondPoint, Point3D thirdPoint){
        double a = firstPoint.distanceTo1(secondPoint);
        double b = firstPoint.distanceTo1(thirdPoint);
        double c = secondPoint.distanceTo1(thirdPoint);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
