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
public class Ventas 
{
    private static String direccion;
    private static int tipo_de_pago;
    private static double num_cuenta;
    private static String cupon;
    private static int dinero_cuenta;

        public static String getDireccion() {
            return direccion;
        }

        public static void setDireccion(String direccion) {
            Ventas.direccion = direccion;
        }

        public static int getTipo_de_pago() {
            return tipo_de_pago;
        }

        public static void setTipo_de_pago(int tipo_de_pago) {
            Ventas.tipo_de_pago = tipo_de_pago;
        }

        public static double getNum_cuenta() {
            return num_cuenta;
        }

        public static void setNum_cuenta(double num_cuenta) {
            Ventas.num_cuenta = num_cuenta;
        }

        public static String getCupon() {
            return cupon;
        }

        public static void setCupon(String cupon) {
            Ventas.cupon = cupon;
        }

        public static int getDinero_cuenta() {
            return dinero_cuenta;
        }

        public static void setDinero_cuenta(int dinero_cuenta) {
            Ventas.dinero_cuenta = dinero_cuenta;
        }

       
}
