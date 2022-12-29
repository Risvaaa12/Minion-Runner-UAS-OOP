import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Parent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parent extends Actor
{
    public void act() 
    {
        
    }
    public void edge(){
        if(getY() >= 599||getY() <=0){
            getWorld().removeObject(this);
        }
    }
    public void move(int speed){
        setLocation(getX(),getY() + speed);
    }
}
