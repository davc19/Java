/*
    Crear una clase de nombre Ciudadano en el que se declaren 
    y protejan sus métodos y propiedades utilizando encapsulamiento.
 */
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 4.
*/

public class Ciudadano {
    
    private String Nombre;
    private int Edad;
    private int AniosExperiencia;
    
    public void setNombre(String _nombre)
    {
        this.Nombre = _nombre;
    }
    
    public void setEdad(int _edad)
    {
        this.Edad = _edad;
    }
    
    public void setAnioExperiencia(int _anioExp)
    {
        this.AniosExperiencia = _anioExp;
    }
    
    public String getNombre()
    {
        return Nombre;
    }

    public int getEdad()
    {
        return Edad;
    }

    public int getAnioExperiencia()
    {
        return AniosExperiencia;
    }
}
