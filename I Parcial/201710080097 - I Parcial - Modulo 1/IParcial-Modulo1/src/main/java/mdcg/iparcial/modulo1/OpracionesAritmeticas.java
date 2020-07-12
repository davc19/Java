/*
    * Operaciones Aritméticas de dos números enteros
    * Suma, Resta, Multiplicación, División, Residuo
 */
package mdcg.iparcial.modulo1;

/**
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 1
 */
public class OpracionesAritmeticas 
{
    public static void main(String[] args)
    {
        int Num1 = 85;
        int Num2 = 9;

        int Suma, Resta, Multiplicacion, Division = 0, Residuo = 0;

        Suma = Num1 + Num2;
        Resta = Num1 - Num2;
        Multiplicacion = Num1 * Num2;
        
        if(Num2 != 0)
        {
            Division = Num1 / Num2;
            Residuo = Num1 % Num2;
        }
        
        System.out.println("La Suma de los numeros es : " + Suma);
        System.out.println("La Resta de los numeros es : " + Resta);
        System.out.println("La Multiplicacion de los numeros es : " + Multiplicacion);
        System.out.println("La Division de los numeros es : " + Division);
        System.out.println("El Residuo de los numeros es : " + Residuo);
    }
}
