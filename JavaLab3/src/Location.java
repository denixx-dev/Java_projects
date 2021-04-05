import java.util.Objects;

public class Location {
    /** X coordinate of this location. **/
    public int xCoord;


    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    /**
     * Переопределение метода equals
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Location location = (Location) obj;
        return xCoord == location.xCoord && yCoord == location.yCoord;
    }

    /**
     *Переопределение метода hashCode
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(xCoord) + Integer.hashCode(yCoord);
    }
}
