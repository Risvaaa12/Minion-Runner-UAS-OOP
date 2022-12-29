import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BombEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarEnemy extends Parent
{
    int speed = 5;
    
    public void act() 
    {
        CarEnemy a = new CarEnemy();    
        Actor i = getOneIntersectingObject(CarEnemy.class);
        move(speed);
        //checkdouble(i);
        edge();
    } 
        
    
        
    
}
