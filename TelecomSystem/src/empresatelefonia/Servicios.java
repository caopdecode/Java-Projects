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
public class Servicios 
{
    private String nombre[];
    private String cedula[];

    
    private String Reclamo[];
    private String Reparacion[];
    private String SolicitudSer[];
    private int servicio;
    
    int c1, c2, c3, tope;
    
    Servicios (int n)
    {
        Reclamo = new String [n];
        Reparacion = new String [n];
        SolicitudSer = new String [n];
        tope = n;
        c1 = 0;
        c2 = 0;
        c3 = 0;
    }
    
    public int Agregar(String nom, String ced )
    {
        servicio= Integer.parseInt(JOptionPane.showInputDialog("Digite el tipo de servicio que requiere"));
        
        if (c1==tope || c2==tope || c3==tope ) return 0;
            
            else if (servicio == 1)
            {
                Reclamo[c1] = nom + "\n " + ced;
                c1++;
            }
        
            else if (servicio==2)
            {
               Reparacion[c2] = nom + "\n " + ced;
               c2++;
            }
        
             else if (servicio==3)
            {
               SolicitudSer[c3] = nom + "\n " + ced;
               c3++;
            }
            return 1;
    }
    
    public int Extraer ()
    {
        servicio = Integer.parseInt(JOptionPane.showInputDialog("Digite el tipo de servicio que continua"));
        if (c1==0 || c2==0 || c3==0) return 0;
        else if (servicio==1)
        {
          c1--;
          for (int i = 0; i<c1; i++)
          {
              Reclamo[i] = Reclamo [i+1];  
          } 
          Reclamo[c1] = " ";
        }
        
        else if (servicio==2)
        {
          c2--;
          for (int i = 0; i<c2; i++)
          {
              Reparacion[i] = Reparacion[i+1];  
          } 
          Reparacion[c2] = " ";
        }
        
        else if (servicio==3)
        {
          c3--;
          for (int i = 0; i<c3; i++)
          {
              SolicitudSer[i] = SolicitudSer [i+1];  
          } 
          SolicitudSer[c3] = " ";
        }
      return 1;
    }
                 
          
    
    
    public String Mostrar()
    {
      int i;
      String s = "\n";
      
           
        if (c1>=c2)
        {   s=s+"\nSERVICIO RECLAMOS\n"; 
            for (i=0; i<c1; i++)
            {
                s=s+Reclamo[i]+"\n" + "\n";  
            }
            
                if(c2>=c3)
                {
                s=s+"\nSERVICIO REPARACION\n"; 
                for (i=0; i<c2; i++)
                {
                    s=s+Reparacion[i]+"\n";  
                }
                s=s+"\nSERVICIO SOLICITUD DE SERVICIOS\n"; 
                for (i=0; i<c3; i++)
                {
                    s=s+SolicitudSer[i]+"\n";  
                }
                }
                else
                {
                   s=s+"\nSERVICIO SOLICUD DE SERVICIOS\n"; 
                    for (i=0; i<c3; i++)
                    {
                        s=s+SolicitudSer[i]+"\n";  
                    }
                    s=s+"\nSERVICIO REPARACIONES\n"; 
                    for (i=0; i<c2; i++)
                    {
                        s=s+Reparacion[i]+"\n";  
                    }   
                }
        }
        else if (c2>=c1)
        {   s=s+"\nSERVICIO DE REPARACIONES\n"; 
            for (i=0; i<c2; i++)
            {
                s=s+Reparacion[i]+"\n";  
            }
                if (c1>=c3)
                {
                s=s+"\nSERVICIO DE RECLAMOS\n"; 
                for (i=0; i<c1; i++)
                {
                    s=s+Reclamo[i]+"\n";  
                }
                s=s+"\nSERVICIO SOLICITUD DE SERVICIOS\n"; 
                for (i=0; i<c3; i++)
                {
                    s=s+SolicitudSer[i]+"\n";  
                }
                }
                else
                {
                 s=s+"\nSERVICIO DE SOLICITUD DE SERVICIOS\n"; 
                for (i=0; i<c3; i++)
                {
                    s=s+SolicitudSer[i]+"\n";  
                }
                s=s+"\nSERVICIO DE RECLAMOS\n"; 
                for (i=0; i<c1; i++)
                {
                    s=s+Reclamo[i]+"\n";  
                }
                }
        }
           else if (c3>=c1)
        {   s=s+"\nSERVICIO DE SOLICITUD DE SERVICIOS\n"; 
            for (i=0; i<c3; i++)
            {
                s=s+ SolicitudSer[i]+"\n";  
            }
                if (c1>c2)
                {
                s=s+"\nSERVICIO DE RECLAMOS\n"; 
                for (i=0; i<c1; i++)
                {
                    s=s+Reclamo[i]+"\n";  
                }
                s=s+"\nSERVICIO DE REPARACIONES\n"; 
                for (i=0; i<c2; i++)
                {
                    s=s+Reparacion[i]+"\n";  
                }
                }
                else
                {
                 s=s+"\nSERVICIO DE REPARACIONES\n"; 
                for (i=0; i<c2; i++)
                {
                    s=s+Reparacion[i]+"\n";  
                }
                s=s+"\nSERVICIO DE RECLAMOS\n"; 
                for (i=0; i<c1; i++)
                {
                    s=s+Reclamo[i]+"\n";  
                }
                }
        }    
      return s;
    }
}
