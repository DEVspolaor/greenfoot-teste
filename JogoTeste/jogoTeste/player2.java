import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player2 extends Actor
{
    public int speed = 1;
    /**
     * Act - do whatever the player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();// Add your action code here.
    }
    
    public void movimento(){

    if (Greenfoot.isKeyDown("up")) {
    this.setLocation(this.getX(), this.getY()-speed);
    }
    else if (Greenfoot.isKeyDown("down")) {
    this.setLocation(this.getX(), this.getY() + speed);
    }
    else if (Greenfoot.isKeyDown("left")){
    this.setLocation(this.getX() - speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("right")){
    this.setLocation(this.getX() + speed, this.getY());
    }
}

}
