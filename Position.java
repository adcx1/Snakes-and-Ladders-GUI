/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avery
 */
public class Position {
    
    //position 0-100 on board. p = position
    int p = 0;
    
    public Position()
    {
        p = 0;
    }
    
    public int getPosition()
    {
        return p;
    }
    
    public void setPosition (int p)
    {
        this.p = p;
    }
    
    //gets x-position on board
    public int getX()
    {
       if (((p - 1) / 10) % 2 == 0)
       {
           return ((p - 1) % 10) * 85;
       }
       else
       {
           return 750 - (((p - 1) % 10) * 80);
       }
    }
    
    //gets y-position on board
    public int getY()
    {
        return 750 - (((p - 1) / 10) * 80);
    }
    
    //add to players current position
    public boolean add(int steps)
    {
        p += steps;
        checkClimb();
        checkFall();
        if (p >= 100)
        {
            p = 100;
           
            return true;
        }
        return false;
    }
    
    private void checkClimb()
    {
        switch(p)
        {
            case 1: p = 38;
            break;
            case 4: p = 14;
            break;
            case 9: p = 31;
            break;
            case 21: p = 42;
            break;
            case 28: p = 84;
            break;
            case 36: p = 44;
            break;
            case 51: p = 67;
            break;
            case 71: p = 91;
            break;
            case 80: p = 100;
            default: 
                return;
                           
        }
        System.out.println("You climbed up a ladder.");
    }
    
    private void checkFall ()
    {
        switch(p)
        {
            case 16: p = 6;
            break;
            case 48: p = 26;
            break;
            case 49: p = 11;
            break;
            case 56: p = 53;
            break;
            case 62: p = 10;
            break;
            case 64: p = 60;
            break;
            case 87: p = 24;
            break;
            case 93: p = 73;
            break;
            case 95: p = 75;
            break;
            case 98: p = 78;
            break;
            default:
                return;
        }
        System.out.println("You fell down a snake.");
    }
    
}
        
    

