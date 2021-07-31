import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class moto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moto1 extends Actor
{
    private int speed;
    
    public moto1(int v){
        speed = v;
    }
    
    /**
     * Act - do whatever the moto1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            if(getX() < 410)
            setLocation(getX() + speed, getY());
            
        }
        if(Greenfoot.isKeyDown("left")){
            if(getX() > 98)
            setLocation(getX() - speed, getY());
            
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 310)
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 585)
            setLocation(getX(), getY() + speed);
        }
    
        Actor collided = getOneIntersectingObject(moto2.class);
        if (collided != null)
        {
          World myWorld = getWorld();
          myWorld.removeObject(collided);
          myWorld.removeObject(this);
          GAMEOVER gameover = new GAMEOVER();
          myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
          Greenfoot.stop();
        }
    
    }
    
    public void aumenta_velocidad(){
        speed++;
    }
    
    
}
