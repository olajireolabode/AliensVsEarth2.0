import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    private int life = 30;
    private int damage = 20;

    private static final double GRAVITY = 9.8 * 200; // 200 pixels is 1 meter

    public Fireball()
    {
        position = null;
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, GRAVITY);
        Greenfoot.playSound("Fire2.wav");
    }

    public void act() 
    {
        updatePhysics();
        
        if(life <= 0) {
            getWorld().removeObject(this);
        } 
        else {
            //move();
            BadGuys badguys = (BadGuys) getOneIntersectingObject(BadGuys.class);
            if (badguys != null) {
                getWorld().removeObject(this);
                badguys.hit(damage);
                Greenfoot.playSound("Hit sound.wav");
            }
            else {
                life--;
            }
        }
    }    

    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;
    }

    public void updatePhysics()
    {
        // Initial position
        if (position == null)
        {
            position = new Point2D(getX(), getY());
        }

        // Get time step duration
        Levels world = (Levels) getWorld();
        double dt = world.getTimeStepDuration();

        // Update velocity
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);

        // Update position
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);

        // Set new actor position
        setLocation((int) position.getX(), (int) position.getY());        
    }
}

