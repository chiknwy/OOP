import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SinglePlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SinglePlayer extends MyWorld
{

    /**
     * Constructor for objects of class SinglePlayer.
     * 
     */
    public SinglePlayer()
    {
        prepare(); 
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish = new Fish1(scoreboard);
        addObject(fish, 450, 300); // Spawn fish from the left edge
        addObject(scoreboard, 150, 50);
    }
}
