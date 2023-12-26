import greenfoot.*;

public class MyWorld extends World 
{
    
    
        public Scoreboard scoreboard = new Scoreboard("Player 1");
        public Scoreboard scoreboard2 = new Scoreboard("Player 2");

        private int timer = 0;

    public MyWorld() {
        super(900, 600, 1);
        prepare();
    }

    private void prepare() {
        
    }
    
    public void act() {
        if (Greenfoot.getRandomNumber(50) == 0) {
            Worm worm = new Worm(Greenfoot.getRandomNumber(5) + 1);
            int edge = Greenfoot.getRandomNumber(2); // Randomly select left (0) or right (1) edge
            int x = 0, y = Greenfoot.getRandomNumber(getHeight());
            
            if (edge == 1) { // Right edge
                x = getWidth();
            }
    
            addObject(worm, x, y);
            
        }
        
        if (Greenfoot.getRandomNumber(250) == 0) {  
            Mine bomb = new Mine(Greenfoot.getRandomNumber(5) + 1);
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = 0; // Spawn from the top edge
        
            addObject(bomb, x, y);
            
        }
        
        if (Greenfoot.getRandomNumber(250) == 0) {  
            Trash trash = new Trash(Greenfoot.getRandomNumber(5) + 1);
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = 0; // Spawn from the top edge
        
            addObject(trash, x, y);
            
        }
    
        if (Greenfoot.getRandomNumber(350) == 0) {
            Shrimp shrimp = new Shrimp(Greenfoot.getRandomNumber(5) + 1);
            int edge = Greenfoot.getRandomNumber(2); // Randomly select left (0) or right (1) edge
            int x = 0, y = Greenfoot.getRandomNumber(getHeight());
            
            if (edge == 1) { // Right edge
                x = getWidth();
            }
    
            addObject(shrimp, x, y);
            
        }
        if (Greenfoot.getRandomNumber(500) == 0) {
            Shark shark = new Shark(Greenfoot.getRandomNumber(5) + 1);
            int edge = Greenfoot.getRandomNumber(2); // Randomly select left (0) or right (1) edge
            int x = 0, y = Greenfoot.getRandomNumber(getHeight());
            
            if (edge == 1) { // Right edge
                x = getWidth();
            }
    
            addObject(shark, x, y);
            timer = 0;
        }
        
        if (Greenfoot.getRandomNumber(3000) == 0) {
            GoldenWorm Gworm = new GoldenWorm(Greenfoot.getRandomNumber(5) + 1);
            int edge = Greenfoot.getRandomNumber(2); // Randomly select left (0) or right (1) edge
            int x = 0, y = Greenfoot.getRandomNumber(getHeight());
    
            if (edge == 1) { // Right edge
                x = getWidth();
            }
            
            addObject(Gworm, x, y);
            timer = 0;
            }
    
        timer++;
        
    }


}
