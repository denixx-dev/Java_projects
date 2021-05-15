import java.awt.geom.Rectangle2D;

public class Burning_ship extends FractalGenerator {

    public static final int MAX_ITERATIONS =2000;

    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2.5;
        range.width = 4;
        range.height = 4;
    }
    public int numIterations(double x, double y) {
        int count =0;
        double r=x;
        double i=y;
        while(count <MAX_ITERATIONS && r*r-i*i <4) {
            double k = r*r-i*i+x;
            double m = 2 * Math.abs(r) + Math.abs(i) +y;
            r=k;
            i=m;
            count++;
        }
        if (count == MAX_ITERATIONS)
            return -1;

        return count;
    }
    public String toString() {
        return "Burning ship";
    }
}
