import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    private int velocidad_coche;
    private moto1 num1;
    private int num_rivales;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(513, 646, 1); 
        velocidad_coche = 3;
        num1 = new moto1(velocidad_coche);
        
        
        addObject(num1, 255, 585);
    }
    
    public void act(){
        añadir_rivales();
    }
    
    public int getRandomNumber(int start,int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }

    public void disminuir_num_rivales(){
        num_rivales--;
    }

    public void añadir_rivales(){
    
     if(num_rivales == 0){
        int carril = getRandomNumber(0,3);
        
        if(carril == 0){
            addObject(new moto2(velocidad_coche),98,80);  
        }
        
        else if (carril == 1){
            addObject(new moto2(velocidad_coche),255,80);
        }
        
        else{
            addObject(new moto2(velocidad_coche),412,80);
        }
        
        carril++;
        carril = carril / 3;
        
        if(carril == 0){
            addObject(new moto2(velocidad_coche),98,80);  
        }
        
        else if (carril == 1){
            addObject(new moto2(velocidad_coche),255,80);
        }
        
        else{
            addObject(new moto2(velocidad_coche),412,80);
        }
        
        num_rivales = 2;
    
    }
    
   } 
    
}



