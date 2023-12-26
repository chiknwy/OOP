import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToText extends InScreenText
{
    public HowToText() {
        super("Press 1 to play singleplayer", "Press 2 to play multiplayer");
    }
    // You can add specific behavior or modifications for EndGameText if needed
    // For example, additional methods or overrides
    
    
    
    public void act(){
        updateImage("Press 1 to play singleplayer", "Press 2 to play multiplayer");
    }
}
