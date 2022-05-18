import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Levels
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {
        gameMusic = new GreenfootSound("Fast.wav");
        //stopped();
        prepare();
        showText("Click mouse to SHOOT \n Move mouse to AIM \n Use Arrow Keys to MOVE ", 150, 300);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,175,332);
        Omnicron omnicron = new Omnicron();
        addObject(omnicron,412,219);
        Omnicron omnicron2 = new Omnicron();
        addObject(omnicron2,428,345);
        Omnicron omnicron3 = new Omnicron();
        addObject(omnicron3,407,462);
        Omnicron omnicron4 = new Omnicron();
        addObject(omnicron4,596,287);
        Omnicron omnicron5 = new Omnicron();
        addObject(omnicron5,593,407);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,55,52);
        healthBar.setLocation(80,43);
        omnicron4.setLocation(828,165);
        omnicron5.setLocation(844,383);
        omnicron.setLocation(567,136);
        omnicron2.setLocation(574,275);
        omnicron3.setLocation(620,487);
        hero.setLocation(366,279);
        
    }
    
     public void act()
    {
        if (getObjects(BadGuys.class).isEmpty()) 
            Greenfoot.setWorld(new FirstLevel());
            
        if (getObjects(Hero.class).isEmpty()) 
            Greenfoot.setWorld(new Tutorial()); 
    }
    
    public void started(){
        gameMusic.playLoop();
    }
    public void stopped(){
        gameMusic.stop();
    }
}
