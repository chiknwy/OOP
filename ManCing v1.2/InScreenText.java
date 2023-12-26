import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InScreenText extends Actor {

    public void act() {
        // Perform actions if needed
    }

    public InScreenText(String mainText, String secondaryText) {
        updateImage(mainText, secondaryText);
    }

    public void updateImage(String mainText, String secondaryText) {
        // Set the background color with 50% opacity
        Color backgroundColor = new Color(0, 0, 0, 128); // RGB: 0, 0, 0 (black), alpha: 128 (50% opacity)

        // Create main text image with white text and transparent background
        GreenfootImage mainImage = new GreenfootImage(mainText, 50, Color.WHITE, backgroundColor);

        // Create secondary text image with white text and transparent background
        GreenfootImage secondaryImage = new GreenfootImage(secondaryText, 30, Color.WHITE, backgroundColor);

        // Calculate total height with spacing
        int totalHeight = mainImage.getHeight() + secondaryImage.getHeight() + 10; // 10 pixels spacing

        // Create a combined image with the specified background and height
        GreenfootImage combinedImage = new GreenfootImage(mainImage.getWidth(), totalHeight);

        // Draw main text at the top
        combinedImage.drawImage(mainImage, 0, 0);

        // Calculate the x-coordinate to center secondary text
        int xSecondary = (combinedImage.getWidth() - secondaryImage.getWidth()) / 2;

        // Draw secondary text in the middle with spacing
        combinedImage.drawImage(secondaryImage, xSecondary, mainImage.getHeight() + 10);

        // Set the combined image as the actor's image
        setImage(combinedImage);
    }
}
