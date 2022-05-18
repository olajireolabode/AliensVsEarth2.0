/**
 * Write a description of class Vector2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector2D  
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;

    public Vector2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }

    public void negate()
    {
        x = -x;
        y = -y;
    }

    public double magnitude()
    {
        return Math.sqrt(dot(this, this));
    }

    public void normalize()
    {
        double m = magnitude();
        x /= m;
        y /= m;
    }
       
    public static Vector2D add(Vector2D v1, Vector2D v2)
    {
        return new Vector2D(v1.x + v2.x, v1.y + v2.y);
    }
    
    public static Vector2D multiply(Vector2D v, double value)
    {
        return new Vector2D(v.x*value, v.y*value);
    }
    
    public static double dot(Vector2D v1, Vector2D v2)
    {
        return v1.x * v1.x + v2.y * v2.y;
    }
}
