/*
 * Crear una clase que defina un tipo de trabajo.
 */
package mdcg.iparcial.modulo3;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Modulo 3
*/

public class claseEbanista {

    public static void main(String[] args) 
    {
        // Instanciar la Clase Ebanista
        Ebanista ebanista = new Ebanista();
        ebanista.setMueble("Mueble de Cocina");
        ebanista.setTipoMadera("Cedro");
        ebanista.setAlto(24);
        ebanista.setAncho(12);
        ebanista.setLargo(60);
        ebanista.setColor("Blanco");
        
        System.out.println("Modelo : " + ebanista.getMueble());
        System.out.println("Tipo de Madera : " + ebanista.getTipoMadera());
        System.out.println("Color : " + ebanista.getColor());
        System.out.println("Medidas:");
        System.out.println("Alto : " + ebanista.getAlto());
        System.out.println("Ancho : " + ebanista.getAncho());
        System.out.println("Largo : " + ebanista.getLargo());
    }
    
    public static class Ebanista
    {
        //Atributos
        private String Mueble;
        private String TipoMadera;
        private int Alto;
        private int Ancho;
        private int Largo;
        private String Color;
        
        //Metodos para acceder
        public String getMueble()
        {
            return Mueble;
        }
        public String getTipoMadera()
        {
            return TipoMadera;
        }
        public int getAlto()
        {
            return Alto;
        }
        public int getAncho()
        {
            return Ancho;
        }
        public int getLargo()
        {
            return Largo;
        }
        public String getColor()
        {
            return Color;
        }
        
        //Metodos para establecer valores
        public void setMueble(String mueble)
        {
            this.Mueble = mueble;
        }
        public void setTipoMadera(String tipomadera)
        {
            this.TipoMadera = tipomadera;
        }
        public void setAlto(int alto)
        {
            this.Alto = alto;
        }
        public void setAncho(int ancho)
        {
            this.Ancho = ancho;
        }
        public void setLargo(int largo)
        {
            this.Largo = largo;
        }
        public void setColor(String color)
        {
            this.Color = color;
        }
    }
    
}
