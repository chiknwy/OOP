import greenfoot.*;

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 900x600 cells and a cell size of 1x1 pixels.
        super(900, 600, 1); 
        Greenfoot.start();
        
    }
            HowToPlay deathSharkText = new HowToPlay();

    public void act()
    {      
        if (Greenfoot.isKeyDown("space")|| Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HowTo());
        }
        addObject(deathSharkText, 450, 300);
    }
}