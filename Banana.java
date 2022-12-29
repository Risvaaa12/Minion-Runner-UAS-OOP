import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Parent
{
    int speed = 5;
    public void act() 
    {
        Banana  a = new Banana();
        Actor i = getOneIntersectingObject(Banana.class);
        move(speed);
        //checkdouble(i);
        edge(); 
    }  
}
