/*
     * Imprimir los numeros pares del 2 al 100.
 */
package mdcg.iparcial.modulo1;

/**
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 1 - Ejercicio #7
 */

public class NumeroPares
{
    public static void main(String[] args) 
    {
        System.out.println("# Pares del 1 al 100");
        for(int Cont = 1; Cont <= 100; Cont++)
        {
            if(Cont % 2 == 0)
            {
                System.out.println("\t" + Cont);
            }
        }
    }
}
