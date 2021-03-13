import java.text.DecimalFormat;

public class Lab2 {
    public static void main (String[] args) {
        Point3D firstPoint = new Point3D(4,8,12);
        Point3D secondPoint = new Point3D(2, 2 ,2);
        Point3D thirdPoint = new Point3D();
        //Point3D testPoint = new Point3D();

        double xCoord1 = firstPoint.getX();
        double yCoord1 = firstPoint.getY();
        double zCoord1 = firstPoint.getZ();

        double xCoord2 = secondPoint.getX();
        double yCoord2 = secondPoint.getY();
        double zCoord2 = secondPoint.getZ();

        double xCoord3 = thirdPoint.getX();
        double yCoord3 = thirdPoint.getY();
        double zCoord3 = thirdPoint.getZ();

        // Вывод метода рассчета расстояния между двумя точками
        System.out.print("Расстояние между точками: ");
        System.out.println(firstPoint.distanceTo(firstPoint, secondPoint));

        // Вывод метода проверки равенства координат двух точек
        System.out.print("Равенство двух точек с координатами " + "(" + xCoord1 + " " + yCoord1 + " " + zCoord1
                + ")" + " и " + "(" + xCoord3 + " " + yCoord3 + " " + zCoord3 + ")" + ": ");
        //System.out.print(testPoint.equalCoords(xCoord1, xCoord2,
        //       yCoord1, yCoord2, zCoord1, zCoord2));
        System.out.println(firstPoint.equalCoords(firstPoint, thirdPoint));


        // Проверка на равенство координат трех точек и вывод площади треугольника в случае, если точки не равны
        if ((firstPoint.equalCoords(firstPoint,secondPoint)==true) | (firstPoint.equalCoords(secondPoint,thirdPoint)==true) | (firstPoint.equalCoords(firstPoint,thirdPoint)==true)){
            System.out.print("Невозможно посчитать площадь по заданным точкам");
        }
        else{

            System.out.print("Площадь треугольника: " + computeArea(firstPoint, secondPoint, thirdPoint));
        }

    }

    // Метод рассчета площади треугольника, образованного тремя точками
    public static double computeArea (Point3D firsPoint, Point3D secondPoint, Point3D thirdPoint){
        double a = Math.sqrt(Math.pow(firsPoint.getX()-secondPoint.getX(),2)
                + Math.pow(firsPoint.getY()-secondPoint.getY(),2) + Math.pow(firsPoint.getZ()- secondPoint.getZ(),2));
        double b = Math.sqrt(Math.pow(secondPoint.getX()- thirdPoint.getX(),2)
                + Math.pow(secondPoint.getY()- thirdPoint.getY(),2) + Math.pow(secondPoint.getZ()- thirdPoint.getZ(),2));
        double c = Math.sqrt(Math.pow(thirdPoint.getX()- firsPoint.getX(),2)
                + Math.pow(thirdPoint.getY()- firsPoint.getY(),2) + Math.pow(thirdPoint.getZ()- firsPoint.getZ(),2));

        double p = (a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}
