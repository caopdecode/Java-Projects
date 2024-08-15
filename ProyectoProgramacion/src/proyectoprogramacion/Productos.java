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
public class Productos 
{
    //Creacion de atributos Clase Productos
    private static double codigo;
    private static String nombrep;
    private static double precio_unitario;
    private static double cantidadp;
    private static double precio_total;
    private static double precio_a_pagar;

    //Metodos Get y Set de los atributos
        public static double getCodigo() {
            return codigo;
        }

        public static void setCodigo(double codigo) {
            Productos.codigo = codigo;
        }

        public static String getNombrep() {
            return nombrep;
        }

        public static void setNombrep(String nombrep) {
            Productos.nombrep = nombrep;
        }

        public static double getPrecio_unitario() {
            return precio_unitario;
        }

        public static void setPrecio_unitario(double precio_unitario) {
            Productos.precio_unitario = precio_unitario;
        }

        public static double getCantidadp() {
            return cantidadp;
        }

        public static void setCantidadp(double cantidadp) {
            Productos.cantidadp = cantidadp;
        }

        public static double getPrecio_total() {
            return precio_total;
        }

        public static void setPrecio_total(double precio_total) {
            Productos.precio_total = precio_total;
        }

        public static double getPrecio_a_pagar() {
            return precio_a_pagar;
        }

        public static void setPrecio_a_pagar(double precio_a_pagar) {
            Productos.precio_a_pagar = precio_a_pagar;
        }
        
}
