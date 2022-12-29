import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinionEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinionEnemy extends CarEnemy
{
    int racunTimer = 0;
    int speed = 5;
    public void act(){     
        if (racunTimer == 60){
            getWorld().addObject(
            new Racun(),
            getX(),
            getY()+30
            );
            move(speed);
            racunTimer = 0;
        }else{
            racunTimer++;
        }
        edge();
    }
}
