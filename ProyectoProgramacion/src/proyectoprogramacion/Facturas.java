/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author orlando
 */
public class Facturas 
{
    //Creacion de atributos de la clase Facturas
    private static String fecha_compra;
    
    //Metodos Get y Set de los atributos 
        public static String getFecha_compra() {
            return fecha_compra;
        }

        public static void setFecha_compra(String fecha_compra) {
            Facturas.fecha_compra = fecha_compra;
        } 
        
        //Metodo Mostrar Factura
        public static void mostrar_factura () 
        {
           Productos product1 = new Productos();
           VentasProducts vent1 = new VentasProducts();
           Clientes client1 = new Clientes();
            
            if (vent1.getMonto_cuenta() >= product1.getPrecio_total()){
              String s="Factura de Venta = \n";
              s=s+"Fecha de la Compra = " + getFecha_compra() +"\n";
              s=s+"Nombre Cliente: = " + client1.getNombre() +"\n";
              s=s+"Numero Identificacion: = " + client1.getCedula() +"\n";
              s=s+"Correo Electronico = " + client1.getCorreo() +"\n";
              s=s+"Numero Contacto = " + client1.getNum_contacto()+"\n";
              s=s+"Direccion = " + vent1.getDireccion() +"\n";
              s=s+"Cupon = " + vent1.getCupon() +"\n";
              s=s+"Precio a Pagar = " + product1.getPrecio_total()+"\n";
              JOptionPane.showMessageDialog(null, s);
              JOptionPane.showMessageDialog(null, "El pago fue realizado con exito, gracias por su compra");
        }
        else 
        {
              JOptionPane.showMessageDialog(null, "El Saldo es Insuficiente para realizar la compra");
        }
        }
}
