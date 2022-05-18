import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpButton extends Actor
{
    
    
    /**
     * Act - do whatever the HelpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this))
        {
            setImage("HelpButtonPressedTiny.png");
            Greenfoot.setWorld(new Tutorial()); 
        }
        else 
        {
            setImage("HelpButtonTiny.png");
        }
    }
}
