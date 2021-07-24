import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class moto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moto2 extends Actor
{
    private int speed;
    
    public moto2(int v){
        speed = v;
    }
    
    
    /**
     * Act - do whatever the moto2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY() + speed);
        if(getY() >= getWorld().getHeight() - 1 ){
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.disminuir_num_rivales();
        }
    } 
}
