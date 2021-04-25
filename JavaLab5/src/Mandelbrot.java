import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator{
    /**
     * Sets the specified rectangle to contain the initial range suitable for
     * the fractal being generated.
     */
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x =-2;
        range.y = -1.5;
        range.width = 3;
        range.height= 3;
    }

    /**
     * Given a coordinate <em>x</em> + <em>iy</em> in the complex plane,
     * computes and returns the number of iterations before the fractal
     * function escapes the bounding area for that point.  A point that
     * doesn't escape before the iteration limit is reached is indicated
     * with a result of -1.
     */
    public static final int MAX_ITERATIONS = 2000;

    @Override
    public int numIterations(double x, double y){
        int count =0;
        double r=x;
        double i =y;
        while (count < MAX_ITERATIONS && r*r+i*i<4){
            double k= r*r - i*i+x;
            double m = 2*r*i+y;
            r=k;
            i=m;
            count++;
        }
        if (count == MAX_ITERATIONS)
            return -1;
        else
            return count;

    }

    public String toString() {
        return "Mandelbrot";
    }
}
