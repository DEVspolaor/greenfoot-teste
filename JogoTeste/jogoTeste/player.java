import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    public int speed = 1;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    
    public void movimento(){

    if (Greenfoot.isKeyDown("w")) {
    this.setLocation(this.getX(), this.getY()-speed);
    }
    if (Greenfoot.isKeyDown("s")) {
    this.setLocation(this.getX(), this.getY() + speed);
    }
    if (Greenfoot.isKeyDown("a")){
    this.setLocation(this.getX() - speed, this.getY());
    }
    if (Greenfoot.isKeyDown("d")){
    this.setLocation(this.getX() + speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("f")) {
    getWorld().addObject(new fire(), getX() - 100, getY() + 30);
    }
}
}


 

