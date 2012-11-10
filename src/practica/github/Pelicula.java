/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;

/**
 *
 * @author Administrador
 */
public class Pelicula extends Obra {
    private String Productora;
    private Artista Interprete;
     
     
      public void Pelicula (String produc,Artista inter,String titulo,int ano,Artista p){
      super.Obra(titulo,ano, p);  
      setProductora(produc);
      setInterprete (inter);  
      //setIndex(indice); 
     
    }
      
       public void imprimir(){
         System.out.println("Titulo: "+super.getTitulo()) ;
          System.out.println("Autor: "+super.getAutorNombre() ) ;
          System.out.println("Año de Nacimiento autor "+super.getañoNacimiento()) ;
          System.out.println("Año Edicion "+super.getañoEdicion() );
          System.out.println("Interprete: "+getnomInterprete() );
          System.out.println("Año e nac del interprete: "+getañoNacInterprete() );
           
          
         
         
    } 
     
      public void setProductora(String produc){ Productora=produc;}
      public void setInterprete (Artista inter){Interprete =inter; }
    
    
    
    public String getProductora(){ return Productora; }
    public String getnomInterprete(){return Interprete.getNombre();}
    public int getañoNacInterprete(){return Interprete.getanoNacimiento();}
}
