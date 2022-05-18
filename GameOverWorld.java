import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{
    private GreenfootSound gameMusic;
    double timeWelcomeScreenCreation = System.currentTimeMillis();

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(1000, 520, 1);
        gameMusic = new GreenfootSound("Lost.wav");
        //stopped();
        //this.started();
    }

    public void act()
    {
        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (2* 1000)))
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
