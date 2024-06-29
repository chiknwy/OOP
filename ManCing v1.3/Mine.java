import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Forbiden
{
    /**
     * Act - do whatever the Mine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean statics = false;

    public Mine(int forbiddenSpeed) {
    super.speed = Greenfoot.getRandomNumber(3) + 3; 
    }
    
    public Mine (boolean statics){
        this.statics = statics;
        setImage("SmallBomb.png");
    }
    
    public void act() {
        
        if (statics){
            
        }
        else{
            if (getWorld() != null) {
            if (isTouching(Worm.class)) {
                touchWorm();
            } else if (isTouching(Fish.class)) {
                if (isTouching(Shark.class)) {
                    touchShark();
                } else {
                    touchFish();
                    Greenfoot.setWorld(new GameOver());
                }
            }
            if(getWorld()!= null){
                // Move the Mine downward
            setLocation(getX(), getY() + speed);
        
            // Check if the Mine is at the bottom edge of the world and remove it
            if (getY() >= getWorld().getHeight() - 1) {
                getWorld().removeObject(this);
            }
            }
            
        }
        }
        
    }

    public void touchWorm(){
        getWorld().addObject(new Boom(),getX(),getY());
        removeTouching(Worm.class);
        getWorld().removeObject(this);
    }
    public void touchFish(){
        
        getWorld().addObject(new Boom(),getX(),getY());
        if (isTouching(Shark.class)) {
            getWorld().removeObject(this);
        } else {
            World world = getWorld();
                Actor touchingActor = getOneIntersectingObject(Actor.class);
            
                if (isTouching(Fish2.class)) {
                    DeathByBomb deathBombText = new DeathByBomb("Player 2");   
                    world.addObject(deathBombText, 450, 300);
                } else{
                    DeathByBomb deathBombText = new DeathByBomb("Player 1");   
                    world.addObject(deathBombText, 450, 300);
                }
            Greenfoot.delay(120); // 60 frames is equivalent to 1 second
            Greenfoot.setWorld(new GameOver());
        }
        removeTouching(Fish.class);
            if (Boom.class != null) {
            getWorld().removeObject(this);
        }
    }
     public void touchShark(){
        getWorld().addObject(new Boom(),getX(),getY());
        removeTouching(Shark.class);
        getWorld().removeObject(this);
    }
}
