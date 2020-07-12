
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 5.
*/
public class Circulo  extends Formas
{
    //Propiedades
    private double Radio;
    
    //Constructor
    public Circulo()
    {
        //Establece el color
        EstablecerColor("Rojo");
    }

    //Setters
    public void Radio(double radio)
    {
        this.Radio = radio;
    }
    
    //Calcula la Circunferencia
    public double CarcularRadio()
    {
        return (2 * 3.14) * Radio;
    }
    
    //Sobre-escribe el metodo Dibujar
    @Override
    public String Dibujar() 
    {
        return "Circulo";
    }
}
