import java.awt.geom.Rectangle2D;


/**
 * This class provides the common interface and operations for fractal
 * generators that can be viewed in the Fractal Explorer.
 */
public class FractalGenerator {

    /**
     * This static helper function takes an integer coordinate and converts it
     * into a double-precision value corresponding to a specific range.  It is
     * used to convert pixel coordinates into double-precision values for
     * computing fractals, etc.
     *
     * @param rangeMin the minimum value of the floating-point range
     * @param rangeMax the maximum value of the floating-point range
     *
     * @param size the size of the dimension that the pixel coordinate is from.
     *        For example, this might be the image width, or the image height.
     *
     * @param coord the coordinate to compute the double-precision value for.
     *        The coordinate should fall in the range [0, size].
     */
    public static double getCoord(double rangeMin, double rangeMax,
                                  int size, int coord) {

        assert size > 0;
        assert coord >= 0 && coord < size;

        double range = rangeMax - rangeMin;
        return rangeMin + (range * (double) coord / (double) size);
    }

    /**
     * Updates the current range to be centered at the specified coordinates,
     * and to be zoomed in or out by the specified scaling factor.
     */
    public void recenterAndZoomRange(Rectangle2D.Double range,
                                     double centerX, double centerY, double scale) {

        double newWidth = range.width * scale;
        double newHeight = range.height * scale;

        range.x = centerX - newWidth / 2;
        range.y = centerY - newHeight / 2;
        range.width = newWidth;
        range.height = newHeight;
    }
    public class Mandelbrot {
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
            while ((x*x+y*y < 4) && (i < MAX_ITERATIONS)){

            }
            return 0;
        }


    }
}
