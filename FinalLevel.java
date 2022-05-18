import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalLevel extends Levels
{
    HealthBar healthBar = new HealthBar();
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class FinalLevel.
     * 
     */
    public FinalLevel()
    {
        gameMusic = new GreenfootSound("Abyss.wav");
        prepare();
        //stopped();
        //this.started();
    }
    
     public void act()
    {
        
        if (getObjects(BadGuys.class).isEmpty()) 
            Greenfoot.setWorld(new GameWonWorld());
            
        if (getObjects(Hero.class).isEmpty()) 
            Greenfoot.setWorld(new GameOverWorld()); 
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Putin putin = new Putin();
        addObject(putin,545,523);
        Delta delta = new Delta();
        addObject(delta,424,484);
        putin.setLocation(548,415);
        putin.setLocation(534,502);
        Delta delta2 = new Delta();
        addObject(delta2,465,402);
        Delta delta3 = new Delta();
        addObject(delta3,561,340);
        Delta delta4 = new Delta();
        addObject(delta4,681,416);
        Delta delta5 = new Delta();
        addObject(delta5,612,523);
        Delta delta6 = new Delta();
        addObject(delta6,543,574);
        Delta delta7 = new Delta();
        addObject(delta7,680,297);
        Delta delta8 = new Delta();
        addObject(delta8,415,312);
        Omnicron omnicron = new Omnicron();
        addObject(omnicron,664,218);
        Omnicron omnicron2 = new Omnicron();
        addObject(omnicron2,552,177);
        Omnicron omnicron3 = new Omnicron();
        addObject(omnicron3,339,185);
        Omnicron omnicron4 = new Omnicron();
        addObject(omnicron4,282,300);
        Omnicron omnicron5 = new Omnicron();
        addObject(omnicron5,263,462);
        Omnicron omnicron6 = new Omnicron();
        addObject(omnicron6,804,320);
        Omnicron omnicron7 = new Omnicron();
        addObject(omnicron7,781,533);
        Omnicron omnicron8 = new Omnicron();
        addObject(omnicron8,396,611);
        Omnicron omnicron9 = new Omnicron();
        addObject(omnicron9,301,544);
        Omnicron omnicron10 = new Omnicron();
        addObject(omnicron10,469,142);
        Omnicron omnicron11 = new Omnicron();
        addObject(omnicron11,748,108);
        Hero hero = new Hero();
        addObject(hero,26,261);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,55,52);
        healthBar.setLocation(80,43);
        
    }
    
    public void started(){
        gameMusic.playLoop();
    }
    public void stopped(){
        gameMusic.stop();
    }
}
