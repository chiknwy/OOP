import greenfoot.*;
import java.util.*;

public abstract class  Food extends Actor {
    public int speed = 2;
    public int foodScore = 10;
    public Scoreboard scoreboard;  // Declare the scoreboard variable
    
    public boolean statics = false;
    public Food() {
        turn(180);
    }

    public Food(int foodSpeed) {
        turn(180);
        speed = foodSpeed;
    }

    private int timer = 0;

    public void act() {
        move(speed);
        moveAround();
        moveTowardsEdgeAndRemove();
        timer++;
    }


    public void moveTowardsEdgeAndRemove() {
        if (getWorld() != null) {
            if (isTouching(Fish.class)) {
                if (isTouching(Shark.class)) {
                    getWorld().removeObject(this);
                } 
            }
    
            if (timer >= (Greenfoot.getRandomNumber(6) + 5) * 60) {
                if (getWorld() != null) {
                    speed = 3;
                    if (isAtEdge()) {
                        getWorld().removeObject(this);
                    }
                    //moveTowardsEdgeAndRemove();
                }
            }
        }
    }

    public void moveAround() {
        move(2);

        // Check if there's a Fish nearby
        List<Fish> fishes = getObjectsInRange(250, Fish.class);
        if (!fishes.isEmpty()) {
            turn(Greenfoot.getRandomNumber(90) - 45); // Turn away from Fish
            if (getWorld() != null) {
                if (isAtEdge()) {
                    getWorld().removeObject(this);
                }
            }
        } else {
            if (Greenfoot.getRandomNumber(100) < 10) {
                turn(Greenfoot.getRandomNumber(90) - 45);
            }

            int worldWidth = getWorld().getWidth();
            int worldHeight = getWorld().getHeight();

            if (isAtEdge()) {
                turn(45);
            }
        }
    }
}
