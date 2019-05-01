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
import java.util.Scanner;


public class Game {
    
    
    
    private JFrame frame;
    private int numPlayers;
    private Scanner input;
    private int currentPlayer;
    private Player[] players;
    //constructor
    public Game()
    {
        frame = new JFrame("Snakes and Ladders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
                
                frame.setOpacity(1);
        input = new Scanner(System.in);
        currentPlayer = 0;
        
    }
    
  
    public Player[] getPlayers()
    {
        return players;
    }
    
   
    public void play()
    {
        System.out.println("Enter the number of players: ");
        numPlayers = input.nextInt();
        players = new Player[numPlayers];
        
        for(int i = 0; i < numPlayers; i++)
        {
            switch(i % 5)
            {
                case 0: players[i] = new Player(Color.orange, "" + (i + 1) + " (Orange)");
                break;
                case 1: players[i] = new Player(Color.blue, "" + (i + 1) + "(Blue)");
                break;
                case 2: players[i] = new Player(Color.green, "" + (i + 1) + " (Green)");
                break;
                case 3: players[i] = new Player(Color.yellow, "" + (i + 1) + " (Yellow)");
                break;
                case 4: players[i] = new Player(Color.magenta, "" + (i + 1) + " (Magenta)");
                break;
                case 5: players[i] = new Player(Color.black, "" + (i + 1) + " (Black)");
                break;
            }
        }
    

    boolean win = false;
    while(!win)
    {
        System.out.println("Player " + players[currentPlayer].getName() + "'s turn. Type (R) to roll.");
        input.next();
        win = players[currentPlayer].roll();
        
        JPanel board = new Board(this);
        frame.getContentPane().add(board);
        frame.pack();
        frame.setVisible(true);
        
      
        if(!win)
        {
            currentPlayer = (currentPlayer + 1) % numPlayers;
        }
    }
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
