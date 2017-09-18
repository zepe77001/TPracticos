/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoppt;

import java.util.Scanner;

/**
 *
 * @author WILDER
 */



public class Persona {
   
    //Variables que utilizare en este metodo
    String alias, correo;
    
    // Creo el metodo para solicitar los datos dentro de la clase Persona
    public void solicitarDatosPerson(){
        
    //Invoco la clase Scanner para capturar los datos solicitados la user
    Scanner sc=new Scanner(System.in);
    
    //Capturo en la variable alias el dato ingresado por el user
    System.out.println("Escriba un alias");
        System.out.println("");
          alias=sc.nextLine();
        
        
      System.out.println("");  
    //Capturo en la variable correo el dato ingresado por el user
    System.out.println("Escriba un correo");
    System.out.println("");
    correo=sc.nextLine();
    
    }
    
    
    //Creo el metodo para mostrar los datos dentro de la clase Persona
    public void mostrarDatosPersona(){
        
        System.out.println("");
        System.out.println("");
        System.out.println("\t COMIENZA EL JUEGO!");
        System.out.println("");
        System.out.println("");
        
        
        //Imprimo la palabra JUGADOR
        System.out.println("JUGADOR");
        System.out.println("");
        
        //Imprimo lo que esten dentro de las variables 
        System.out.println( alias +" " +("-")+ " " +correo);
        System.out.println("");
        System.out.println("");
    
    }
    
    
}
