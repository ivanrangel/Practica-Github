/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;

/**
 *
 * @author Administrador
 */
public class Disco {
    
    private String discografica;
    private int nCanciones;
    //private String Titulo;
    
    public Disco (String titulo, Artista p,int ano, String discografia, int nCancion)
    {
      //setTitulo(titulo);
      //setAutor(p);
      //setanoEdicion(ano);   
      setDiscografica(discografia);
      setnCanciones(nCancion);
    }    
    
    //public void setTitulo(String titulo) {
    //Titulo = titulo;
    //}
	  
    //public void setAuthor(Artista p) {
    //Autor = p;
    //}

    //public void setYear(int year) {
    // = year;
    //}

    public void setDiscografica(String discografia) {
    this.discografica = discografia;
    }

    public void setnCanciones(int nCancion) {
    this.nCanciones = nCancion;
    }

    public String getDiscografica() {
    return discografica;
    }

    public int getnCanciones() {
    return nCanciones;
    }

    
    
}
