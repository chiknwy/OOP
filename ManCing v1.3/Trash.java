import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Forbiden
{
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean statics = false;
    public Trash(int forbiddenSpeed) {
    super.speed = Greenfoot.getRandomNumber(3) + 3; 
    }
    
    public Trash (boolean statics){
        this.statics = statics;
        setImage("SmallTrash.png");
    }
    public void act()
    {
        // Add your action code here.
        
        if(statics){
            
        }
        else{
            if(getWorld()!= null){
            // Move the Mine downward
            setLocation(getX(), getY() + speed);
            // Check if the Mine is at the bottom edge of the world and remove it
            if (getY() >= getWorld().getHeight() - 1) {
                getWorld().removeObject(this);
            }
            //if(getWorld()!= null){
                //if (isTouching(Fish.class)) {
                   // if (isTouching(Shark.class)) {
                     //   getWorld().removeObject(this);
                    //} else {
                        //getWorld().removeObject(this);
                    //}
               // }}
            
        }
        }
        
    }
}
