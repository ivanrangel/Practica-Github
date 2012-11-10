/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;

/**
 *
 * @author Administrador
 */
public class Artista 
{ 
    private String Nombre; 
    private int anoNacimiento; 

    public void insertar(String nom,int ano)
    {
      setNombre(nom);
      setanoNacimiento(ano);             
    }

    public void setNombre(String nom)
    { 
      Nombre=nom;    
    }

    public void setanoNacimiento(int ano)
    {
       anoNacimiento=ano;
    }          
    
    public String getNombre()
    { return Nombre; }
    public int getanoNacimiento()
    {return anoNacimiento;}      
}
