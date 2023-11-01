import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class info2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info2 extends World
{
    public int temp = 20;
public int temp1 = 20;
public int temp2 = 20;
public int temp3 = 20;

    /**
     * Constructor for objects of class info2.
     * 
     */
    public info2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600,1); 
    }
     
 
public void act(){
    temp1--;
    //Diálogo Toad
    if(Greenfoot.isKeyDown("enter") && (temp1 < 1)){
        setBackground(new GreenfootImage("d1.png"));
        temp2--;
    }
    //Diálogo Mário
    if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
        setBackground(new GreenfootImage("d2.png"));
        temp3--;
    }
    //Iniciar o jogo
    if (Greenfoot.isKeyDown("enter") && (temp3 < 1)){
        Mundo world = new Mundo();
        Greenfoot.setWorld(world);
    }
}
}



