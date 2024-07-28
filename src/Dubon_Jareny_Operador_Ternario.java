
import java.util.Scanner;


public class Dubon_Jareny_Operador_Ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        entrada.useDelimiter("\n");
        
        /**
         EL OPERADOR TERNARIO ES UNA ESTRUCTURA CONDICIONAL 
         QUE SIRVE PARA EVALUAR CONDICIONES SIMPLES, DEVUELVE UN VALOR VERDADERO O FALSO
         
          - Declaramos una variable que almacene el resultado
          - Evaluamos la condicion simple
          - Declaramos el valor si es verdadero
          - Declaramos el valor si es falso
          
          Estructura:  ID_Variable = (Condicion) ? Valor_si_Verdadero : Valor_si_Falso
          
          Para deciciones mas complejas es mejor utilizar la estructura if-else.
         
         
         */
        
        
        
        System.out.println(" \n--> VALORES CONSTANTES <-- \n" );
        
        System.out.println("ESTE ES UN JUEGO "
                + "\nEncuentra el numero oculto entre 1-10");
        
        System.out.println("Tienes 3 intentos");     
        int num_ingresado= entrada.nextInt();
        
        int num_random = 5;
        
       int intentos=1; String resultado = "";
       
        while(intentos<3){    
         resultado = num_ingresado == num_random ?  "Felicidades. Lo encontraste" : 
                 (num_ingresado > num_random) ? "El numero es mas bajo " : "El numero es mas alto";
        
            System.out.println(resultado);
            
            if(resultado.equals("Felicidades. Lo encontraste"))
            {break;}
            
            num_ingresado= entrada.nextInt();
            
       intentos++;
       
       if(intentos==3 )
       {System.out.println("El numero era " + num_random);}
        }
        
        
       
         
        
        
        
        
        
        
        
        
   
        System.out.println("\n\n --> CON VARIABLES <--\n");
               
        
        
        System.out.println("ESTA ES UN TIENDA PEQUENA \n");
        System.out.println("Productos que puede comprar"
                + " \n a. Leche L.20  \n b. Yogurt  L.15\n c. Almendras L.30 \n d. Jugo L.25 \n<< F >> para finalizar compra \n");
        
        int total=0, cantidad=0; String producto;
        
        
        
          do {
        System.out.print("Letra de producto:  (f para finalizar) ");
        
            producto = entrada.next();

            // Validación del producto ingresado
            if (!producto.equalsIgnoreCase("a") && !producto.equalsIgnoreCase("b") && !producto.equalsIgnoreCase("c")
                    && !producto.equalsIgnoreCase("d") && !producto.equalsIgnoreCase("f")) {
                System.out.println("!!Codido invalido");
                continue;
            }
            
            if(producto.equalsIgnoreCase("f")){
                break;
            }
            
           System.out.print("Cantidad: ");
           cantidad = entrada.nextInt();
           System.out.println("");
           
              
            
        total+= producto.equalsIgnoreCase("a") ? (cantidad*20) : 0;
        
        total+= producto.equalsIgnoreCase("b") ? (cantidad*15) : 0;
        
        total+= producto.equalsIgnoreCase("c") ? (cantidad*30) : 0;
        
        total+= producto.equalsIgnoreCase("d") ? (cantidad*25) : 0;
        
       
        
        total=+total;
        
        }while(!producto.equalsIgnoreCase("f"));
        
        
        
        double descuento =0, impuesto=total*0.15;
        
        //descuento para compras mayores o iguales a L.50
        descuento += total>=50 ? (total*0.07) : 0;
       
         
         System.out.println("\n*** FACTURA *** ");
         System.out.println("\nSubtotal: L. " + total);
         System.out.println("Descuento: L. " + descuento);
         System.out.println("Impuesto: L. " + impuesto);
         System.out.println("Total a pagar: L. " + (total+impuesto-descuento));
        System.out.println("\n    ******      ");
        
        
        
       
        
      
        
        
        
        
        
        
        
        //OPERADOR TERNARIO CON FORMULAS
                 System.out.println("\n\n--> CON FORMULAS <-- \n");
               
        
        System.out.println("OPERACIONES CON POLIGONOS (lados de 3 a 10)\n");
        System.out.print("Cuantos lados tiene tu poligono regular? ");
        int lados = entrada.nextInt();
        
        while(lados<3 || lados>10){
            System.out.println("Fuera de rango");
            lados = entrada.nextInt();
        }
        
        
        System.out.print("Que medida tiene uno de sus lados?(cm) ");
        double medida_lados = entrada.nextDouble();
        
        String observacion = (lados==3)?  "Triangulo" :
                             (lados==4)?  "Cuadrado" :
                             (lados==5)?  "Pentagono" :
                             (lados==6)?  "Hexagono" :
                             (lados==7)?  "Heptagono" :
                             (lados==8)?  "Octagono" :
                             (lados==9)?  "Eneagono" :
                                          "Decagono";
                             
        
        double perimetro = (lados>=3 ) ? (lados*medida_lados) : 0;
        double area = (lados>=3) ? (lados* Math.pow(medida_lados, 2)) / (4 * Math.tan(Math.PI / lados)) :0;
        double angulo_interior = (lados>=3) ? ((lados-2)*180)/lados : 0;
        double angulo_exterior = (lados>=3) ? (360/lados) : 0;
        
        
        System.out.println("\nTU POLIGONO: " + observacion);
       
        System.out.println("Su Perimetro es: " + perimetro + " cm");
        System.out.println("El Area total es: " + area + " cm^2");
        System.out.println("Cada angulo interior mide: " + angulo_interior + " grados");
        System.out.println("Cada angulo exterior mide: " + angulo_exterior + " grados");
        
                
          
          
        
    }
    
    
    
    
}
