import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Food
{   
    private int timer = 0;
    
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Worm(int foodSpeed){
        super.speed = 1;
     }
    
    public Worm(boolean statics){
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
