/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import viewmodel.Game;

/**
 *
 * @author Satria Ramadhani
 */
public class Player extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Player()
    {
        super(0, 0, "Player");
        super.setHeight(30);
    }
    
    // Constructor with player position.
    public Player(int x, int y)
    {
        super(x, y, "Player");
        super.setHeight(30);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics g)
    {
        // Set player icon.
        ImageIcon icon = new ImageIcon("src/assets/nemo.png");
        Image image = icon.getImage();
        g.drawImage(image, x, y, 70, 70, null);
        
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize player bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 80));
        y = Game.clamp(y, 0, (Game.height - 100));
    }
}
