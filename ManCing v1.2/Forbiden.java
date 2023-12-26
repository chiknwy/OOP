import greenfoot.*;

public abstract class Forbiden extends Actor {
    public int speed = 2;

    public Forbiden() {
        speed = 2;
    }

    public Forbiden(int forbidenSpeed) {
        speed = forbidenSpeed;
    }

    public void act() {
        // Move the forbiden object downward
        setLocation(getX(), getY() + speed);
        
        // Check if the forbiden object is at the bottom edge of the world and remove it
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}
