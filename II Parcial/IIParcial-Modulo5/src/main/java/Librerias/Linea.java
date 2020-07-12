
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 5.
*/
public class Linea extends Formas
{
    //Propiedades
    private int Largo;

   //Constructor
    public Linea()
    {
        //Establece el color
        EstablecerColor("Negro");
    }
    //Setters
    public void setLargo(int largo)
    {
        this.Largo = largo;
    }
    //Getters
    public int Largo()
    {
        return Largo;
    }

    //Sobre-escribe el método Dibujar
    @Override
    public String Dibujar() 
    {
        return "Linea";
    }
}
