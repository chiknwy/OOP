import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWin extends TitleScreen
{

    /**
     * Constructor for objects of class GameWin.
     * 
     */
    public GameWin()
    {
    }
     private int delayCounter = 0;
    private final int delayDuration = 45;
    public void act(){
        if (delayCounter < delayDuration)
        {
            delayCounter++;
        }
        
        else if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new SinglePlayer());
        }
        else if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new MultiPlayer());
        }
        else if (Greenfoot.isKeyDown("Space")) {
            Greenfoot.setWorld(new HowTo());
        }
    }
}
