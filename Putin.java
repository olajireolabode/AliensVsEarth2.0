import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Putin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Putin extends BadGuys
{
    private int health = 300;
    private int venom = 50;

    /**
     * Act - do whatever the Putin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
    }
    
    public void moveAround()
    {
        move(2);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
    
     public void hit(int damage) 
    {
         health = health - damage;
        if (health <= 0) {
            getWorld().removeObject(this);       
         }
    }
}
