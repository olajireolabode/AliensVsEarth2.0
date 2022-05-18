import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
import java.util.*;

/**
 * Write a description of class FirstLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends Levels
{
    HealthBar healthBar = new HealthBar();
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public FirstLevel()
    {
        gameMusic = new GreenfootSound("Robbery.wav");
        prepare();
        //stopped();
        //this.started();
    }

    public void act()
    {
        if (getObjects(BadGuys.class).isEmpty()) 
            Greenfoot.setWorld(new SecondLevel());

        if (getObjects(Hero.class).isEmpty()) 
            Greenfoot.setWorld(new GameOverWorld());

        if(Greenfoot.isKeyDown("space"))
        {
            showText("The health value is:" +healthBar.getHealth() , 250, 50);    

            healthBar.setHealth(healthBar.getHealth()-1);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,19,379);
        hero.setLocation(30,378);
        Omnicron omnicron = new Omnicron();
        addObject(omnicron,288,373);
        Omnicron omnicron2 = new Omnicron();
        addObject(omnicron2,867,604);
        hero.setLocation(32,359);
        Omnicron omnicron3 = new Omnicron();
        addObject(omnicron3,366,453);
        Omnicron omnicron4 = new Omnicron();
        addObject(omnicron4,626,394);
        Omnicron omnicron5 = new Omnicron();
        addObject(omnicron5,416,160);
        Omnicron omnicron6 = new Omnicron();
        addObject(omnicron6,782,215);
        Omnicron omnicron7 = new Omnicron();
        addObject(omnicron7,897,273);
        Omnicron omnicron8 = new Omnicron();
        addObject(omnicron8,776,439);
        Omnicron omnicron9 = new Omnicron();
        addObject(omnicron9,732,525);
        Omnicron omnicron10 = new Omnicron();
        addObject(omnicron10,611,128);
        Omnicron omnicron11 = new Omnicron();
        addObject(omnicron11,777,107);
        Omnicron omnicron12 = new Omnicron();
        addObject(omnicron12,212,570);
        Omnicron omnicron13 = new Omnicron();
        addObject(omnicron13,549,244);
        Omnicron omnicron14 = new Omnicron();
        addObject(omnicron14,556,429);
        Omnicron omnicron15 = new Omnicron();
        addObject(omnicron15,696,564);
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
