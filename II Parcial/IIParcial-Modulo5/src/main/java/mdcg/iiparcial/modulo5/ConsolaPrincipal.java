/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 5.
*/
package mdcg.iiparcial.modulo5;

import Librerias.Circulo;
import Librerias.Cuadrado;
import Librerias.Linea;
import Librerias.Triangulo;

/**
 *
 * @author Personal
 */
public class ConsolaPrincipal {

    public static void main(String[] args) 
    {
        //Inicializar la clase Circulo y utilizar sus metodos y propiedades
        Circulo circulo = new Circulo();
        
        circulo.Radio(15);
 
        System.out.println("Figura : " + circulo.Dibujar());
        System.out.println("Color : " + circulo.Color());
        System.out.println("Calculo Radio : " + circulo.CarcularRadio());
        
        
        //Inicializar la clase Linea y utilizar sus metodos y propiedades
        System.out.println("******************************************");
        Linea linea = new Linea();
        
        linea.setLargo(50);
        
        System.out.println("Figura : " + linea.Dibujar());
        System.out.println("Color : " + linea.Color());
        System.out.println("Largo Linea : " + linea.Largo());

        
        //Inicializar la clase Triangulo y utilizar sus metodos y propiedades
        System.out.println("******************************************");
        Triangulo triangulo = new Triangulo();
 
        triangulo.setBase(11);
        triangulo.setAltura(7);
        
        System.out.println("Figura : " + triangulo.Dibujar());
        System.out.println("Color : " + triangulo.Color());
        System.out.println("Area del Triangulo : " + triangulo.CalcularArea());

        
        //Inicializar la clase Cuadrado y utilizar sus metodos y propiedades
        System.out.println("******************************************");
        Cuadrado cuadrado = new Cuadrado();
        
        cuadrado.setBase(7);
        cuadrado.setAltura(7);
        
        System.out.println("Figura : " + cuadrado.Dibujar());
        System.out.println("Color : " + cuadrado.Color());
        System.out.println("Area del Cuadrado : " + cuadrado.CalcularArea());
    }
    
}
