import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class GoldenWorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenWorm extends Food
{
    /**
     * Act - do whatever the GoldenWorm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public GoldenWorm(int foodSpeed){
        super.speed = 10;
     }
    
    public GoldenWorm(boolean statics){
        this.statics = statics;
        turn (180);

    }
     
    public void act() {
        if(statics){
        }
        else{
        super.act();

        }
    }
}
