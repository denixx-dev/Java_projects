import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator{
    /**
     * Sets the specified rectangle to contain the initial range suitable for
     * the fractal being generated.
     */
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

    public int numIterations(double x, double y){
        int i =0;
        double zReal=0;
        double zComplex =0;
        double zRealUpd;
        double zComplexUpd;
        while ((i < MAX_ITERATIONS) && (zReal*zReal+zComplex*zComplex<4)){
            zRealUpd = zReal*zReal-zComplex-zComplex+x;
            zComplexUpd = 2*zReal*zComplex+y;
            zReal = zRealUpd;
            zComplex = zComplexUpd;
            i++;
        }
        if (i == MAX_ITERATIONS)
            return -1;
        else
            return i;

    }
}
