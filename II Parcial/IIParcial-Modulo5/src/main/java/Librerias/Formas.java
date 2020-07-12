
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 5.
*/
public abstract class Formas 
{
    //Declaracion de las propiedades
    private String Color;
    abstract String Dibujar();

    public Formas()
    {
        //Constructor
    }
    
    //Setters
    public void EstablecerColor(String color)
    {
        this.Color = color;
    }
    
    //Getters
    public String Color()
    {
        return Color;
    }
}
