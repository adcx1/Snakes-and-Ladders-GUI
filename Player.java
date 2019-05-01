
import java.awt.*;


public class Player {
    
    private String name;
    private Position position;
    private Color color;
    
    
    
    public Player(Color color, String name)
    {
        position = new Position();
        this.color = color;
        this.name = name;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public Position getPosition()
    {
        return position;
    }
    
    public void setPosition(Position pos)
    {
        position = pos;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setColor(Color c)
    {
        color = c;
    }
    
   
    public boolean roll()
    {
        int roll = (int) (Math.random() * 6) + 1;
        System.out.println("You rolled a " + roll);
        return position.add(roll);
    }
}
    
   