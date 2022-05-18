import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    double timeWelcomeScreenCreation = System.currentTimeMillis();
    private GreenfootSound gameMusic; 

    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 563, 1); 
        gameMusic = new GreenfootSound("GoHard.wav");
        //this.stopped();
        
    }

    public void act()
    {
        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (3* 1000)))
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

