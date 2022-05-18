import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    int health = 100;
    HealthBar currHealthBar;
    private final static double FIRE_BALL_VELOCITY = 1500.0;
    //boolean touchingBadGuys = false;
    //HealthBar healthBar = new HealthBar();

    public Hero()
    {
        
    }

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAndTurn();

        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
            Vector2D heroToMouse = new Vector2D(mouse.getX()-getX(),
                    mouse.getY()-getY());
            alignWithVector(heroToMouse);  

            if (Greenfoot.mouseClicked(null)){
                heroToMouse.normalize();
                heroToMouse = Vector2D.multiply(heroToMouse, FIRE_BALL_VELOCITY);

                Fireball fire = new Fireball();
                fire.setVelocity(heroToMouse);
                getWorld().addObject(fire, getX(), getY());
                //Greenfoot.playSound("cannonSound.wav");
            }
        }
        intersectBadGuys();
    }

    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("right")) {
            setImage("heroTinyy.png");
            setLocation(getX()+3, getY());
        }
        if (Greenfoot.isKeyDown("left")) {
            setImage("heroTinyyLeft.png");
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+3);
        }
    }

    public void alignWithVector(Vector2D v){
        double adjacent = v.getX();
        double opposite = v.getY();

        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);

        setRotation((int)angleDegrees);
    }

    public void hit(int venom) 
    {
        health = health - venom;
        if (health <= 0) {
            getWorld().removeObject(this);       
        }
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int heroHealth)
    {
        health = heroHealth;
    }

    public void intersectBadGuys()
    {
        currHealthBar = getWorld().getObjects(HealthBar.class).get(0);
        getWorld().showText(""+currHealthBar.health, 147, 43);

        Actor BadGuys  = getOneIntersectingObject(BadGuys.class);
        if(BadGuys != null)
        {
            currHealthBar.setHealth((int)((double)currHealthBar.health - 0.0001));
            //Greenfoot.playSound("Ouch Cut4.wav");
            if(currHealthBar.health <= 0)
            {
                getWorld().removeObject(this);
                return;
            }
        }
    }
}
