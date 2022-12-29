import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Racun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Racun extends Actor
{
    /**
     * Act - do whatever the Racun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    public void act()
    {
        // Add your action code here.
        move(speed);       
        racunCollision();
    }
    public Racun(){
        setRotation(+90);
    }
    public Racun(int speed){
        setRotation(+90);
        this.speed = speed;
    }
    
    public void racunCollision(){
        if (isTouching(Rocket.class)){
            getWorld().addObject(
            new Boom(),
            getX()+10,
            getY()
            );
            removeTouching(Rocket.class);
            getWorld().removeObject(this);
        }else if (isAtEdge())
            getWorld().removeObject(this);
        }
    
}
