/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.github;
import java.io.*;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class PracticaGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int i=0,numart,conta,año,opcion,lib,dis,pos,cancion,p=0;
        String Nom;
        lib=0;
        numart=0;
        opcion=0;
        dis=0;
        p=0;
        Scanner leer= new Scanner(System.in);
        Artista[] Artistas=new Artista[1000];
        Libro[] Libros=new Libro[1000];
        Disco[] Discos=new Disco[1000];
        Pelicula[] Peliculas=new Pelicula[1000];
       
        ////******
        while (opcion != 9)
        {
        
         
      
        do{
        System.out.println("------------------------------------------------------");
        System.out.println("***********       MENU PRINCIPAL   ******************");
        System.out.println("------------------------------------------------------");
        System.out.println("          1. Agregar Artistas                           ");
        System.out.println("          2. Agregar Libros                             ");
        System.out.println("          3. Buscar Libro (Ir a Sub Menu )             ");
        System.out.println("          4. Agregar Discos                             ");
        System.out.println("          5. Buscar Discos (Ir a Sub Menu )           ");
        System.out.println("          6. Agregar Peliculas                        ");
        System.out.println("          7. Buscar Peliculas                        ");
        System.out.println("          8. Reportes                                 ");
        System.out.println("          9. Salir                                    ");
        System.out.println("   Seleccione Opcion                                  ");
        opcion = leer.nextInt();
        }while(opcion < 1 || opcion > 9);
         //hacemos un salto de línea  
         System.out.println("\n");
//según la opción seleccionada le mostramos un resultado
 
switch(opcion)
{
case 1:


      
        /////*******
         System.out.println("Ingrese el número de Artistas: ");
         numart=leer.nextInt();
                 
         
         
          for ( conta=0;conta < numart; conta++ )
          {
        
           System.out.println("Ingrese El Nombre del Artísta ");
           Nom=leer.nextLine();
           Nom=leer.nextLine();
           System.out.println("Ingrese El Año de Nacimiento: ");
           año=leer.nextInt();
         
           Artistas[conta]= new Artista( );
           Artistas[conta].setNombre(Nom);
           Artistas[conta].setanoNacimiento(año);
         
           
                      
          }
 break;   
 case 2:
          //
          if (numart>0)
          {
            System.out.print(numart);
            String Edit,Tit  ;
            int pag,id,anoedic=0;
            
            System.out.println("Ingrese el número de Libros: ");
            lib=leer.nextInt();
            
                     
           
      for ( conta=0;conta < lib; conta++ )
      {
                 System.out.println("Artistas Registrados ");
                 System.out.println("*********************** ");
                // Artista1.Listar();                        
               System.out.println("ID  -  Nombre del Artista  -  Fecha Nacimiento ");
               System.out.println("------------------------------------------------------------------------------"); 
          int conta1;
          for ( conta1 = 0; conta1 < numart ; conta1++)
         {
              
               System.out.println(conta1+"              "+Artistas[conta1].getNombre()+"      "+Artistas[conta1].getañoNacimiento());
               
               System.out.println("-------------------------------------------");
              
         }
                System.out.println("Ingrese el ID del Actor para el Libro ");
                 id=leer.nextInt();    
                 //id=leer.nextInt();
                 
                 System.out.println("Ingrese el Editorial del Libro ");
                 Edit=leer.nextLine();
                 Edit=leer.nextLine();
                 System.out.println("Ingrese el numero de páginas ");
                 pag=leer.nextInt();
                 System.out.println("Ingrese el Titulo de la Obra ");
                 Tit=leer.nextLine();
                 Tit=leer.nextLine();
                 System.out.println("Ingrese el Año de Edicion ");
                 anoedic=leer.nextInt();
                  
                  Libros[conta]= new Libro();
                  Libros[conta].setEditorial(Edit);
                  Libros[conta].setnPaginas(pag);
                  Libros[conta].setTitulo(Tit);
                  Libros[conta].setanoEdicion(anoedic);
                  Libros[conta].setAutor(Artistas[id]);            
                 
                   
                   
                                
          }
       } 
 break;   
 case 3:  
     //busqueda de libro
     int opcion1=0;
     String nomaut,titu,edito;
     do{
        System.out.println("\n"); 
        System.out.println("------------------------------------------------------");
        System.out.println("***********     Busqueda de Libros  ******************");
        System.out.println("------------------------------------------------------");
        System.out.println("          1. Por Autor                                ");
        System.out.println("          2. Por Título                               ");
        System.out.println("          3. Por Edirorial                            ");
        System.out.println("          4. Volver a Principal                       ");
        System.out.println("   Seleccione Opcion                                  ");
        System.out.println("\n");
        opcion1 = leer.nextInt();
        }while( opcion1 < 1 || opcion1 > 4);
     
     switch(opcion1){
         case 1:
              System.out.println("Ingrese el nombre del autor: ");
              nomaut = leer.nextLine();
              nomaut = leer.nextLine();
          int conta3;
        for ( conta3 = 0; conta3 < lib ; conta3++)
         {
           if (Libros[conta3].getAutorNombre().equals(nomaut))
               {
               Libros[conta3].imprimir();    
             
               }              
         }
         break;     
         case 2:
             
              System.out.println("Ingrese el título de la obra: ");
              titu = leer.nextLine();
              titu = leer.nextLine();
          int conta4;
            for ( conta4 = 0; conta4 < lib ; conta4++)
         {
           if (Libros[conta4].getTitulo().equals(titu))
               {
               Libros[conta4].imprimir();    
                             
               }              
         }
           break;
         case 3:
              System.out.println("Ingrese el Editorial: ");
              edito = leer.nextLine();
              edito = leer.nextLine();
          int conta5;
            for ( conta5 = 0; conta5 < lib ; conta5++)
         {
           if (Libros[conta5].getEditorial().equals(edito))
               {
               Libros[conta5].imprimir();    
                              
               }              
         }
           break;
     }      
  break;                  
  case 4:
          //
          if (numart>0)
          {
           // System.out.print(numart);
            String Discogra,Tit  ;
            int Cancion,id,anoedic=0;
            
            System.out.println("Ingrese el número de Discos: ");
            dis=leer.nextInt();
            
                      
           
      for ( conta=0;conta < dis; conta++ )
      {
                 System.out.println("Artistas Registrados ");
                 System.out.println("*********************** ");
                // Artista1.Listar();                        
               System.out.println("ID  -  Nombre del Artista  -  Fecha Nacimiento ");
               System.out.println("------------------------------------------------------------------------------"); 
               int conta1;
              for ( conta1 = 0; conta1 < numart ; conta1++)
         {
              
               System.out.println(conta1+"              "+Artistas[conta1].getNombre()+"      "+Artistas[conta1].getañoNacimiento());
               
               System.out.println("-------------------------------------------");
              
         }
                System.out.println("Ingrese el ID del Actor para el Disco ");
                 id=leer.nextInt();    
                 //id=leer.nextInt();
                 
                 System.out.println("Ingrese el nombre de la discografia ");
                Discogra=leer.nextLine();
                Discogra=leer.nextLine();
                 System.out.println("Ingrese el numero de CAnciones ");
                 cancion=leer.nextInt();
                 System.out.println("Ingrese el Titulo de la Obra ");
                 Tit=leer.nextLine();
                 Tit=leer.nextLine();
                 System.out.println("Ingrese el Año de Edicion ");
                 anoedic=leer.nextInt();
                  
                  Discos[conta]= new Disco();
                  Discos[conta].setdiscografia(Discogra);
                  Discos[conta].setnCanciones(cancion);
                  Discos[conta].setTitulo(Tit);
                  Discos[conta].setanoEdicion(anoedic)  ;
                 
                  Discos[conta].setAutor(Artistas[id]);            
                 
                   
                
          }
       } 
 break; 
 case 5:  
     //busqueda de libro
     int opcion4=0;
     String nomAut,tituO,Disc;
     do{
        System.out.println("\n"); 
        System.out.println("------------------------------------------------------");
        System.out.println("***********     Busqueda de Discos  ******************");
        System.out.println("------------------------------------------------------");
        System.out.println("          1. Por Autor                                ");
        System.out.println("          2. Por Título                               ");
        System.out.println("          3. Por Discografica                          ");
        System.out.println("          4. Volver a Principal                       ");
        System.out.println("   Seleccione Opcion                                  ");
        System.out.println("\n");
        opcion4 = leer.nextInt();
        }while( opcion4 < 1 || opcion4 > 4);
     
     switch(opcion4){
         case 1:
              System.out.println("Ingrese el nombre del autor: ");
              nomAut = leer.nextLine();
              nomAut = leer.nextLine();
          int conta3;
        for ( conta3 = 0; conta3 < dis ; conta3++)
         {
           if (Discos[conta3].getAutorNombre().equals(nomAut))
               {
                Discos[conta3].imprimir();      
                            
               }              
         }
         break;     
         case 2:
             
              System.out.println("Ingrese el título : ");
              tituO = leer.nextLine();
              tituO = leer.nextLine();
          int conta4;
            for ( conta4 = 0; conta4 < dis ; conta4++)
         {
           if (Discos[conta4].getTitulo().equals(tituO))
               {
                Discos[conta4].imprimir();     
                      
               }              
         }
           break;
         case 3:
              System.out.println("Ingrese la Discografica: ");
              Disc = leer.nextLine();
              Disc = leer.nextLine();
          int conta5;
            for ( conta5 = 0; conta5 < dis ; conta5++)
         {
           if (Discos[conta5].getdiscografia().equals(Disc))
               {
               Discos[conta5].imprimir();    
                       
               }              
         }
           break;
     }      
  break;                       
  case 6:
          //
          if (numart>0)
          {
           // System.out.print(numart);
            String produc,Tit,nominter  ;
            int ano,id,anoedic=0;
            
            System.out.println("Ingrese el número de Peliculas: ");
            p=leer.nextInt();
            
            Artista interprete= new Artista();
          
           
      for ( conta=0;conta < p; conta++ )
      {
                 System.out.println("Artistas Registrados ");
                 System.out.println("*********************** ");
                // Artista1.Listar();                        
               System.out.println("ID  -  Nombre del Artista  -  Fecha Nacimiento ");
               System.out.println("------------------------------------------------------------------------------"); 
               int conta1;
              for ( conta1 = 0; conta1 < numart ; conta1++)
         {
              
               System.out.println(conta1+"              "+Artistas[conta1].getNombre()+"      "+Artistas[conta1].getañoNacimiento());
               
               System.out.println("-------------------------------------------");
              
         }
                System.out.println("Ingrese el ID del Actor para la pelicula ");
                 id=leer.nextInt();    
                 //id=leer.nextInt();
                 
                 System.out.println("Ingrese el nombre de la productora ");
               produc=leer.nextLine();
                produc=leer.nextLine();
                 System.out.println("Ingrese el nombre del interprete ");
                nominter=leer.nextLine();
                 System.out.println("Ingrese el año de nac. del interprete ");
                 ano=leer.nextInt();
                 System.out.println("Ingrese el Titulo de la Obra ");
                 Tit=leer.nextLine();
                 Tit=leer.nextLine();
                 System.out.println("Ingrese el Año de Edicion ");
                 anoedic=leer.nextInt();
                  
                 interprete.insertar(nominter, ano);
                 
                  Peliculas[conta]= new Pelicula();
                  Peliculas[conta].setProductora(produc) ;
                  Peliculas[conta].setInterprete(interprete);
                  Peliculas[conta].setTitulo(Tit);
                  Peliculas[conta].setanoEdicion(anoedic);
                  Peliculas[conta].setAutor(Artistas[id]); 
                  
                 
                   
                     
          }
       } 
 break;  
 case 7:  
     //busqueda de libro
     int opcion7=0;
     String nominter,nompro;
     do{
        System.out.println("\n"); 
        System.out.println("------------------------------------------------------");
        System.out.println("***********     Busqueda de Peliculas  ***************");
        System.out.println("------------------------------------------------------");
        System.out.println("          1. Por Productora                            ");
        System.out.println("          2. Por Interprete                            ");
        System.out.println("          3. Volver a Principal                       ");
        System.out.println("   Seleccione Opcion                                  ");
        System.out.println("\n");
        opcion7 = leer.nextInt();
        }while( opcion7 < 1 || opcion7 > 3);
     
     switch(opcion7){
         case 1:
              System.out.println("Ingrese el nombre de la productora: ");
              nompro = leer.nextLine();
              nompro = leer.nextLine();
          int conta3;
        for ( conta3 = 0; conta3 <p  ; conta3++)
         {
           if (Peliculas[conta3].getProductora().equals(nompro))
               {
                Peliculas[conta3].imprimir();      
                             
               }              
         }
         break;     
         case 2:
             
              System.out.println("Ingrese el nombre del interprete : ");
              nominter = leer.nextLine();
              nominter= leer.nextLine();
          int conta4;
            for ( conta4 = 0; conta4 < p ; conta4++)
         {
           if (Peliculas[conta4].getnomInterprete().equals(nominter))
               {
                Peliculas[conta4].imprimir();     
                                      
               }              
         }
           break;
        
     }      
  break;                        
    case 8:  
     //busqueda de libro
     int opcion8=0;
     String nomauto;
     do{
        System.out.println("\n"); 
        System.out.println("------------------------------------------------------");
        System.out.println("***********          Listados          ***************");
        System.out.println("------------------------------------------------------");
        System.out.println("          1. Obras                                    ");
        System.out.println("          2. Peliculas                                ");
        System.out.println("          3. Peliculas por Autor                      ");
        System.out.println("          4. Volvar principal                         ");
        System.out.println("   Seleccione Opcion                                  ");
        System.out.println("\n");
        opcion8 = leer.nextInt();
        }while( opcion8 < 1 || opcion8 > 4);
     
     switch(opcion8){
         case 1:
            
          int conta3;
        for ( conta3 = 0; conta3 <lib  ; conta3++)
         {
                Libros[conta3].imprimir();                                                            
         }
         for ( conta3 = 0; conta3 <dis  ; conta3++)
         {
                Discos[conta3].imprimir();                                                   
         }
         break; 
       case 2:
             
        int conta4;
        for ( conta4 = 0; conta4 <p  ; conta4++)
         {
                Peliculas[conta4].imprimir();
                                                            
         }
         break;       
         case 3:
             
              System.out.println("Ingrese el nombre del Autor: ");
              nomauto = leer.nextLine();
              nomauto= leer.nextLine();
          int conta5;
            for ( conta5 = 0; conta5 < p ; conta5++)
         {
           if (Peliculas[conta5].getAutorNombre().equals(nomauto))
               {
                Peliculas[conta5].imprimir();     
                                      
               }              
         }
           break;
        
     }        
      
      
     }




 } 

        }
        
}
    



