import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Fish {
    int speed = 1/2;
    int timer = 0;

    public void act() {
            if (getWorld() != null) {
            move(speed);
            moveAround();
            
            if (timer >= (Greenfoot.getRandomNumber(6) + 5) * 60) {
                if (getWorld() != null) {
                    speed = 2;
                    if (isAtEdge()) {
                        getWorld().removeObject(this);
                    }
                    moveTowardsEdgeAndRemove();
                }
            }
            if (getWorld() != null) {
            if (isTouching(Shark.class)) {
                    getWorld().removeObject(this);
                }
            }
            timer++;
        }
    }

    public Shark(int sharkSpeed) {
        speed = sharkSpeed;
    }

    public void moveTowardsEdgeAndRemove() {
        if (getWorld() != null) {
            int worldWidth = getWorld().getWidth();
            int worldHeight = getWorld().getHeight();

            int targetX = getX() <= worldWidth / 2 ? -10 : worldWidth + 10;
            int targetY = getY();

            turnTowards(targetX, targetY);
            move(speed);

            if (isTouching(Shark.class)) {
                getWorld().removeObject(this);
            }
        }
    }

    public void moveAround() {
        // Check if there's a Fish nearby
        List<Fish> fishes = getObjectsInRange(150, Fish.class);
        if (!fishes.isEmpty()) {
            move(1/2);
            moveTowardsFish(fishes);
        } else {
            move(1/2); 

            

            int worldWidth = getWorld().getWidth();
            int worldHeight = getWorld().getHeight();

            if (isAtEdge()) {
                turn(45);
            }
        }
    }
    
 

        private void moveTowardsFish(List<Fish> fishes) {
        if (!fishes.isEmpty()) {
            Fish targetFish = fishes.get(0);
            turnTowards(targetFish.getX(), targetFish.getY());
            move(1/2);
            if (isTouching(Fish.class)){
            touchFish();
            }
        }
    }   
    
    private void touchFish() {
        if (isTouching(Shark.class)) {
            getWorld().removeObject(this);
        } else {
                World world = getWorld();
                Actor touchingActor = getOneIntersectingObject(Actor.class);
            
                if (isTouching(Fish2.class)) {
                    DeathByShark deathSharkText = new DeathByShark("Player 2");
                    world.addObject(deathSharkText, 450, 300);
                } else{
                    DeathByShark deathSharkText = new DeathByShark("Player 1");
                    world.addObject(deathSharkText, 450, 300);
                }
           
            Greenfoot.delay(120); // 60 frames is equivalent to 1 second
            Greenfoot.setWorld(new GameOver());
        }
    }

}

