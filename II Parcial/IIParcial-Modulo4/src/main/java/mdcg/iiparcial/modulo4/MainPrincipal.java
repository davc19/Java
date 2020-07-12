/*
     Encapsulamiento y Abstraccion
 */
package mdcg.iiparcial.modulo4;
import Librerias.Ciudadano;
import Librerias.ElSalvador;
import Librerias.Guatemala;
import Librerias.Honduras;
/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 4.
*/

public class MainPrincipal 
{
    public static void main(String[] args) 
    {
        //I Parte
        Ciudadano ciudadano = new Ciudadano();
        
        ciudadano.setNombre("Milton Canales");
        ciudadano.setEdad(30);
        ciudadano.setAnioExperiencia(6);
        
        System.out.println("I Parte");
        System.out.println(ciudadano.getNombre());
        System.out.println(ciudadano.getEdad());
        System.out.println(ciudadano.getAnioExperiencia());
        System.out.println();


        //II Parte
        Honduras hn = new Honduras();
        ElSalvador es = new ElSalvador();
        Guatemala gt = new Guatemala();
        
        System.out.println("II Parte");
        System.out.println("Pais : " + hn.getPais() + ", Presidente : " + hn.getPresidente());
        System.out.println("Pais : " + es.getPais() + ", Presidente : " + es.getPresidente());
        System.out.println("Pais : " + gt.getPais() + ", Presidente : " + gt.getPresidente());
    }
    
}
