/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoppt;

//Clases Random y Scanner importadas
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WILDER
 */
public class Juego {
    
    // Creo las variables que voy a utilizar
    String ganador;
    String jugada;
    String empate;
    String jugadaP;
    String jugadaC;
    
    int jugadaPersona;
    int jugadaCompu;
    int ronda=1;
    int aciertosP=0;
    int aciertosC=0;
    int aciertos=0;
    
     
    //invoco la clase Scanner para los datos solicitados al cliente
    Scanner sc = new Scanner(System.in);
    
    
    
    
   
    //Creo el metodo Jugar
    public void jugar(){
        
        // Imprimo el formato del juego
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("\t\t   PIEDRA, PAPEL O TIJERA");
        System.out.println("");
        System.out.println("");
        
        //Invoco y creo un objeto de la clase Persona
        Persona p = new Persona();
        //A traves del objeto p creado invoco los metodos de la clase Persona para solicitar y mostrar datos
        p.solicitarDatosPerson();
        p.mostrarDatosPersona();
        
        // Creo un ciclo para las rondas
        while(ronda  <= 3) {
        
            System.out.println("\t\t\t (RONDA "  + ronda + ")" );
            System.out.println("");
            System.out.println("Seleccione su jugada escribiendo un numero-->");
            System.out.println("");
            System.out.println("0: Piedra");
            System.out.println("");
            System.out.println("1: Papel");
            System.out.println("");
            System.out.println("2: Tijera");
            System.out.println("");
            
            //Finalizo el ciclo
            ronda ++;
            
            //Invoco los metodos para mostrar lo que ha y dentro de cada uno,no se requiere crear un objeto para instaciarlos pues estos pertenecen a la misma clase para este caso Juego
            generarJuegoComputador();
            imprimirJugadaEnLetras();  
           
            
           
            
            
            
            }
        
            //Invoco el metodo para imprimir lo que este contiene
             buscarEImprimirGanador();
            
    }
        
    
    
            //Creo el metodo para ver las Jugadas en Letras
            public void imprimirJugadaEnLetras(){
            
            //Cpturo el dato de la persona    
            jugadaPersona= sc.nextInt();
            
            //Creo un Switch para la eleccion de la jugada por parte de la persona
            switch(jugadaPersona){
                case 0:
                    jugadaP= "Piedra";
                    break;
                
                case 1:
                    jugadaP="Papel";
                    break;
                
                case 2:
                    jugadaP="Tijera";
                    break;
                    
                    default:
                            
                               }
            
                 //Parte del juego              
                System.out.println("=======");
                //Espacio
                System.out.println("");
                //Conacateno lo que halla elegido la persona como resultado en letras
                System.out.println("Jugada Persona:" + jugadaP);
                //Espacio
                System.out.println("");
                 //Conacateno lo que halla elegido el PC aleatoriamente
                System.out.println("Jugada Computador:" + jugadaC);
                //Espacio
                System.out.println("");
                //Parte del juego
                System.out.println("=======");
            
                //Creo las condiciones para definir quien gana en cada jugada
                if ( jugadaPersona == jugadaCompu){
                    
                    System.out.println("");
                    jugada="EMPATE";
                    System.out.println(jugada);
                    
                }else if(jugadaPersona == 0 && jugadaCompu == 2){
                     
                    ganador="Persona";
                    //Utilizo un contador para llevar el conteo de las veces ganadas
                    aciertosP=aciertos + 1;}
                else if(jugadaPersona == 1 && jugadaCompu == 0){
                     
                    ganador="Persona";
                    aciertosP=aciertos + 1;
                
                }else if (jugadaPersona == 2 && jugadaCompu == 1){
                    
                    ganador="Persona";
                    aciertosP=aciertos + 1;
                
                }else {
                    
                    ganador="Computador";
                    aciertosC ++;
                
                    
                 
                
                }
                
                
                
            
              
            }
        
        
            //Creo el metodo que genera el juego aleatorio del PC
            public void generarJuegoComputador(){
            
            //Invoco la clase Random para el numero aleatorio que va a generar el pc   
            Random r= new Random();
            //Asocio la cantidad de juagadas aleatorias a la variable juagadaCompu
            jugadaCompu=r.nextInt(3);
            
            //Creo el Switch que elegira la variable juagadaCompu aleatorimente
            switch(jugadaCompu){
                case 0:
                    jugadaC= "Piedra";
                    break;
                
                case 1:
                    jugadaC="Papel";
                    break;
                
                case 2:
                    jugadaC="Tijera";
                    break;
                    
                    default:
            
            
            }
            

            }
            
            // Creo el metodo para mostrar el Ganador
            public void buscarEImprimirGanador(){
                
                //creo la condicion para saber el ganador
                   if (aciertosP > aciertosC){
                    ganador="Persona";
                    //En esta variable gusrdo la cantidad de aciertos Persona-Computador
                    aciertos=aciertosP;
                   }else if(aciertosP < aciertosC) {
                    ganador="Computador";
                    aciertos=aciertosC;
                }else{
                       ganador="Empate";
                       aciertos=aciertosC;
                   }
                   //Imprimo el ganador
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("\t-----------------GANADOR------------");   
                    System.out.println(""); 
                    System.out.println("\t\t" + ganador);  
                    System.out.println("");
                    System.out.println("Número de aciertos:" + aciertos);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("*******************************************************");
                
              
                
            
            
            
            }
            
            
            
            
}          
            
            
  
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
            
    
    

