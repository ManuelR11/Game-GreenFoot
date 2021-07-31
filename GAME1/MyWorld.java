import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound myMusic1 = new GreenfootSound("Don Diablo - Cutting Shapes (Official Music Video)_50k.mp3");
    GreenfootSound myMusic2 = new GreenfootSound("Earth, Wind & Fire - September (Official Video)_50k.mp3");
    GreenfootSound myMusic3 = new GreenfootSound("Mark Ronson - Uptown Funk (Official Video) ft. Bruno Mars_50k.mp3");
    GreenfootSound myMusic4 = new GreenfootSound("Project X Pursuit Of Happiness_50k.mp3");
    GreenfootSound myMusic5 = new GreenfootSound("Young Wild and Free - Wiz Khalifa (Lyrics)_50k.mp3");
    

    private int velocidad_coche;
    private moto1 num1;
    private int num_rivales;
    private counter score;
    private counter level;
    private int adelantar;
    private int adelantar_nivel;
    private int mus = 0;
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(513, 646, 1);
        adelantar = 0;
        adelantar_nivel = 4;
        velocidad_coche = 2;
        num1 = new moto1(velocidad_coche);
        
        score = new counter("SCORE: ");
        level = new counter("LEVEL: ");
        level.add(1);
        num1 = new moto1(velocidad_coche);
        
        
        addObject(num1, 255, 585);
        addObject(level,150,60);
        addObject(score,150,30);
    }
    
    public void act(){
        aumentar_dificultad();
        añadir_rivales();
       
       if(mus == 0){ 
           int musica = getRandomNumber(0,4);
        
           if(musica == 0){
               myMusic1.play();
               mus++;
            }
        
            else if (musica == 1){
                myMusic2.play();
                mus++; 
            }
        
            else if (musica == 2){
                myMusic3.play();
                mus++;
                
            }
        
            else if (musica == 3){
                myMusic4.play();
                mus++;
                
            }
        
            else{
                myMusic5.play();
                mus++;
                
       }
    
    }     
    
    }
    
    public int getRandomNumber(int start,int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    
    public void aumentar_adelantar(){
        adelantar++; 
    }

    public void disminuir_num_rivales(){
        num_rivales--;
    }
    
    public void aumentar_dificultad(){
        if(adelantar == adelantar_nivel){
            adelantar = 0;
            adelantar_nivel = adelantar_nivel + 2;
            velocidad_coche++;
            level.add(1);
            num1.aumenta_velocidad();
        }
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



