import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartScreen extends World
{
    private GreenfootSound gameMusic; 

    /**
     * Constructor for objects of class StartScreen.
     */
    public StartScreen()
    {
        super(1000, 564, 1);
        gameMusic = new GreenfootSound("GoHard.wav");
        //this.stopped();
        prepare();
        
        showText("Welcome to ALIENS VS EARTH", getWidth()/2, 60);
        showText("Press the Space Bar or Click the START button", getWidth()/2, 110);
        showText("Click Help for Tutorial", 880, 480);
        
        

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton,getWidth()/2,450);
        

        HelpButton helpButton = new HelpButton();
        addObject(helpButton,942,518);
      
    }
    
    public void started(){
        gameMusic.playLoop();
    }
    public void stopped(){
        gameMusic.stop();
    }
}
