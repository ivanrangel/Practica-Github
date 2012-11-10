/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;

/**
 *
 * @author Administrador
 */
public class Disco extends Obra {
    
    private String discografia;
    private int nCanciones;
    
    
    public void Disco (String disc, int cancion, String titulo , int ano, Artista p)
    {
      super.Obra(titulo,ano, p);  
      setdiscografia(disc);
      setnCanciones(cancion); 
    }    
    
    public void imprimir(){
          System.out.println("Titulo: "+super.getTitulo()) ;
          System.out.println("Autor: "+super.getAutorNombre() ) ;
          System.out.println("Año de Nacimiento autor "+super.getañoNacimiento()) ;
          System.out.println("Año Edicion "+super.getañoEdicion() );
          System.out.println("Discografica: "+getdiscografia() );
          System.out.println("Nª Canciones: "+getnCanciones() );
           
     } 
     
    public void setdiscografia(String disc)
    	{ discografia=disc;}
    public void setnCanciones(int cancion)
	{nCanciones=cancion;}
    public String getdiscografia()
	{ return discografia; }
    public int getnCanciones()
	{return nCanciones;}

}

