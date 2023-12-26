import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Scoreboard scoreboard;
    int fishSpeed = 5;
    int lives = 3;

    public Fish() {
        this.fishSpeed = fishSpeed;
     }

    public Fish(Scoreboard scoreboard) { 
        
        this.scoreboard = scoreboard;
     }
    boolean pause = false;
    public void act()
    {
        // Add your action code here.
        fishMovement();
        eatFood1();
        //eatTrash();
        showStatus();
    }
    public void eatTrash(){
        if (isTouching(Trash.class)){
            removeLife();
            removeTouching(Trash.class);
        }
    }
    private GreenfootImage heart3 = new GreenfootImage("3.png"); //3 hearts
    private GreenfootImage heart2 = new GreenfootImage("2.png"); //menambahkan gambar gameover   
    private GreenfootImage heart1 = new GreenfootImage("1.png"); //menambahkan gambar gameover
    
     public void showStatus()
    {   
        eatTrash();
        switch (lives) {
            case 3:
                getWorld().getBackground().drawImage(heart3, 100,80);
                break;
            case 2:
                getWorld().getBackground().drawImage(heart2, 100,80);
                break;
            case 1:
                getWorld().getBackground().drawImage(heart1, 100,80);
                break;
            // Add more cases if needed
            default:
                // Handle other cases or add a default image
                break;
        }
    }
    
    public void removeLife()
    {
        lives--;
        if (lives == 0)
        {   
            testEndGame();
            lives = 0;
        }
    }

    public void testEndGame()
    {
        if (lives == 0)
        {              
            World world = getWorld();
            DeathByHeart deathBombHeart = new DeathByHeart("Player 1" );   
            world.addObject(deathBombHeart, 450, 300);
            Greenfoot.delay(120); // 60 frames is equivalent to 1 second
            Greenfoot.setWorld(new GameOver());
            
        }
    }
    
    public void eatFood1() 
     {
        World world = getWorld();
        if (isTouching(Worm.class)) {
            int foodScore = 100;
            if (scoreboard != null) {
                    scoreboard.addToScore(foodScore,"Player 1");
            } else {
                System.out.println("Scoreboard is not initialized!");
            }
            removeTouching(Worm.class);
        } 
        else if (isTouching(Shrimp.class)){
            int foodScore = 1000;
            if (scoreboard != null) {
                    scoreboard.addToScore(foodScore,"Player 1");
            } else {
                System.out.println("Scoreboard is not initialized!");
            }
            removeTouching(Shrimp.class);
        }
        else {
            if (isTouching(GoldenWorm.class)) {
                int foodScore = 10000;
                if (scoreboard != null) {
                    WinByGoldFish goldFishText = new WinByGoldFish("Player 1");
                    world.addObject(goldFishText, 450, 300);
                    Greenfoot.delay(120); // 60 frames is equivalent to 1 second
                    Greenfoot.setWorld(new GameWin());
                    //scoreboard.addToScore(foodScore,"Player 1");
                } else {
                    System.out.println("Scoreboard is not initialized!");
                }
                removeTouching(GoldenWorm.class);
            }
        }
    }
     
        private void fishMovement() {
        if (Greenfoot.isKeyDown("D")){
            setLocation(getX() + fishSpeed, getY());
            setRotation(0);  // Set rotation to face right
            setImage("Fish1.png");
        } else if (Greenfoot.isKeyDown("A")){
            setLocation(getX() - fishSpeed, getY());
            setImage("MFish1.png");
        }
        
        if (Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY() - fishSpeed);  
        }else if (Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY() + fishSpeed);
        }
    
        
    }


}
