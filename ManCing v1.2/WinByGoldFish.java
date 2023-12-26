import greenfoot.*;

public class WinByGoldFish extends InScreenText
{
    private String winnerName;

    /**
     * Constructor for objects of class WinByGoldFish.
     * 
     * @param winnerName The name of the player who won (Fish or Fish2).
     */
  
    public WinByGoldFish(String winnerName) {
        super(winnerName + " has won for eating the goldworm", "Congrats!!!!");
        this.winnerName = winnerName;
    }
    

    /**
     * Act - do whatever the WinByGoldFish wants to do.
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        updateImage(winnerName + " has won for eating the goldworm", "Congrats!!!!");
    }
}
