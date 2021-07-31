import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    private int valor = 0;
    private int tar = 0;
    private String text;
    private int stringLength;

    public counter(){
        this("");
    }
    public counter(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 16;

        setImage(new GreenfootImage(stringLength, 24)); //imagen a partir de texto
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F)); 
        image.setColor(Color.WHITE);
        
        updateImage();
    }
    public void act() {
        if(valor < tar) {
            valor++;
            updateImage();
        }
        else if(valor > tar) {
            valor--;
            updateImage();
        }
    }
    public void add(int score){
        tar += score;
    }
    public void subtract(int score){
        tar -= score;
    }
    public int getValor(){
        return valor;
    }
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + valor, 1, 18);
    } 
}
