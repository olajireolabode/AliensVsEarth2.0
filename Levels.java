import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends World
{
    protected long lastFrameTimeMS;
    protected double timeStepDuration;
    HealthBar healthBar = new HealthBar();
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class Levels.
     * 
     */
    public Levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 667, 1);
        showText("Hero's Health", 80, 22);
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60;
    }
    
     public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }
    
    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
        
        showText("The health value is:" +healthBar.getHealth() , 250, 50);
        if(Greenfoot.isKeyDown("space"))
        {
            healthBar.setHealth(healthBar.getHealth()-1);
        }

        
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    
    /*
    public HealthBar getHealthBar()
    {
        return healthBar;
    }*/
}
