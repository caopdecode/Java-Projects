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
public class Datos 
{
    private int numero;
    private int codigo [];
    private String nombre [];
    private String materia[];
    private double nota1 [];
    private double nota2[];
    private double nota3[];
    private double definitiva [];
    private String NombreEst;
    private String NombreMate;
    private int opcion;
    

    
    
    
    Datos (int n) //metodo constructor, (int n) es el argumento, se lee desde programa principal y define extension
    {
        codigo = new int [n];
        nombre = new String[n];
        materia = new String[n];
        numero = n;
        nota1 = new double [n];
        nota2 = new double [n];
        nota3 = new double [n];
        definitiva = new double [n];
        
        
    }
    
    public void leer () //ingresar las variables
    { 
        for(int i=0; i<numero; i++ )
        {
         codigo [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del estudiate numero " + i+1));  
         nombre[i] = JOptionPane.showInputDialog("Digite el nombre del estudiante " + i+1); 
         materia[i] = JOptionPane.showInputDialog("Digite el nombre de la materia " + i+1); 
         nota1 [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite la primera nota del estudiante numero " + i+1));
         nota2 [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite la segunda nota del estudiante numero " + i+1));
         nota3 [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite la tercera nota del estudiante numero " + i+1));
         definitiva[i] = + nota1[i]*0.3 + nota2[i]*0.3 + nota3[i]*0.4;
        }
    }
    
    public void Promedio()
    {
        double s = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1. Materia \n2. Estudiante \n Digite el numero de la opcion para saber el promedio"));
        if (opcion ==1)
        {
        NombreMate = JOptionPane.showInputDialog(null, "Digite el nombre de la materia");           
        for(int i=0; i<numero; i++)
        {
            if(materia[i].equals(NombreMate))
            {
            s = (s + definitiva[i]/numero);
            
            }
        } JOptionPane.showMessageDialog(null, "El promedio de la materia " + NombreMate + " es " + s);
        }
        else if (opcion ==2)
        {
          NombreEst = JOptionPane.showInputDialog(null, "Digite el nombre del estudiante");           
          for(int i=0; i<numero; i++)
          {
             if(nombre[i].equals(NombreEst))
             {
             s = (s+nota1[i]+nota2[i]+nota3[i])/3;
             JOptionPane.showMessageDialog(null, "El promedio del estudiante " + NombreEst + " es " + s);
             }
          }   
        }
    }
    
  public void EstMaterias()
    {   
        NombreMate = JOptionPane.showInputDialog(null, "Digite el nombre de la asignatura");
        for(int i=0; i<numero; i++)
        {
            if(materia[i].equals(NombreMate)) 
            {
             JOptionPane.showMessageDialog(null, "Codigo: " + codigo[i] + "\n" + "Nombre: "+ nombre[i]+ "\n"  + "Definitiva: " + definitiva[i] + "\n");
            }
        } 
    }
  
   public void EstNotas()
    {   
        NombreEst = JOptionPane.showInputDialog(null, "Digite el nombre del Estudiante");
        for(int i=0; i<numero; i++)
        {
            if(nombre[i].equals(NombreEst))
            {
             JOptionPane.showMessageDialog(null, "Materia" + materia[i] + "\n" + "Definitiva" + definitiva[i] + "\n");
            }               
        } 
    }
   public void EstHabilitan()
    {
        for(int i=0; i<numero; i++)
        {
            if(definitiva[i]>=0 && definitiva[i]<=2.94)
            {
                JOptionPane.showMessageDialog(null, "Los estudiantes que hablitan son: " + "\n" + "Codigo: " + codigo[i] + "\n" + "Nombre: " + nombre[i] + "\n" + "Materia: "+ materia[i] + "\n" + "Definitiva: " + definitiva[i] + "\n");
            }
        }
    }
}

