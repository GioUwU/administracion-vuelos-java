
package Proyecto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author giogg
 */
public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4;
    static Areopuerto areopuertos[] = new Areopuerto[num];
    
    public static void main(String[] args) {
      insertarDatosAeropuerto(areopuertos);
      menu();
        
    }
    
    public static void insertarDatosAeropuerto(Areopuerto aero[]) {
        
       aero[0] = new AeropuertoPublico(400,"william","merida","mexico");
       aero[0].insertarCompania(new Compania("aeroGio"));
       aero[0].insertarCompania(new Compania("aeroSalim"));
       aero[0].getCompania("aeroGio").insertarVuelo(new Vuelo("1","Lima","Mexico", 140,150));
       aero[0].getCompania("aeroGio").insertarVuelo(new Vuelo("2","Lima","Buenos aires", 180,50));
       aero[0].getCompania("aeroSalim").insertarVuelo(new Vuelo("2","Lima","Luna", 4000,30));
       aero[0].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("william", "489320","mexicano"));
       aero[0].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("salim", "489320","peruano"));
       aero[0].getCompania("aeroSalim").getVuelo("2").insertarPasajero(new Pasajero("Adrina", "489320","mexicano"));
       
       aero[1] = new AeropuertoPublico(400,"william","merida","mexico");
       aero[1].insertarCompania(new Compania("aeroGio"));
       aero[1].insertarCompania(new Compania("aeroSalim"));
       aero[1].getCompania("aeroGio").insertarVuelo(new Vuelo("1","Lima","Mexico", 140,150));
       aero[1].getCompania("aeroGio").insertarVuelo(new Vuelo("2","Lima","Buenos aires", 180,50));
       aero[1].getCompania("aeroSalim").insertarVuelo(new Vuelo("2","Lima","Luna", 4000,30));
       aero[1].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("william", "489320","mexicano"));
       aero[1].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("salim", "489320","peruano"));
       aero[1].getCompania("aeroSalim").getVuelo("2").insertarPasajero(new Pasajero("Adrina", "489320","mexicano"));
       
       aero[2] = new AeropuertoPublico(400,"william","merida","mexico");
       aero[2].insertarCompania(new Compania("aeroGio"));
       aero[2].insertarCompania(new Compania("aeroSalim"));
       aero[2].getCompania("aeroGio").insertarVuelo(new Vuelo("1","Lima","Mexico", 140,150));
       aero[2].getCompania("aeroGio").insertarVuelo(new Vuelo("2","Lima","Buenos aires", 180,50));
       aero[2].getCompania("aeroSalim").insertarVuelo(new Vuelo("2","Lima","Luna", 4000,30));
       aero[2].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("william", "489320","mexicano"));
       aero[2].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("salim", "489320","peruano"));
       aero[2].getCompania("aeroSalim").getVuelo("2").insertarPasajero(new Pasajero("Adrina", "489320","mexicano"));
       
       aero[3] = new AreopuertoPrivado("william","merida","mexico");
       aero[3].insertarCompania(new Compania("aeroGio"));
       aero[3].insertarCompania(new Compania("aeroSalim"));
       aero[3].getCompania("aeroGio").insertarVuelo(new Vuelo("1","Lima","Mexico", 140,150));
       aero[3].getCompania("aeroGio").insertarVuelo(new Vuelo("2","Lima","Buenos aires", 180,50));
       aero[3].getCompania("aeroSalim").insertarVuelo(new Vuelo("2","Lima","Luna", 4000,30));
       aero[3].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("william", "489320","mexicano"));
       aero[3].getCompania("aeroGio").getVuelo("1").insertarPasajero(new Pasajero("salim", "489320","peruano"));
       aero[3].getCompania("aeroSalim").getVuelo("2").insertarPasajero(new Pasajero("Adrina", "489320","mexicano"));
       
      
    }
    
    
    public static void menu() {
     String nombreAeropuerto;
     String nombreCompania;
     String origen, destino;
     int opcion;
     Areopuerto aeropuerto;
     Compania compania;
     
     
     do{
     
         System.out.println("\t. :MENU:.");
         System.out.println("1. Ver aeropuertos gestionados(publicos o privados)");
         System.out.println("2. Ver empresas(Privado) o subvencion(Publico)");
         System.out.println("3. Listas companias de un aeropuerto");
         System.out.println("4. Lista de vuelos por compania");
         System.out.println("5. Listar posibles vuelos de origen a destino");
         System.out.println("6. Salir");
         System.out.print("Opcion: ");
         
         opcion = entrada.nextInt();
         
         
         switch(opcion) {
             case 1:
                 System.out.println("");
                 mostrarDatosAeropuertos(areopuertos);
                 break;
             case 2:
                 System.out.println("");
                 mostrarPatrocinio(areopuertos);
                 break;
             case 3: 
                 entrada.nextLine();
                 System.out.println("Digita el nombre del aereopuerto: ");
                 nombreAeropuerto = entrada.nextLine();
                 aeropuerto = buscarAereopuerto(nombreAeropuerto, areopuertos);
                 if(aeropuerto == null) {
                     System.out.println("El aeropuerto no existe");
                 } 
                 else {
                     mostrarCompanias(aeropuerto);
                 }
                 break;
             case 4: 
                 entrada.nextLine();
                 System.out.println("Digita el nombre del aereopuerto: ");
                 nombreAeropuerto = entrada.nextLine();
                 aeropuerto = buscarAereopuerto(nombreAeropuerto, areopuertos);
                  if(aeropuerto == null) {
                     System.out.println("El aeropuerto no existe");
                 } 
                 else {
                      System.out.println("Digite el nombre de la compania ");
                      nombreCompania = entrada.nextLine();
                      compania = aeropuerto.getCompania(nombreCompania);
                      mostrarVuelos(compania);
                 }
                 break;
             case 5: 
                  entrada.nextLine();
                  System.out.println("Digite Ciudad origen: ");
                  origen = entrada.nextLine();
                  System.out.println("Digite Ciudad destino: "); 
                  destino = entrada.nextLine();
                  mostrarVueloOrigenDestino(origen, destino,areopuertos);
                  
                  
                   break;
             case 6:
                   break;
             default: 
                 System.out.println("error");
                 break;
         }
         
     }while(opcion != 6);
    }
    
    
    public static void mostrarDatosAeropuertos(Areopuerto areopuertos[]) {
        for(int i=0; i<areopuertos.length; i++ ) {
        if(areopuertos[i] instanceof AreopuertoPrivado) {
            System.out.println("Areopuerto Privado");
            System.out.println("Nombre: " +areopuertos[i].getNombre() );
            System.out.println("Ciudad: " +areopuertos[i].getCiudad() );
            System.out.println("Pais: " +areopuertos[i].getPais() );
        }
        else {
            System.out.println("Areopuerto Publico");
            System.out.println("Nombre: " +areopuertos[i].getNombre() );
            System.out.println("Ciudad: " +areopuertos[i].getCiudad() );
            System.out.println("Pais: " +areopuertos[i].getPais() );
        
        }
            System.out.println("");
        }
    }

    public static void mostrarPatrocinio(Areopuerto areopuertos[]) {
        String empresas[];
    for(int i=0; i<areopuertos.length; i++ ) {
        if(areopuertos[i] instanceof AreopuertoPrivado) {
          System.out.println("Areopuerto Privado: "+areopuertos[i].getNombre());
          empresas = ((AreopuertoPrivado)areopuertos[i]).getListaEmpresas();
          
            System.out.println("Empresas: ");
          for(int j=0; j<empresas.length; j++) {
              System.out.println(empresas[j]);
          }
           
        }
        else {
            System.out.println("Areopuerto Publico: " + areopuertos[i].getNombre());
            System.out.println("Subvencion: " + ((AeropuertoPublico)areopuertos[i]).getSubvencion());
        
        }
            System.out.println("");
        }
    }
    
    
    public static Areopuerto buscarAereopuerto(String nombre,Areopuerto areopuertos[]){
    int i = 0;
    boolean encontrado = false;
    Areopuerto aero = null;
    
    while((!encontrado) && (i<areopuertos.length )) {
    
        if(nombre.equals(areopuertos[i].getNombre())) {
         encontrado = true;
         aero = areopuertos[i];
         
        }
        i++;
    }
    return aero;
    }
    
    public static void mostrarCompanias(Areopuerto areopuerto) {
        System.out.println("las companias del aeropuerto " + areopuerto.getNombre());
        for(int i=0; i<areopuerto.getNumCompania(); i++) {
        System.out.println(areopuerto.getCompania(i).getNombre());
    }
    }
    
    public static void mostrarVuelos(Compania compania){
     Vuelo vuelo;
        System.out.println(" \nLos vuelos de la compania " + compania.getNombre());
     for(int i=0; i<compania.getNumVuelo();i++) {
        vuelo = compania.getVuelo(i);
         System.out.println("Identificador " + vuelo.getIdentificador());
         System.out.println("Ciudad origen " + vuelo.getCiudadOrigen());
         System.out.println("Ciudad destino " + vuelo.getCiudadDestino());
         System.out.println("Precio " + vuelo.getPrecio());
         System.out.println("");
    }
    }
    
    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Areopuerto areopuertos[]) {
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelos[];
        for(int i =0; i< areopuertos.length; i++){
        for(int j=0; j<areopuertos[i].getNumCompania();j++) {
            for(int k=0; k<areopuertos[i].getCompania(j).getNumVuelo();k++) {
               vuelo = areopuertos[i].getCompania(j).getVuelo(k);
                if((origen.equals(vuelo.getCiudadOrigen())) && (origen.equals(vuelo.getCiudadDestino()))) {
                 contador++;
                }
            }
        }
            
      }
       listaVuelos = new Vuelo[contador];
       int q=0;
       
       for(int i =0; i< areopuertos.length; i++){
        for(int j=0; j<areopuertos[i].getNumCompania();j++) {
            for(int k=0; k<areopuertos[i].getCompania(j).getNumVuelo();k++) {
               vuelo = areopuertos[i].getCompania(j).getVuelo(k);
                if((origen.equals(vuelo.getCiudadOrigen())) && (origen.equals(vuelo.getCiudadDestino()))) {
                 listaVuelos[q] = vuelo;
                 q++;
                }
                
            }
        }
            
      }
       return listaVuelos;
    }
    
    public static void mostrarVueloOrigenDestino(String origen, String destino, Areopuerto areopuertos[]) {
      Vuelo vuelos[];
      vuelos = buscarVuelosOrigenDestino(origen, destino, areopuertos);
      if(vuelos.length == 0) {
          System.out.println("no existen vuelos");
      }
      else {
          System.out.println("\nVuelos encontrados ");
          for(int i =0; i< vuelos.length; i++){
              System.out.println("Identificador " + vuelos[i].getIdentificador());
              System.out.println("Origen " + vuelos[i].getCiudadOrigen());
              System.out.println("Destino " + vuelos[i].getCiudadDestino());
              System.out.println("precio " + vuelos[i].getPrecio());
              System.out.println("");
      }
      }
    }
}   

