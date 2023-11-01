import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fire extends player
{
    /**
     * Act - do whatever the fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();// Add your action code here.
       
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() +Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x-2, y); 
    }
    
    public void Edge(){
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
}
