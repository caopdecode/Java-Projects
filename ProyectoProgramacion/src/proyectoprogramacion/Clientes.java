/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

/**
 *
 * @author orlando
 */
public class Clientes 
{
    //Creacion de los atributos de la clase clientes
    private static String nombre;
    private static long cedula;
    private static String correo;
    private static long num_contacto;

    //Metodos Get y Set de variables
        public static String getNombre() {
            return nombre;
        }

        public static void setNombre(String nombre) {
            Clientes.nombre = nombre;
        }

        public static long getCedula() {
            return cedula;
        }

        public static void setCedula(long cedula) {
            Clientes.cedula = cedula;
        }

        public static String getCorreo() {
            return correo;
        }

        public static void setCorreo(String correo) {
            Clientes.correo = correo;
        }

        public static long getNum_contacto() {
            return num_contacto;
        }

        public static void setNum_contacto(long num_contacto) {
            Clientes.num_contacto = num_contacto;
        }

}
