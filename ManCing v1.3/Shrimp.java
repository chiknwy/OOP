import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shrimp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shrimp extends Food
{
    /**
     * Act - do whatever the Shrimp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean statics = false;

    public Shrimp(int foodSpeed){
        super.speed = 1;
        statics = false;
     }
    
    public Shrimp(boolean statics){
        this.statics = statics;
        turn (180);
        setImage("SmallShrimp.png");
    }
   
    public void act() {
        
        if(statics){
            
        }
        else{
        super.act();

        }
    }

}
