import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Omnicron here.
 * 
 * @author (olajire) 
 * @version (a version number or a date)
 */
public class Omnicron extends BadGuys
{
    private int health = 75;
    private int venom = 20;

    /**
     * Act - do whatever the Omnicron wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
    }
    
    public void moveAround()
    {
        move(4);
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
