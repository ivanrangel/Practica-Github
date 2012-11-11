/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;

/**
 *
 * @author Administrador
 */
public class Obra 
{
    private String Titulo;
    private Artista Autor;
    private int anoEdicion;    
    
    public void Obra(String titulo,int ano,Artista p ){
      setTitulo(titulo);
      setanoEdicion(ano);   
      setAutor(p);      
    }
               
    public void setTitulo(String titulo)
    {
        Titulo = titulo;
    }
    
    public void setanoEdicion(int ano)
    {
        anoEdicion = ano;
    }
    
    public void setAutor (Artista p)
    {
        Autor = p;
    }       
   
    public String getTitulo()
    {
        return Titulo;
    }
    
    public int getanoEdicion()
    {
        return anoEdicion;
    }        

    public String getAutorNombre()
    {
        return Autor.getNombre() ;
    }  
    public int getanoNacimiento()
    {
        return Autor.getanoNacimiento();
    }              
}
