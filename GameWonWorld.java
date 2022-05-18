import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{
    private GreenfootSound gameMusic;
    double timeWelcomeScreenCreation = System.currentTimeMillis();

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(1000, 562, 1);
        gameMusic = new GreenfootSound("Victory.wav");
        //stopped();
        //this.started();
    }
    
    public void act()
    {
        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (1* 1000)))
        {
            Greenfoot.setWorld(new StartScreen()); 
        }
    }
    
    public void started(){
        gameMusic.playLoop();
    }
    public void stopped(){
        gameMusic.stop();
    }
    
}
