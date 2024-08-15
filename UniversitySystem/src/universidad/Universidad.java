/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import javax.swing.JOptionPane;

/**
 *
 * @author orlando
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int n,op,val,x;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estudiantes "));
       
        
        Datos dato = new Datos(n);
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("\n1. Incluir Nuevo Estudiante\n2. Estudiantes que Habilitan\n3. Estudiantes por Materia\n4. Notas por Estudiante \n5. Promedio \n6. Salir\n Digite su opcion"));
            
            switch(op)
            {
                case 1: dato.leer();
                        break;
                         
                case 2:  dato.EstHabilitan();
                         break;
                         
                case 3: dato.EstMaterias();
                        break;
                
                case 4: dato.EstNotas();
                        break;
                
                case 5: dato.Promedio();
                        break;       
            }
        } while (op!=6);     
    }   
    }
    

