import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathByHeart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathByHeart extends InScreenText
{
    /**
     * Act - do whatever the DeathByHeart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    private String loserName;

    public DeathByHeart(String loserName) {
        super(loserName  + " eat too many trash!!, "+ loserName + " died!!" , "Nice Try");
        this.loserName= loserName;
        }
        // You can add specific behavior or modifications for EndGameText if needed
        // For example, additional methods or overrides
        
    public void act(){
        updateImage(loserName  + " eat too many trash!!, you died!", "Nice Try");
    }
}
