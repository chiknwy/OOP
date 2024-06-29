import greenfoot.*;

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    HowToPlay deathSharkText = new HowToPlay();
    Shrimp shrimp = new Shrimp(true);
    Worm worm = new Worm (true);
    GoldenWorm gworm = new GoldenWorm(true);
    Shark shark = new Shark(true);
    Trash trash =  new Trash(true);
    Mine mine = new Mine(true);
    
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
    
    
     public void act()
    {      
        if (Greenfoot.isKeyDown("space")|| Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HowTo());
        }
        addObject(deathSharkText, 450, 300);
        addObject(shrimp, 603, 315);
        addObject(worm, 600, 345);
        addObject(gworm, 662, 370);
        addObject(trash, 613,230);
        addObject(shark, 400,400);
        addObject(mine, 295, 400);
    }
}