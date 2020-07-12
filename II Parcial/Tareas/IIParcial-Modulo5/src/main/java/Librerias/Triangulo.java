
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 5.
*/
public class Triangulo  extends Formas
{
    //Propiedades
    private double Base;
    private double Altura;

    //Constructor
    public Triangulo()
    {
        //Establecer el Color
        EstablecerColor("Verde");
    }

    //Calcula el Area
    public double CalcularArea()
    {
        return (getBase() * getAltura()) / 2;
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
        return "Triangulo";
    }
}
