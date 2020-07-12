/*
    * Condiciones verdadero o falso.
    * Se peude hacer de manera mas corta, pero el resultado lo imprime en ingles.
 */
package mdcg.iparcial.modulo1;

/**
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 1
 */
public class DecisionesVerdaderoFalso
{
    public static void main(String[] args)
    {
        int M = 6, T = 1, K = -10;
        String Op1, Op2, Op3;
        
        if(M > T)
        {
            Op1 = "Verdadero";
        }
        else
        {
            Op1 = "Falso";
        }

        if((T / K) == -5)
        {
            Op2 = "Verdadero";
        }
        else
        {
            Op2 = "Falso";
        }
        
        if((M+T == 7) || (M-T == 5))
        {
            Op3 = "Verdadero";
        }
        else
        {
            Op3 = "Falso";
        }

        System.out.println("La condición M > T es " + Op1);
        System.out.println("La condición (T / K) == -5 es " + Op2);
        System.out.println("La condición (M+T == 7) || (M-T == 5) es " + Op3);
    }
}
