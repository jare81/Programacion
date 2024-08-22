import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Dubon_Jareny_BiArray {
    public static void main(String[] args) {
      
       Scanner entrada = new Scanner(System.in);
       
       Random  random = new Random();
        System.out.println("Ingrese la cantidad de filas y columnas del arreglo");
        int cantidad;
        while (true) {
                 try {
                   cantidad = entrada.nextInt();            
                    while(cantidad<0){
                        System.out.print("Ingrese numero positivo: ");
                        cantidad = entrada.nextInt(); }
                     break;
                     } catch (InputMismatchException e) {
                         System.out.print("Error de Formato: Ingrese un numero entero: ");
                         entrada.next(); }
                }        
        
        
       
        System.out.println("");
        
        int numeros[][] = new int [cantidad][cantidad];
        
        int aumenta=0;
        int disminuye=(cantidad-1);
        int sumaPrincipal=0;
        int sumaSecundaria=0;
        String Principal="";
        String Secundaria="";
        
        for (int filas = 0; filas <numeros.length ; filas++) {
            
            
            for (int columnas = 0; columnas < numeros.length; columnas++) {
                int numeroRan = random.nextInt(100-10) + 10;
                
                 numeros[filas][columnas]=numeroRan;   
                 System.out.print(numeros[filas][columnas] + " ");
                 
                 
                }
            sumaPrincipal = sumaPrincipal + numeros[filas][aumenta] ;
            Principal = Principal  + numeros[filas][aumenta] + " + ";
            
            sumaSecundaria= sumaSecundaria+ numeros[filas][(disminuye)];
            Secundaria= Secundaria + numeros[filas][(disminuye)] + " + ";
            aumenta++;
            disminuye--;
            System.out.println("");
            
            
            }
        
        if (Principal.endsWith(" + ")) {
            Principal = Principal.substring(0, Principal.length() - 3);
        }
        if (Secundaria.endsWith(" + ")) {
            Secundaria = Secundaria.substring(0, Secundaria.length() - 3);
        }
        
          System.out.println("\nSuma de la Diagonal Principal :  " + Principal + " = " +sumaPrincipal ); 
          
          System.out.println("Suma de la Diagonal Secundaria: " + Secundaria + " = " +  sumaSecundaria);
            
        }
        
        
        
        
        
        
    
    
}
