import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class corasson3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class corasson3 extends Actor
{
   GifImage myGif1 = new GifImage("corasson3.gif");
    
    public int speed = 3;
    public int lifes = 10;
    /**
     * Act - do whatever the gif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif1.getCurrentImage());
        movimento();// Add your action code here.
        acertarAlvo();
    }
    public void movimento(){

    if (Greenfoot.isKeyDown("up")) {
    this.setLocation(this.getX(), this.getY()-speed);
    }
    if (Greenfoot.isKeyDown("down")) {
    this.setLocation(this.getX(), this.getY() + speed);
    }
    if (Greenfoot.isKeyDown("left")){
    this.setLocation(this.getX() - speed, this.getY());
    }
    if (Greenfoot.isKeyDown("right")){
    this.setLocation(this.getX() + speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("space")&& getObjectsInRange(200, fire.class).isEmpty()) {
    getWorld().addObject(new bubblebeam(), getX() + 50, getY() + 30);

    }
}
    public void acertarAlvo() {
        Actor a = getOneIntersectingObject(fire.class);
        
        if (a != null) {
            counter2 counter2 = (counter2) getWorld().getObjects(counter2.class).get(0);
            counter2.add(1);
            getWorld().removeObject(a);
            lifes -=1;
            
        }
        else if (lifes == 0) {
            getWorld().removeObject(this);
        }
    }
}

