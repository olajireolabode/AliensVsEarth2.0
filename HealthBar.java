import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class HealthBar extends Actor
{
    int health = 100;
    int healthBarWidth = 100;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;

    public HealthBar()
    {
        update();  
    }

    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        update();
    }

    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.GREEN);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
    }

    public void loseHealth()
    {
        health--;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health1)
    {
        health = health1;
    }
}
