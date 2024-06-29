import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathByBomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathByBomb extends InScreenText
{
    /**
     * Act - do whatever the DeathByBomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private String loserName;
    public DeathByBomb(String loserName) {
        super("BOOM!! " +loserName +" death by the bomb!!", "Nice Try");
        this.loserName= loserName;
    }
            // You can add specific behavior or modifications for EndGameText if needed
            // For example, additional methods or overrides
    
    public void act(){
        updateImage("BOOM!! " +loserName +" death by the bomb!!", "Nice Try");
    }
}
