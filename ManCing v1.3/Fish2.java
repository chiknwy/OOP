import greenfoot.*;

public class Fish2 extends Fish {
    
    public Fish2() {
        super.fishSpeed = fishSpeed;
     }

    public Fish2(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
     }

    public void act() {
        fish2Movement();
        eatFood1();
        this.showStatus();
    }
    
    private GreenfootImage heart3 = new GreenfootImage("3.png"); //3 hearts
    private GreenfootImage heart2 = new GreenfootImage("2.png"); //menambahkan gambar gameover   
    private GreenfootImage heart1 = new GreenfootImage("1.png"); //menambahkan gambar gameover
    
     public void showStatus()
    {   
        this.eatTrash();
        switch (this.lives) {
            case 3:
                getWorld().getBackground().drawImage(heart3, 700,80);
                break;
            case 2:
                getWorld().getBackground().drawImage(heart2, 700,80);
                break;
            case 1:
                getWorld().getBackground().drawImage(heart1, 700,80);
                break;
            // Add more cases if needed
            default:
                // Handle other cases or add a default image
                break;
        }
    }
     public void testEndGame()
    {
        if (lives == 0)
        {              
            World world = getWorld();
            DeathByHeart deathBombHeart = new DeathByHeart("Player 2" );   
            world.addObject(deathBombHeart, 450, 300);
            Greenfoot.delay(120); // 60 frames is equivalent to 1 second
            Greenfoot.setWorld(new GameOver());
            
        }
    }
    public void removeLife()
    {
        lives--;
        if (lives == 0)
        {   
            this.testEndGame();
            lives = 0;
        }
    }
    public void eatTrash(){
        if (isTouching(Trash.class)){
            this.removeLife();
            removeTouching(Trash.class);
        }
    }
    public void eatFood1() {
        World world = getWorld();
        if (isTouching(Worm.class)) {
            int foodScore = 100;
            if (scoreboard != null) {
                    scoreboard.addToScore(foodScore,"Player 2");
            } else {
                System.out.println("Scoreboard is not initialized!");
            }
            removeTouching(Worm.class);
        } 
        else if (isTouching(Shrimp.class)){
            int foodScore = 1000;
            if (scoreboard != null) {
                    scoreboard.addToScore(foodScore,"Player 2");
            } else {
                System.out.println("Scoreboard is not initialized!");
            }
            removeTouching(Shrimp.class);
        }
        else {
            if (isTouching(GoldenWorm.class)) {
                int foodScore = 10000;
                if (scoreboard != null) {
                    WinByGoldFish goldFishText = new WinByGoldFish("Player 2");
                    world.addObject(goldFishText, 450, 300);
                    Greenfoot.delay(120); // 60 frames is equivalent to 1 second
                    Greenfoot.setWorld(new GameWin());
                    //scoreboard.addToScore(foodScore,"Player 2");
                } else {
                    System.out.println("Scoreboard is not initialized!");
                }
                removeTouching(GoldenWorm.class);
            }
        }
    }
    
    private void fish2Movement() {
        if (Greenfoot.isKeyDown("Right")){
            setLocation(getX() + fishSpeed, getY());
            setRotation(0);
            setImage("fish2.png");
        } else if (Greenfoot.isKeyDown("Left")){
            setLocation(getX() - fishSpeed, getY());
            setImage("MFish2.png");
        }

        if (Greenfoot.isKeyDown("Up")){
            setLocation(getX(), getY() - fishSpeed);
        } else if (Greenfoot.isKeyDown("Down")){
            setLocation(getX(), getY() + fishSpeed);
        }

        
    }
}
