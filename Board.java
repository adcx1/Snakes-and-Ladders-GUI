/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avery
 */

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class Board extends JPanel
{
   
    private Game game;
    
    
  
    public Board(Game game)
    {
        setPreferredSize(new Dimension(805, 818));
        this.game = game;
    }
    
    
    public void paintComponent(Graphics g)
    {
        
        
        super.paintComponent(g);
        
        BufferedImage background = null;
        
        try
        {
            background = ImageIO.read(new File("SandL.gif"));
        }
        catch (IOException e){
        }
            
        
            g.drawImage (background, 0, 0, null);
            
            
            for (Player player: game.getPlayers())
            {
                g.setColor(player.getColor());
                g.fillOval(player.getPosition().getX(), player.getPosition().getY(), 50, 50);
            }
        
        
    }
    
}
