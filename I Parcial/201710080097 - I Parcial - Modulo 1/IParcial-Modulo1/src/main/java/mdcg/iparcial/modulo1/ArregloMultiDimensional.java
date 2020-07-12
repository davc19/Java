/*
    * Impresion de un arreglo multidimensional de 5 x 4.
 */
package mdcg.iparcial.modulo1;

/**
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 1 - Ejercicio #5
 */

public class ArregloMultiDimensional
{
    public static void main(String[] args)
    {
        String[][] Alumnos = new String[5][4];
        
        Alumnos[0][0] = "Marvin";
        Alumnos[0][1] = "Argueta";
        Alumnos[0][2] = "Electrónica";
        Alumnos[0][3] = "CallCenter Startek";

        Alumnos[1][0] = "Kevin";
        Alumnos[1][1] = "Zelaya";
        Alumnos[1][2] = "Industrial";
        Alumnos[1][3] = "N/A";

        Alumnos[2][0] = "Karen";
        Alumnos[2][1] = "Mendoza";
        Alumnos[2][2] = "Industrial";
        Alumnos[2][3] = "N/A";

        Alumnos[3][0] = "Kevin";
        Alumnos[3][1] = "Archaga";
        Alumnos[3][2] = "Computación";
        Alumnos[3][3] = "N/A";

        Alumnos[4][0] = "Milton";
        Alumnos[4][1] = "Canales";
        Alumnos[4][2] = "Computación";
        Alumnos[4][3] = "BANPAIS";
        
        
        System.out.println("Nombre\tApellido\tCarrera\t\tLugar Trabajo");
        for(int Cont = 0; Cont < 5; Cont++)
        {
            System.out.println(Alumnos[Cont][0] + "\t" + Alumnos[Cont][1] + "\t\t" + Alumnos[Cont][2] + "\t" + Alumnos[Cont][3]);
        }
    }
}
