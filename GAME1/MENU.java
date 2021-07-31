import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MENU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MENU extends World
{
    Flecha flecha = new Flecha();
    private int opcion=0;

    public MENU()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(536, 490, 1); 

        prepare();
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Salir salir = new Salir();
        addObject(salir,280,456);
        Jugar jugar = new Jugar();
        addObject(jugar,262,254);
    }
    
    
    public void act(){
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new MyWorld());
    
    }
    
    
}
