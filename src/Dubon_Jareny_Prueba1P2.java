

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Dubon_Jareny_Prueba1P2 {
    public static void main(String[] args) {
        Random  random = new Random();
        Scanner entrada = new Scanner (System.in);
        
        String palabras[ ] = { "radar", "level", "world", "civic", "java", "deified", "python", 
            "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", 
            "racecar", "kayak", "apple", "deed" };
        
        for(int index=0; index<palabras.length; index++){
            String mostrar = palabras[index];
            System.out.println("[" + index + "]: " +mostrar );
        }
        
        
        System.out.println("\nIngrese ingrese el tamano del arreglo");
        int tamano = entrada.nextInt();
        
        
        String arregloA[] = new String[tamano];
        String arregloB[] = new String [tamano];
        
        
        System.out.println("\nARREGLO A: ");
        
        for(int index=0; index<arregloA.length; index++){
        int indexpalabra = random.nextInt(10)+ 10 ;
        
        String evaluarpalabra= palabras[indexpalabra];
        
       String alreves=""; 
        
        for(int i=evaluarpalabra.length()-1; i>=0; i--)    
            {
                alreves=alreves+evaluarpalabra.charAt(i);
            }
        
        if(evaluarpalabra.equalsIgnoreCase(alreves))
           {
               arregloA[index]=evaluarpalabra;
                System.out.println("[" + index + "]: " + evaluarpalabra );   
           }
        else{
                index--;
            }
           
        }
        
       
        //ARREGLO B
        System.out.println("\nARREGLO B: ");
        
       
     
        for(int index=0; index<arregloB.length; index++){
        int indexpalabra = random.nextInt(10)+ 10 ;
        
       String evaluarpalabra= palabras[indexpalabra];
        
       String alreves=""; 
        
        for(int i=evaluarpalabra.length()-1; i>=0; i--)    
            {
                alreves=alreves+evaluarpalabra.charAt(i);
            }
        
        if(evaluarpalabra.equalsIgnoreCase(alreves) && arregloB[index]==null )
            {
                arregloB[index]=evaluarpalabra;
                System.out.println("[" + index + "]: " + evaluarpalabra );   
            }
        else{
                index--;
            }
           
        }
        
        
        
        //Palabras del arreglo A que no estan el arreglo B
                int suma = 0;

               for (int index = 0; index < arregloA.length; index++) {
                   String contiene = arregloA[index];
                   boolean encontrado = false;
                   
                   for (int indexB = 0; indexB < arregloB.length; indexB++) {
                       if (contiene.equals(arregloB[indexB])) {
                           encontrado = true;
                           break;
                       }
                   }
                   if (!encontrado) {
                       suma++;
                   }
               }

               
               System.out.println("\nPalabras del Arreglo A no estan en el Arreglo B son:");
               String noEstan[] = new String[suma];
               
               if(suma==0){
                   System.out.println("No hay palabras diferentes en el arreglo A ");
               }else{
               
               int indiceNoEstan = 0;
               
               for (int index = 0; index < arregloA.length; index++) {
                   String contiene = arregloA[index];
                   boolean encontrado = false;
                   
                   for (int indexB = 0; indexB < arregloB.length; indexB++) {
                       if (contiene.equals(arregloB[indexB])) {
                           encontrado = true;
                           break;
                       }
                   }
                   if (!encontrado) {
                       noEstan[indiceNoEstan] = contiene;
                       System.out.println("[" + indiceNoEstan + "]: " + contiene);
                       indiceNoEstan++;
                   }
               }
    
        
            
        }
        
    }
     
    

}