import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends Levels
{
    HealthBar healthBar = new HealthBar();
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class SecondLevel.
     * 
     */
    public SecondLevel()
    { 
        gameMusic = new GreenfootSound("Gopro.wav");
        prepare();
        //stopped();
        //this.started();
    }
    
     public void act()
    {
        if (getObjects(BadGuys.class).isEmpty()) 
            Greenfoot.setWorld(new FinalLevel());
            
        if (getObjects(Hero.class).isEmpty()) 
            Greenfoot.setWorld(new GameOverWorld()); 
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,16,466);
        Omnicron omnicron = new Omnicron();
        addObject(omnicron,372,108);
        Omnicron omnicron2 = new Omnicron();
        addObject(omnicron2,378,196);
        Omnicron omnicron3 = new Omnicron();
        addObject(omnicron3,371,308);
        Omnicron omnicron4 = new Omnicron();
        addObject(omnicron4,380,423);
        Omnicron omnicron5 = new Omnicron();
        addObject(omnicron5,367,576);
        Omnicron omnicron6 = new Omnicron();
        addObject(omnicron6,493,460);
        Omnicron omnicron7 = new Omnicron();
        addObject(omnicron7,507,339);
        Omnicron omnicron8 = new Omnicron();
        addObject(omnicron8,492,229);
        Omnicron omnicron9 = new Omnicron();
        addObject(omnicron9,496,138);
        Omnicron omnicron10 = new Omnicron();
        addObject(omnicron10,659,303);
        Delta delta = new Delta();
        addObject(delta,684,172);
        Delta delta2 = new Delta();
        addObject(delta2,678,445);
        Delta delta3 = new Delta();
        addObject(delta3,798,222);
        Delta delta4 = new Delta();
        addObject(delta4,811,366);
        Delta delta5 = new Delta();
        addObject(delta5,697,583);
        Delta delta6 = new Delta();
        addObject(delta6,835,496);
        hero.setLocation(18,455);
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

