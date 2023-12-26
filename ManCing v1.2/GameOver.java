import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends TitleScreen
{
    private EndGameText gameOverText = new EndGameText();   
    private int delayCounter = 0;
    private final int delayDuration = 45;
    public GameOver()
    {   
        addObject(gameOverText, 450, 300);
        prepare();
    }
 
    public void act() {
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
        else if (Greenfoot.mouseClicked(gameOverText) || Greenfoot.isKeyDown("Space")) {
            Greenfoot.setWorld(new HowTo());
        }
    }

    private void prepare()
    {
        // Add other objects or prepare the world as needed
    }
}
