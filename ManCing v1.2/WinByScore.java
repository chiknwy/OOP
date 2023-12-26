import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinByScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinByScore extends InScreenText
{   
    private String winnerName;

    public WinByScore(String winnerName) {
        super(winnerName + " has won for reaching 10,000 scores!", "Congrats!!!!");
        this.winnerName = winnerName;
    }
    
    /**
     * Act - do whatever the WinByScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        updateImage(winnerName + " has won for reaching 10,000 scores!", "Congrats!!!!");
        
    }
    
}
