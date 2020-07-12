/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdcg.ejemploobjetosjava;

/**
 *
 * @author Personal
 */
public class ObjetosJava 
{
    public static void main(String[] args) 
    {
        //Creando el objeto persona 
       Persona persona = new Persona();
       persona.setNombre("Eduardo");
       persona.setApellido("Suarez");
       persona.setEdad (20);
       persona.setSexo ("M");

       System.out.println("Nombre: " + persona.getNombre());
       System.out.println("apellido: " + persona.getApellido());
       System.out.println("Edad: " + persona.getEdad());
       System.out.println("Sexo: " + persona.getSexo());
    }
    
    public static class Persona
    {
        //Private hace que los atributos sean accedidos dentro de la clase
        private String nombre;
        private String apellido;
        private int edad;
        private String sexo;

        //Métodos públicos para acceder a los datos
        public String getNombre(){
            return nombre;
        }
        public String getApellido(){
            return apellido;
        }
        public int getEdad(){
            return edad;
        }
        public String getSexo(){
            return sexo;
        }
    
        //Métodos públicos para establecer los datos
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setSexo(String sexo){
            this.sexo = sexo;
        }
       }
}
