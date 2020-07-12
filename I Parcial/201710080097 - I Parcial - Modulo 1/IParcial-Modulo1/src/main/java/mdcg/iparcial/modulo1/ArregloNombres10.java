/*
    * Impresion de un arreglo con 10 nombres.
 */
package mdcg.iparcial.modulo1;

/**
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 1 - Ejercicio #4
 */

public class ArregloNombres10
{
    public static void main(String[] args)
    {
        String[] Nombres = {
            "Axsel Maldonado"
            ,"Nelson Mancia"
            ,"Genesis Ulloa"
            ,"Magaly Yanez"
            ,"Fernando Jimenez"
            ,"Jose Joo"
            ,"Juan Reyes"
            ,"Jorge Tinoco"
            ,"Esdras Ramos"
            ,"Dimas Guzman"};
        
        for(int Cont = 0; Cont < 10; Cont++)
        {
            System.out.println(Nombres[Cont]);
        }
    }
}
