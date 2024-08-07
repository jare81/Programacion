
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Dubon_Jareny_TC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String opcion_menu;
    
       
        do { System.out.println("");
            System.out.println(" ");
            System.out.println("           MENU           ");
            System.out.println("----------------------------");
            System.out.println("1. Area 8 triangulos");
            System.out.println("2. Minimo comun multiplo y maximo comun divisor");
            System.out.println("3. Numero perfecto"); 
            System.out.println("4. Salir");
            
            
            entrada.useDelimiter("\n");
            System.out.println("Que desea hacer? (ingrese un numero)");
            opcion_menu = entrada.next();
            
            while (!opcion_menu.equals("1")
                   && !opcion_menu.equals("2")
                   && !opcion_menu.equals("3")
                   && !opcion_menu.equals("4"))
            {  
                System.out.println(" ");
                System.out.println("La opcion registrada no es valida. Intente de nuevo (ingrese un numero)");
                opcion_menu = entrada.next();
            }
            
            switch(opcion_menu) {
                
                case "1": 
                    System.out.println(" AREA 8 TRIANGULOS");
                    int base, altura;
                    
                    double area, area_mayor=0; String areas="";
                    
                    
                    int contador=1;
                    while(contador<=8){
                        
                        System.out.println(" \n--> Triangulo # " + contador );
                     
                        while (true) {
                        System.out.print("Base: ");
                            try {
                                base = entrada.nextInt();
                                
                                while(base<=0){
                                System.out.println("No puede ingresar una bases negativas o 0");
                                 }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Por favor ingrese un numero entero.");
                                entrada.next(); 
                            }
                        }
                        
                         while (true) {
                        System.out.print("Altura: ");
                            try {
                                altura = entrada.nextInt();
                                
                                while(altura<=0){
                                System.out.println("No puede ingresar una altura negativas o 0");
                                 }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Por favor ingrese un numero entero.");
                                entrada.next(); 
                            }
                        }
                        
                        
                       
                        
                        area = (base*altura)/2;
                        
                        if(area>area_mayor) {
                            area_mayor=area;
                        }
                        
                        areas = areas + "Area triangulo #" + contador + ": " + area + "\n" ;
                        
                        contador++;
                   
                    }
                    
                    System.out.println("\nResultados: \n" + areas);
                    System.out.println("El area mayor encontrada es: " + area_mayor);
                    
                    
                    
                    
                    break;
                    
                case "2":
                    int entero1, entero2;
                    
                    System.out.println(" MCM Y MCD");
                    
                     while (true) {
                        System.out.print("\nIngrese el primer numero entero: ");
                            try {
                                entero1 = entrada.nextInt();
                                
                                while(entero1<=0){
                                System.out.println("No ingrese numeros negativos o 0");
                                 }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error. Ingrese un numero entero");
                                entrada.next(); 
                            }
                        }
                    
                    while (true) {
                        System.out.print("\nIngrese el segundo numero entero: ");
                            try {
                                entero2 = entrada.nextInt();
                                
                                while(entero2<=0){
                                System.out.println("No ingrese numeros negativos o 0");
                                 }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error. Ingrese un numero entero");
                                entrada.next(); 
                            }
                        }
                    
                    int original1= entero1;
                    int original2=entero2;
                    
                    while(entero2!=0){
                        int auxiliar = entero2;
                        entero2 = entero1 % entero2;
                        
                        entero1= auxiliar;
                        
                    }
                    
                    int mcd= entero1;
                    
                    int mcm= Math.abs(original1*original2)/mcd;
                    
                    
                    System.out.println("El minimo comun multiplo de los numeros ingresados es: " + mcm);
                    
                    break;
                    
                case "3":
                    int perfecto;
                    System.out.println("NUMERO PERFECTO");
                    System.out.println("Ingrese un numero: ");
                    perfecto = entrada.nextInt();
                    
                    while(perfecto<=0){
                        System.out.println("No se pueden ingresar numeros negativos o iguales a 0");
                        perfecto = entrada.nextInt();
                    }
                    
                   
                    
                    
                    break;
                    
                default:
                        
             
                    
                    
                  
                
                
                
                
                
                
                
                
            }
            
            
            
            
            
            
           
           
           
           
           
        }while(!opcion_menu.equalsIgnoreCase("D"));
        
        
        
    }
    
    
}
