import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends Actor
{
    /**
     * Act - do whatever the HowToPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public HowToPlay(){
        // Set the transparent background and white text
        GreenfootImage image = new GreenfootImage("HOW TO PLAY!\n You Have 3 Hearts!! \nDon't eat the trash (-1 health) \n\nFirst One to reach 10000 Scores win!!\n Eat Shrimp (+1000 Scores) \n Eat Worm (+100 Scores)\n Eat GoldenWorm (+10k Scores/WIN!!)  \n\n Avoid Bomb and Shark that kills you in an instant!!", 28, Color.WHITE, new Color(0, 0, 0, 128));
        
        // Assign the image to the actor
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
