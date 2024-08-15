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
public class VentasProducts 
{
    //Creacion de atributos
    private static String Direccion;
    private static double Num_cuenta;
    private static String Cupon;
    private static double monto_cuenta;

    //Metodos Get y Set de los atributos
        public static String getDireccion() {
            return Direccion;
        }

        public static void setDireccion(String Direccion) {
            VentasProducts.Direccion = Direccion;
        }

        public static double getNum_cuenta() {
            return Num_cuenta;
        }

        public static void setNum_cuenta(double Num_cuenta) {
            VentasProducts.Num_cuenta = Num_cuenta;
        }

        public static String getCupon() {
            return Cupon;
        }

        public static void setCupon(String Cupon) {
            VentasProducts.Cupon = Cupon;
        }

        public static double getMonto_cuenta() {
            return monto_cuenta;
        }

        public static void setMonto_cuenta(double monto_cuenta) {
            VentasProducts.monto_cuenta = monto_cuenta;
        }
    
    
}
