/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatelefonia;

import javax.swing.JOptionPane;

/**
 *
 * @author orlando
 */
public class EmpresaTelefonia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int n,op,val,x;
 
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de personas a atender "));
        
        Servicios servicio = new Servicios(n);
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("\n1. Agregar Cliente\n2. Atender Cliente\n3. Mostrar Clientes\n4. Salir\n Digite la opcion que desea realizar"));
            
            switch(op)
            {
                case 1: String nom;
                        String cedula;
                        nom = JOptionPane.showInputDialog("Digite el nombre del cliente a agregar");
                        cedula = JOptionPane.showInputDialog("Digite numero de cedula del cliente");
                        x = servicio.Agregar(nom, cedula);
                        if (x==0) JOptionPane.showMessageDialog(null, "Fila llena");
                        else JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
                        break;
                         
                case 2:  x=servicio.Extraer();
                         if (x==0) JOptionPane.showMessageDialog(null,"\n Fila vacia");
                         else JOptionPane.showMessageDialog(null,"\nCliente atendido con exito");
                         break;
                         
                case 3: JOptionPane.showMessageDialog(null,"\nFilas" +servicio.Mostrar());
                        break;  
            }
        } while (op!=4);     
    }   
}    

