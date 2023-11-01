import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gif extends Actor
{
    GifImage myGif = new GifImage("charizard-flying.gif");
    GreenfootSound fire = new GreenfootSound("fire.mp3");
    
    public int speed = 3;
    public int lifes = 10;
    /**
     * Act - do whatever the gif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        movimento();// Add your action code here.
        acertarAlvo();
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
    else if (Greenfoot.isKeyDown("f") && getObjectsInRange(200, fire.class).isEmpty()) {
    getWorld().addObject(new fire(), getX() - 100, getY() + 30);
    fire.play();
    }
}
    public void acertarAlvo() {
        Actor b = getOneIntersectingObject(bubblebeam.class);
        
        if (b != null) {
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            getWorld().removeObject(b);
            lifes -=1;
            
        }
        else if (lifes == 0) {
            getWorld().removeObject(this);
        }
    }
}

