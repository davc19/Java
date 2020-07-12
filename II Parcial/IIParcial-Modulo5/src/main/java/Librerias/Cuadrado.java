
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 5.
*/
public class Cuadrado extends Formas
{
    //Propiedades
    private double Base;
    private double Altura;
    
    //Constructor
    public Cuadrado()
    {
        //Establecer el Color
        EstablecerColor("Azul");
    }
    
    //Calcula el Area
    public double CalcularArea()
    {
        return getBase() * getAltura();
    }

    //Setters
    public void setBase(double base)
    {
        this.Base = base;
    }
    
    public void setAltura(double altura)
    {
        this.Altura = altura;
    }
    
    //Getters
    private double getBase()
    {
        return Base;
    }
    
    private double getAltura()
    {
        return Altura;
    }
    
    //Sobre-escribe el metodo Dibujar
    @Override
    public String Dibujar() 
    {
        return "Cuadrado";
    }
}
