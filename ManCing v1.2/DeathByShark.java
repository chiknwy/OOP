import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathByShark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathByShark extends InScreenText
{
    private String loserName;

    public DeathByShark(String loserName) {
        super("Game Over!! " +  loserName + " Eaten by shark!! " , "Nice Try!");
        this.loserName= loserName;
    }
    // You can add specific behavior or modifications for EndGameText if needed
    // For example, additional methods or overrides
    
    public void act(){
        updateImage("Game Over!! " +  loserName + " Eaten by shark!! " , "Nice Try!");
    }
    
}
