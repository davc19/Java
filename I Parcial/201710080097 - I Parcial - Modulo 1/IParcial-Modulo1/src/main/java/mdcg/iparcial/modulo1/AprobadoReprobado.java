/*
    * Programa que imprima en consola un nombre de estudiante
    * Una nota y una etiqueta que diga Aprobado o Reprobado
 */
package mdcg.iparcial.modulo1;

/**
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 1 - Ejercicio #6
 */

public class AprobadoReprobado
{
    public static void main(String[] args)
    {
        String Nombre = "Milton Canales";
        int Nota = 10;
        double NUmero1, Numero2 = 0;
        if(Nota < 70)
        {
            System.out.println(Nombre + "\t" + Nota + "\tReprobado");
        }
        else
        {
            System.out.println(Nombre + "\t" + Nota + "\tAprobado");
        }
    }
}
