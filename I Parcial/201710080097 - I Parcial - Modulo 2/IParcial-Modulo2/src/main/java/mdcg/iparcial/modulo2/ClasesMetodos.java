/*
    * Crear una clase que se llame Recursos con 4 métodos diferentes.
    * Instanciar la clase en el programa principal y llamar a los métodos.
 */
package mdcg.iparcial.modulo2;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 1 - Ejercicio #6
 */

public class ClasesMetodos
{
    public static void main(String[] args)
    {
        Recursos recursos = new Recursos();
        
        recursos.Mensaje();
        
        recursos.AprobadoReprobado(50);
        
        recursos.Division2Enteros(15, 3);
        
        recursos.ListaNumeros(15);
    }
    
    public static class Recursos
    {
        //Primer Metodo
        public void Mensaje()
        {
            System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo\n");
        }
        
        //Segundo Metodo
        public void AprobadoReprobado(int notaEstudiante)
        {
            if(notaEstudiante < 70)
            {
                System.out.println("El alumno a Reprobado\n");
            }
            else
            {
                System.out.println("El alumno a Aprobado\n");
            }
        }
        
        public void Division2Enteros(int Numero1, int Numero2)
        {
            if(Numero2 != 0)
            {
                System.out.println("El resultado de la division de " + Numero1 + "/" + Numero2 + " es : " + Numero1 / Numero2 + "\n");
            }
            else
            {
                System.out.println("La division entre cero no esta permitida\n");
            }
        }
        
        public void ListaNumeros(int NumeroFinal)
        {
            System.out.println("Imprimiendo numeros desde el 1 hasta " + NumeroFinal);
            
            for(int Cont = 1; Cont <= NumeroFinal; Cont++)
            {
                System.out.println(Cont);
            }
        }
    }
}