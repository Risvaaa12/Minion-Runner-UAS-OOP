import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        //Greenfoot.playSound("musik minion.mp3");
        prepare();
    }

    public void act()
    {
        addEnemy(); //menambah enemy baru
        addBanana();
        addTree();
    }
    
    private void addEnemy()
    {
        if(Greenfoot.getRandomNumber(500)<1){
            Greenfoot.playSound("klakson.mp3");
            addObject(new CarEnemy(), Greenfoot.getRandomNumber(300)+200,0);        
        }
        if(Greenfoot.getRandomNumber(400)<2){
            Greenfoot.playSound("teriak.mp3");
            addObject(new MinionEnemy(), Greenfoot.getRandomNumber(300)+200,0);        
        }
    }
    private void addBanana()
    {
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new Banana(), Greenfoot.getRandomNumber(300)+200,0);        
        }
    }
    private void addTree()
    {
        if(Greenfoot.getRandomNumber(50)<2){
            addObject(new Tree(), Greenfoot.getRandomNumber(130),0);  
            addObject(new Tree(), Greenfoot.getRandomNumber(500)+550,0); 
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new Stone(), Greenfoot.getRandomNumber(130),0);  
            addObject(new Stone(), Greenfoot.getRandomNumber(500)+550,0); 
        }
    }
    
    private void prepare()
    {
        Minion minion = new Minion();
        addObject(minion,350,550);
        Greenfoot.playSound("yipee.wav");
        Tree tree = new Tree();
        addObject(tree,95,57);
        Tree tree2 = new Tree();
        addObject(tree2,63,266);
        Stone stone = new Stone();
        addObject(stone,99,178);
        Tree tree3 = new Tree();
        addObject(tree3,88,468);
        Stone stone2 = new Stone();
        addObject(stone2,51,392);
        tree3.setLocation(88,485);
        stone2.setLocation(59,406);
        Tree tree4 = new Tree();
        addObject(tree4,642,75);
        Stone stone3 = new Stone();
        addObject(stone3,612,182);
        Tree tree5 = new Tree();
        addObject(tree5,636,295);
        Tree tree6 = new Tree();
        addObject(tree6,614,456);
    }
}
