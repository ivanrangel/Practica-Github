/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;
    public class Libro extends Obra {
        private String Editorial;
        private int nPaginas;
   // private int Index;
    
  
    
     public void Libro ( String edit,int pag,String titulo,int ano,Artista p ){
        super.Obra   ( titulo,ano, p );  
        setEditorial ( edit );
        setnPaginas  ( pag );  
      //setIndex(indice); 
     
    }
     
     
    public void imprimir(){
          System.out.println ( "Titulo:       " + super.getTitulo() ) ;
          System.out.println ( "Autor :       " + super.getAutorNombre() ) ;
          System.out.println ( "Año Nacimiento Autor : " + super.getanoNacimiento() ) ;
          System.out.println ( "Año Edicion : " + super.getanoEdicion() );
          System.out.println ( "Editorial:    "+getEditorial() );
          System.out.println ( "Nª Paginas:   "+getnPaginas() );
           
          
         
         
     } 
            
    public void setEditorial(String edit){ Editorial=edit;}
    public void setnPaginas(int pag){nPaginas=pag;}
    //public void setIndex(int i){ Index=i; }
    
    
    public String getEditorial(){ return Editorial; }
    public int getnPaginas(){return nPaginas;}
    //public int getIndex(){ return Index; }
    
    
    
    
    
}
/**
 *
 * @author Administrador
 */

