import greenfoot.*;

public class Scoreboard extends Actor {
    public int score = 0;

    public Scoreboard(String player) {
        updateImage(player);
    }
    public void addToScore(int points, String winner) {
        score += points;
        updateImage(winner);
        
        if (score >= 10000) {
            World world = getWorld();
            WinByScore win = new WinByScore(winner);
            world.addObject(win, 450, 300);
            Greenfoot.delay(120);
            Greenfoot.setWorld(new GameWin());
        }
    }

    private void updateImage(String player) {
        setImage(new GreenfootImage(player + "\nScore: " + score, 28, Color.WHITE, new Color(0, 0, 0, 128)));
    }
}
