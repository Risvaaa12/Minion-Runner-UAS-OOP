import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minion extends Actor
{
    int score = 0;
    int lives = 3;
    int bananaEaten = 0;
    SimpleTimer shotTimer = new SimpleTimer();
    public int timerAnimation=5;
    public int Animaturn=0;
    public void act()
    {
        minionMovement();
        //checkCollision();
        showStatus();
        eatBanana();
        //touchCar();
        //touchMinion();
        finishGame();
        getTouch();
        score++;
        Animate();
        endGame();
    }
    
    public void minionMovement()
    {
        if (Greenfoot.isKeyDown("A"))
        {
            if(getX()>=200){
                setLocation(getX()-5,getY());
            }
        }
        if (Greenfoot.isKeyDown("D"))
        {
            if(getX()<=500){
                setLocation(getX()+5,getY());
            }
        }
        if (Greenfoot.isKeyDown("space") && shotTimer.millisElapsed()>3000)
        {
            getWorld().addObject(new Rocket(), getX(),getY()-50);
            shotTimer.mark();
            Greenfoot.playSound("rocket_launch.mp3");
        }
    }
    public void Animate(){
        timerAnimation--;
        if(timerAnimation==0&&Animaturn==0){
            setImage("minion2.png");
            timerAnimation=5;
            Animaturn=1;
        }
        if(timerAnimation==0&&Animaturn==1){
            setImage("minion1.png");
            timerAnimation=5;
            Animaturn=2;
        }
        if(timerAnimation==0&&Animaturn==2){
            setImage("minion0.png");
            timerAnimation=5;
            Animaturn=0;
        }
    }
    public void eatBanana()
    {
        if (isTouching(Banana.class))
        {
            showStatus();
            bananaEaten++;
            removeTouching(Banana.class);
            Greenfoot.playSound("eat.wav");
        }
    }
    
    public void getTouch()
    {
        if(isTouching(CarEnemy.class)||isTouching(Racun.class))
        {
            getWorld().addObject(new Boom(),getX(),getY());
            //setLocation(112,180);
            showStatus();
            lives--;
            removeTouching(CarEnemy.class);
            Greenfoot.playSound("Explosion.wav");
        }   
    }
    
    public void removeLive()
    {
        showStatus();
        lives--;
        endGame();
    }
    public void increaseScore(){
        score++; 
        showStatus();
    }
    public void showStatus(){
        getWorld().addObject(new ScorePanel(), 75,565);
        getWorld().showText("Time   : "+score/60,71,530);
        getWorld().showText("Banana : "+bananaEaten,71,550);
        getWorld().showText("Lives  : "+lives,71,570);
    }
    public void endGame(){
        if(lives<1)
        {
            getWorld().showText("Game Over\nTime :  " + score/60, 250, 300);
            showStatus();
            Greenfoot.playSound("intro.mp3");
            Greenfoot.stop();
        }
    }   
    
    public void finishGame(){
        if(bananaEaten==20){
            getWorld().showText("Game Finish\nTime :  " + score/60, 250, 300);
            showStatus();
            Greenfoot.playSound("intro.mp3");
            Greenfoot.stop();
        }
    }
    
    public void addscore(){
        if(isTouching(Banana.class)){
            showStatus();
            bananaEaten++;
            removeTouching(Banana.class);
            Greenfoot.playSound("eat.wav");
        }
    }
    
    public void checkCollision() // increases damage of car when it hits a Vehicle.
    {
        Actor actor = getOneIntersectingObject(CarEnemy.class);
        if (actor != null)
        {
            setLocation(350,550);
            Greenfoot.playSound("Explosion.wav");
            removeLive();
        }
    
    }
    
}
