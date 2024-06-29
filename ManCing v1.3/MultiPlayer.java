import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MultiPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiPlayer extends MyWorld
{

    /**
     * Constructor for objects of class MultiPlayer.
     * 
     */
    public MultiPlayer()
    {
        Fish fish = new Fish1(scoreboard);
        addObject(fish, 450, 300); // Spawn fish from the left edge
        addObject(scoreboard, 150, 50);
        
        Fish2 fish2 = new Fish2(scoreboard2);
        addObject(fish2, 650, 300); // Spawn fish from the left edge
        addObject(scoreboard2, 750, 50);
    }
}
