import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGameText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGameText extends InScreenText {
    public EndGameText() {
        super("Game Over!! Thanks For playing", "Press Space To Play Again");
    }
    // You can add specific behavior or modifications for EndGameText if needed
    // For example, additional methods or overrides
    
    public void act(){
        updateImage("Game Over!! Thanks For playing", "Press Space to Play Again" );
    }
}
