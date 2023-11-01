import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (SpolaVemDePix) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    
    private GreenfootSound bgMusic = new GreenfootSound("battle.mp3");
    
    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        corasson3 corasson3 = new corasson3();
        addObject(corasson3,103,207);
        gif gif = new gif();
        addObject(gif,610,198);
        gif.setLocation(393,39);
        Counter counter = new Counter();
        addObject(counter,393,39);
        gif.setLocation(563,231);
        gif.setLocation(575,26);
        counter2 counter2 = new counter2();
        addObject(counter2,575,26);
        gif.setLocation(588,57);
        gif.setLocation(658,54);
        gif.setLocation(199,36);
        gif.setLocation(619,342);
        gif.setLocation(384,21);
        gif.setLocation(147,31);
        counter.setLocation(172,20);
        corasson3.setLocation(549,256);
        gif.setLocation(568,248);
        corasson3.setLocation(664,461);
        corasson3.setLocation(443,241);
        corasson3.setLocation(472,235);
        corasson3.setLocation(572,360);
        corasson3.setLocation(152,206);
        gif.setLocation(528,143);
    }
}


