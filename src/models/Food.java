/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Color;
import java.awt.Graphics;
import viewmodel.Game;

/**
 *
 * @author AYESHA ALI FIRDAUS
 */
public class Food extends GameObject{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Food()
    {
        super(0, 0, "Food");
        super.setHeight(30);
    }
    
    // Constructor with player position.
    public Food(int x, int y)
    {
        super(x, y, "Food");
        super.setHeight(30);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics g)
    {
        g.setColor(Color.decode("#ff0000"));
        g.fillOval(x, y, 20, 20);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize player bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
