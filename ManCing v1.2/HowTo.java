import greenfoot.*;

/**
 * Write a description of class HowTo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowTo extends TitleScreen
{
    private int delayCounter = 0;
    private final int delayDuration = 60; // 60 acts = 1 second (assuming 60 acts per second)
    private HowToText howToText = new HowToText();   

    /**
     * Constructor for objects of class HowTo.
     * 
     */
    
    public HowTo()
    {
        addObject(howToText, 450, 300);
        prepare();
    }

    public void act()
    { 

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
    }
    private void prepare()
    {
        // Add other objects or prepare the world as needed
    }
}