import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends Parent
{
    int speed = 5;
    public void act() 
    {
        Tree a = new Tree();
        Actor i = getOneIntersectingObject(Tree.class);
        move(speed);
        edge();
    } 
}
