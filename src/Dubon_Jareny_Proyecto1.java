
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dubon_Jareny_Proyecto1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        entrada.useDelimiter("\n");
        
        System.out.println("                 BIENVENIDO :) \n\n");
        
       String opcion;
       double montoCaja = 0;
       
        int compraAzucar=0, compraAvena=0, compraTrigo=0, compraMaiz=0;
       
        //para reportes
        int cant_compras=0, cant_ventas=0, azucarVendida=0, avenaVendida=0, trigoVendido=0, maizVendido=0; 
        double volum_compras=0, volum_ventas=0, max_compra=0, max_venta=0, min_venta=10000000, min_compra=1000000 ;
         double margen_ganancia;
        
        String estrella=""; int cant_estrella=0;
        
        
        
        double banco=0; boolean caja=true;
        
        do {
            
            
            System.out.println("\n----------------------------------------------");
            System.out.println("1. Abrir caja");
            System.out.println("2. Ventas");
            System.out.println("3. Compras");
            System.out.println("4. Reportes");
            System.out.println("5. Cierre de caja");
            System.out.println("6. Salir del sistema");
            System.out.println("---------------------------------------------");
            
            System.out.println("                Que desea hacer?");
            opcion = entrada.next();
            System.out.println("");
            
            switch(opcion) {
                
                case "1": 
                    System.out.println("\n                  *** ABRIR CAJA *** " );
                    System.out.println("                  ------------------");
                    
                    String montoCajaformat= String.format("%.2f", montoCaja);
                    if (montoCaja==0){
                        System.out.println("La caja esta en cero");
                        
                    }else System.out.println("La caja contiene L." + montoCajaformat);
                    
                    System.out.println("Cuanto desea agregar?");
                    double montoAgregado;
                    
                    while(true){
                        try{
                            montoAgregado = entrada.nextDouble();
                            
                            if(montoAgregado<0){
                                System.out.print("No valores negativos. Ingrese monto nuevamente: ");
                                montoAgregado = entrada.nextDouble();
                            }
                            
                             
                            break;
                        }catch (InputMismatchException e){
                            System.out.print("Error de formato. Ingrese la cantidad nuevamente:");
                            entrada.next();
                        }
                    }
                    
                   
                    montoCaja+= montoAgregado;
                    String montoAgredecimal=String.format("%.2f", montoAgregado);
                  
                    System.out.println("\nSe agrego L." +  montoAgredecimal + " con exito");
                    caja=true;
                    
                    break;
                    
                    
                    
                    
              //-------------------------------------------------------------------------------------      
                    
                case "2":
                    System.out.println("\n                  *** VENTAS *** ");
                    System.out.println("                  --------------");
                    
                    int cantAzucar=0, cantAvena=0, cantTrigo=0, cantMaiz=0;
                    String producto="", opcion_adicionar="", producto_descripcion="", producto_factura="";
                    int cantidad_producto, existencia=0;
                    double precio=0, total_parcial=0, subtotal=0, impuesto=0, descuento=0, total_final=0;
                    
                    
                    
    //SI NO HAY DINERO EN CAJA  
              montoCajaformat= String.format("%.2f", montoCaja);      
             if(caja==false){
                 System.out.println("La caja esta cerrada");
                 System.out.println("Favor ir a ABRIR CAJA \n");
                 
                 break;
                 
             }else System.out.println("");
                 
             if (montoCaja==0){
             System.out.println("Error de venta. Su caja contiene L." + montoCajaformat);
             System.out.println("Favor ir a ABRIR CAJA e ingresar monto \n");
             
             

             break;

             }else System.out.println("La caja contiene L." + montoCajaformat);
                        
             
             
     //SI NO HAY NINGUN PRODUCTO EN INVENTARIO                   
             if(compraAzucar==0 && compraAvena==0 && compraTrigo==0 && compraMaiz==0){
                            
             System.out.println("No tiene ningun producto para vender");
             System.out.println("Favor ir a COMPRAS y llenar inventario \n");
                            
             break;
                            
             }else System.out.println("Inventario: \n" + compraAzucar + "kg Azucar \n"
                                                + compraAvena + "kg Avena \n" + compraTrigo + "kg Trigo \n"
                                                + compraMaiz+"kg Maiz \n");
                       
                            
                            
                    
                   
   //////////////////////////MEJORAR TABLA                 
                    
                  
                    System.out.println("\n");
                    System.out.println("                    Tabla de Informacion");
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("| Codigo   |   Cliente A   |   Cliente B   |   Cliente C   |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    1     |     Azucar    |     Azucar    |               |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    2     |     Avena     |     Avena     |               |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    3     |     Trigo     |     Trigo     |               |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    4     |     Maiz      |               |      Maiz     |");
                    System.out.println("+----------------------------------------------------------+");
                     
                     System.out.println("Ingrese el tipo de cliente");
                     String tipoCliente = entrada.next();
                     
                     
                     while(!tipoCliente.equalsIgnoreCase("A") && !tipoCliente.equalsIgnoreCase("B") && !tipoCliente.equalsIgnoreCase("C") ){ 
                             System.out.println("\nFormato Incorrecto. Intenta de nuevo \n");
                             System.out.println("Ingrese el tipo de cliente");
                             tipoCliente = entrada.next();
                          }
                     
                     
    //CAMBAIR FORMATO, ES REPETITIVO Y POCO COMODO
                     if (tipoCliente.equalsIgnoreCase("A")){
                         System.out.println("\nCliente A. Puede comprar: \n1) Azucar \n2) Avena \n3) Trigo \n4) Maiz \n"); 
                        }
                     
                     else if (tipoCliente.equalsIgnoreCase("B")){
                         System.out.println("\nCliente B.Puede comprar: \n1) Azucar \n2) Avena \n3) Trigo \n");
                        }
                     
                     else if (tipoCliente.equalsIgnoreCase("C")){
                         System.out.println("\nCliente C. Puede comprar: \n 4) Maiz \n");
                        }
                          
              //DOWHILE PARA PREGUNTAR SI DESEA ADICIONAR OTRO PRODUCTO
                       do{
                            System.out.println("\n--------------------------------------------------------");
                            System.out.println(" Codigo   Producto   Precio Venta  Kg Disponibles  ");
                            System.out.println("--------------------------------------------------------");

                            System.out.println("   1       Azucar        L.30          " + compraAzucar);
                            System.out.println("   2       Avena         L.25          " + compraAvena);
                            System.out.println("   3       Trigo         L.32          " + compraTrigo);
                            System.out.println("   4       Maiz          L.20          " + compraMaiz);

                            System.out.println("--------------------------------------------------------");
                            
                            
                             
                            System.out.print("Ingrese el codigo del producto que desea: ");
                     String codigoProducto = entrada.next();
                     
                     
                     while(!codigoProducto.equals("1") && !codigoProducto.equals("2") && !codigoProducto.equals("3") && !codigoProducto.equals("4") ){ 
                             System.out.print("\nError! Codigo no encontrado. Ingrese el codigo nuevamente: ");
                             codigoProducto = entrada.next();
                          }
                       
            //Si el cliente es A, no tiene condiciones
            
            //Si el cliente es B. no puede comprar 4) Maiz
                     if (tipoCliente.equalsIgnoreCase("B")){
                         
                         while(codigoProducto.equals("4"))
                         {
                            System.out.println("No puede comprar este producto. Ver Tabla de opciones");
                                  codigoProducto = entrada.next();
                         }
                         
                          while(!codigoProducto.equals("1") && !codigoProducto.equals("2") && !codigoProducto.equals("3"))
                         {
                            System.out.println("\nCodigo invalido. Ver Tabla de opciones" );
                                  codigoProducto = entrada.next();
                         }        
                     }
                      
                     
             //Si el cliente es C. Solo puede comprar 4) Maiz      
                     else if (tipoCliente.equalsIgnoreCase("C")){
                         
                            while(!codigoProducto.equals("4")){
                                System.out.println("No puede comprar este producto. Ver Tabla de opciones");
                                codigoProducto = entrada.next();}
                          
                        }
                     
                     
                     if((codigoProducto.equals("1") && compraAzucar==0) ||
                        (codigoProducto.equals("2") && compraAvena==0) ||   
                        (codigoProducto.equals("3") && compraTrigo==0) ||   
                        (codigoProducto.equals("4") && compraMaiz==0)  )
                     {
                          System.out.println("\nLo sentimos. No hay items de este producto\n"); 
                         
                     }else {
                     
                         
            //Condiciones con variables generales para cada codigo de producto
                     if(codigoProducto.equals("1")){
                         producto="Azucar";
                         precio=30;
                         producto_descripcion="kg    Azucar  L.30 ";
                         //asignar existencia 
                         existencia=compraAzucar;
                       }
                     
                     else if(codigoProducto.equals("2")){
                         producto="Avena";
                         precio=25;
                         producto_descripcion="kg    Avena   L.25 ";
                         //asignar existencia 
                         existencia=compraAvena;
                      }
                     
                     else if(codigoProducto.equals("3")){
                         producto="Trigo";
                         precio=32;
                         producto_descripcion="kg    Trigo   L.32 ";
                         //asignar existenciaa
                         existencia=compraTrigo;
                      }
                       
                     else if(codigoProducto.equals("4")){
                         producto="Maiz";
                         precio=20;
                         producto_descripcion="Maiz    Maiz    L.20 ";
                         //asignar existencia dependiendo del producto que elij
                         existencia=compraMaiz;
                      }
                     
                     
                     
                         System.out.println("\n|    Descipcion    |    Precio   |");
                         System.out.println("-----------------------------------");
                         System.out.println("     " + producto + " kg          L." + precio);
                         
                       
                         
                         
                     
                        System.out.print("\nCuantos kilogramos desea comprar de " + producto + "?: ");
         //Valida que no ingrese otros formatos diferentes a int
                        while(true)
                        {
                            try{ 
                                cantidad_producto=entrada.nextInt();
                            
                            if(cantidad_producto<0){
                                System.out.print("\nCantidad invalida. Favor intenta de nuevo:  ");
                                cantidad_producto=entrada.nextInt();  
                            }
                            //Verificar si hay producto en inventario
                            else if(cantidad_producto>existencia){
                                System.out.print("\nSolo hay " + existencia + " kg de " + producto + 
                                    "\nIngresa la cantidad nuevamente: ");
                                cantidad_producto=entrada.nextInt();
                            }
                            
                           break;
                            
                            }catch(InputMismatchException e){
                                System.out.print("Formato invalido. Ingresa la cantidad nuevamente: ");
                                entrada.next();
                            }
                        }
         
         
               //Elimar productos vendidos del inventario y suma contador de porducto estrella    
                     if(codigoProducto.equals("1")){
                             compraAzucar=compraAzucar-cantidad_producto;
                             azucarVendida=azucarVendida+cantidad_producto;
                     }
                     
                     else if(codigoProducto.equals("2")){
                         compraAvena=compraAvena-cantidad_producto; 
                         avenaVendida=avenaVendida+cantidad_producto;
                      }
                     
                     else if(codigoProducto.equals("3")){
                         compraTrigo=compraTrigo-cantidad_producto;
                         trigoVendido=trigoVendido+cantidad_producto;
                      }
                     
                     else if(codigoProducto.equals("4")){
                         compraMaiz=compraMaiz-cantidad_producto;  
                         maizVendido=maizVendido+cantidad_producto;
                      }
                     
                             
                        total_parcial=cantidad_producto*precio;
                        subtotal = subtotal+total_parcial;
                        
                       
                        if (cantidad_producto>0){//si no la cantid no ew mayor a 0, no concaneta factura
                            //varianble para guardar las compras y reflejarlo en la pantalla 
                         //producto_factura=producto_factura + cantidad_producto + producto_descripcion + "   "  +total_parcial + "\n";
                          producto_factura=producto_factura + " " +  producto + "   " + cantidad_producto + "kg   "  + precio + "   " + total_parcial + "\n";
                        }
                        
                        
 
                     }//Fin del if que verifica si hay 0 de uno de los productos
                        
                        System.out.println("\nDesea agregar otro producto a su compra? (SI/NO)");
                        opcion_adicionar=entrada.next();
                        
                        while(!opcion_adicionar.equalsIgnoreCase("si") && !opcion_adicionar.equalsIgnoreCase("no")){
                            System.out.println("Formato invalido. Verifica las opciones");
                            opcion_adicionar=entrada.next();}
                     
                    
                    }while(opcion_adicionar.equalsIgnoreCase("si")); 
                       
                       if(subtotal==0){
                           System.out.println("\nNO SE REALIZO NINGUNA VENTA\n");
                       }
                       else{
                       
                       
                       //descuentos 
                       if(subtotal>=1000 && subtotal<=5000)
                           descuento=subtotal*0.05;
                       else if(subtotal>5000)
                           descuento=subtotal*0.1;
                       else 
                           descuento=0;
                       
                       //impuestop
                          impuesto=subtotal*0.07;
                          total_final=subtotal+impuesto-descuento;
                       
                       String descimal=String.format("%.2f", descuento);
                       String impcimal=String.format("%.2f", impuesto);
                       String totalfinaldecimal=String.format("%.2f", total_final);
                  cant_ventas++;//aumentar contador ventas     
                       
                       
                        System.out.println("\n-------------------------------------");
                        System.out.println("        **    TIENDA     **        ");
                        System.out.println("");
                        System.out.println("Numero de factura: " + cant_ventas );
                        System.out.println("Cliente: Consumidor final tipo " + tipoCliente);
                        System.out.println("Sucursal: UNITEC SPS");
                        
                        System.out.println("-------------------------------------");
                        System.out.println(" Dscr   Cant  Precio  Total ");
                        System.out.println("-------------------------------------");
                        System.out.println(producto_factura);
                        
                        System.out.println("-------------------------------------");
                        System.out.println("Total de Articulos: " );
                        System.out.println("-------------------------------------");
                        System.out.println("Subtotal:                     L." + subtotal);
                        System.out.println("Descuentos y rebajas:         L." + descimal);
                        System.out.println("I.S.V 7%:                     L." + impcimal );
                        
                        System.out.println("\nTOTAL A PAGAR:                L." + totalfinaldecimal);
                        System.out.println("--------------------------------------\n");
                        
                        
             
             montoCaja= montoCaja+total_final;//Agregar dinero de factura a caja
             
             
             volum_ventas=volum_ventas+total_final; //aumentar volumen ventas
                   
             if(total_final>=max_venta) //mayor venta
                 max_venta=total_final;
             
             if(total_final<=min_venta) //menor venta
                 min_venta=total_final;
             
             
       }//si es cero no se muestra factrta
            
             
                  break;
                            
      //------------------------------------------------------------------------------------------------------            
                case "3": 
                    System.out.println("\n                 *** COMPRAS *** ");
                    System.out.println("                 ---------------");
                    
                   
                    int cantidadCompra, precioCompra=0;
                    String productoCompra="", descripcionCompra="";
                    montoCajaformat= String.format("%.2f", montoCaja);
                    
                    if(caja==false){
                        System.out.println("La caja esta cerrada");
                        System.out.println("Favor ir a ABRIR CAJA \n");
                        break;
                    }
                        
                        if (montoCaja==0){
                          System.out.println("Error de compra. Su caja contiene L." + montoCajaformat);
                          System.out.println("Favor ir a ABRIR CAJA e ingresar monto \n");
                            break;

                      }else System.out.println("La caja contiene L." + montoCajaformat);
                      
                    
                    
                   
                    System.out.println("\n");
                    System.out.println("                    Tabla de Informacion");
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("| Codigo   |  Proveedor A  |  Proveedor B  |  Proveedor C  |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    1     |  Azucar L.25  |               |               |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    2     |               |   Avena L.20  |   Avena L.22  |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    3     |               |   Trigo L.30  |               |");
                    System.out.println("+----------+---------------+---------------+---------------+");
                    System.out.println("|    4     |   Maiz L.18   |               |               |");
                    System.out.println("+----------------------------------------------------------+");

                   
                     System.out.println("\nIngrese el tipo de proveedor");
                     String tipoProveedor = entrada.next();
                     
                     
                     while(!tipoProveedor.equalsIgnoreCase("A") && !tipoProveedor.equalsIgnoreCase("B") && !tipoProveedor.equalsIgnoreCase("C") ){ 
                             System.out.print("Formato Incorrecto. Ingresa proveedor nuevamente: ");
                             tipoProveedor = entrada.next();
                          }
                     
                   
                     if (tipoProveedor.equalsIgnoreCase("A")){
                         System.out.println("\nProveedor A. Ofrece: \n1) Azucar \n4) Maiz \n"); 
                        }
                     
                     else if (tipoProveedor.equalsIgnoreCase("B")){
                         System.out.println("\nProveedor B. Ofrece: \n2) Avena \n3) Trigo \n"); 
                        }
                     
                     else if (tipoProveedor.equalsIgnoreCase("C")){
                         System.out.println("\nProveedor C. Ofrece: \n2) Avena \n"); 
                        }
                     
                     
                     
                     
                     System.out.println("Ingrese el codigo del producto a comprar");
                     String codigoCompra = entrada.next();
                     
                     while(!codigoCompra.equals("1") && !codigoCompra.equals("2") && !codigoCompra.equals("3") && !codigoCompra.equals("4") ){ 
                             System.out.println("\nError! Codigo no encontrado");
                             System.out.print("Ingrese el codigo del producto a comprar: ");
                             codigoCompra = entrada.next();
                          }
                     
                     
                      if (tipoProveedor.equalsIgnoreCase("A")){
                         
                            while(!codigoCompra.equals("1") && !codigoCompra.equals("4") ){
                                System.out.print("El proveedor no proporciona este producto. Ver Tabla de opciones: ");
                                codigoCompra = entrada.next();
                              
                          }
                               if(codigoCompra.equals("1")){
                                productoCompra="Azucar";
                                precioCompra=25;
                                descripcionCompra="kg   Azucar  L.25 ";
                               }
                               else if(codigoCompra.equals("4")){
                                productoCompra="Maiz";
                                precioCompra=18;
                                descripcionCompra="kg     Maiz   L.18 ";  
                               }
                        }
                      
                     else if (tipoProveedor.equalsIgnoreCase("B")){
                         
                            while(!codigoCompra.equals("2") && !codigoCompra.equals("3") ){
                                System.out.print("El proveedor no proporciona este producto. Ver Tabla de opciones: ");
                                codigoCompra = entrada.next();
                              
                          }
                               if(codigoCompra.equals("2")){
                                productoCompra="Avena";
                                precioCompra=20;
                                descripcionCompra="kg    Avena   L.20 ";
                                
                                
                               }
                               else if(codigoCompra.equals("3")){
                                productoCompra="Trigo";
                                precioCompra=30;
                                descripcionCompra="kg    Trigo   L.30 ";
                                   
                                   
                               }               
                     }
                      
                      else if (tipoProveedor.equalsIgnoreCase("C")){
                         
                            while(!codigoCompra.equals("2")){
                                System.out.print("El proveedor no proporciona este producto. Ver Tabla de opciones: ");
                                codigoCompra = entrada.next();
                              
                          }
                               
                               if(codigoCompra.equals("2")){
                                productoCompra="Avena";
                                precioCompra=22;
                                descripcionCompra="kg    Avena   L.22 ";
                               }
                    
                    }
                      
                      System.out.println("\n|   Descipcion   |   Precio Compra   |");
                      System.out.println("--------------------------------------");
                      System.out.println("     " + productoCompra + " kg            L." + precioCompra);
                      
                      
                        System.out.println("\nCuantos kilogramos desea comprar de " + productoCompra + "?");
                        
                        while(true){
                        try{
                            cantidadCompra=entrada.nextInt();
                            
                            if(cantidadCompra<0){
                                System.out.print("No valores negativos. Ingrese cantidad nuevamente: ");
                                cantidadCompra=entrada.nextInt();
                            }
                            
                            break;
                        }catch (InputMismatchException e){
                            System.out.print("Error de formato. Ingrese la cantidad nuevamente: ");
                            entrada.next();
                        }
                    }
                    
                        
                        double subtotalCompra = cantidadCompra*precioCompra;
                        
                        if(montoCaja<subtotalCompra){
                            System.out.println("\nFondos insuficientes. \nCaja: " + montoCaja + "\nNecesita: " +subtotalCompra 
                                    + "\nAgregar dinero a caja e intentarlo de nuevo");
                            break;
                        }
                        else if(subtotalCompra==0){
                            System.out.println("\nNO SE REALIZO NINGUNA COMPRA\n");
                            break;
                        }
                       
                        else {
                        
                         cant_compras++;//aumentar contador ventas    
                            
                        System.out.println("\n\n");
                        System.out.println("-------------------------------------");
                        System.out.println("    **    FACTURA DE COMPRA    **   ");
                        System.out.println("");
                        System.out.println("Numero de Compra: " + cant_compras );
                        System.out.println("Proveedor: Tipo " + tipoProveedor);
                        System.out.println("Sucursal: UNITEC SPS");
                        
                        System.out.println("-------------------------------------");
                        System.out.println(" Dscr   Cant   Precio    Total ");
                        System.out.println("-------------------------------------");
                        
                        System.out.println("\n"+ " " + productoCompra + "   " + cantidadCompra + "kg    L." + precioCompra + "     " +  subtotalCompra +"\n");
                        
                        System.out.println("-------------------------------------");
                        System.out.println("Subtotal:                      L." + subtotalCompra);
                        System.out.println("Descuentos y rebajas:          L.0" );
                        System.out.println("I.S.V 7%:                      L.0" );
                        
                        System.out.println("\nTOTAL A PAGAR:               L." + subtotalCompra);
                        System.out.println("--------------------------------------");
                
                        
                //Agregar productos comprados al inventario      
                      if(codigoCompra.equals("1")){
                         compraAzucar=compraAzucar+cantidadCompra;
                       }
                     else if(codigoCompra.equals("2")){
                         compraAvena=compraAvena+cantidadCompra;
                      }
                     else if(codigoCompra.equals("3")){
                         compraTrigo=compraTrigo+cantidadCompra;
                      }
                     else if(codigoCompra.equals("4")){
                         compraMaiz=compraMaiz+cantidadCompra;
                      }
                       
             montoCaja=montoCaja-subtotalCompra;  //Restar compra a la caja
            
             volum_compras=volum_compras+subtotalCompra;
              
             if(subtotalCompra>=max_compra)//mayor compra
                 max_compra=subtotalCompra;
             
             if(subtotalCompra<=min_compra) //minima compra
                 min_compra=subtotalCompra;
      }
        
    break; //no entrar en el siguiente caso
                     
   //------------------------------------------------------------------------------------------------------            
                 
                case "4":
                   
                    //Variables de ranking
                    String primero = "", segundo = "", tercero = "", cuarto = "";
                    int rank1 = Integer.MIN_VALUE, rank2 = Integer.MIN_VALUE, rank3 = Integer.MIN_VALUE, rank4 = Integer.MIN_VALUE;
                    
                    //Si no se ha vendido ningun porducto no hay rankig
                    if(azucarVendida==0 && avenaVendida==0 && trigoVendido==0 && maizVendido==0){
                    primero="Sin evaluar";
                    segundo="Sin evaluar";
                    tercero="Sin evaluar";
                    cuarto="Sin evaluar";
                    rank1=0;rank2=0;rank3=0;rank4=0;


                } else{            

                //quien es PRIMERO
                if (azucarVendida >= avenaVendida && azucarVendida >= trigoVendido && azucarVendida >= maizVendido) {
                    primero = "Azucar";
                    rank1 = azucarVendida;
                }
                if (avenaVendida >= azucarVendida && avenaVendida >= trigoVendido && avenaVendida >= maizVendido) {
                    primero += primero.isEmpty() ? "Avena" : ", Avena";
                    rank1 = avenaVendida;
                }
                if (trigoVendido >= azucarVendida && trigoVendido >= avenaVendida && trigoVendido >= maizVendido) {
                    primero += primero.isEmpty() ? "Trigo" : ", Trigo";
                    rank1 = trigoVendido;
                }
                if (maizVendido >= azucarVendida && maizVendido >= avenaVendida && maizVendido >= trigoVendido) {
                    primero += primero.isEmpty() ? "Maiz" : ", Maiz";
                    rank1 = maizVendido;
                }


                //quien es CUARTO
                if (azucarVendida <= avenaVendida && azucarVendida <= trigoVendido && azucarVendida <= maizVendido) {
                    cuarto = "Azucar";
                    rank4 = azucarVendida;
                }
                if (avenaVendida <= azucarVendida && avenaVendida <= trigoVendido && avenaVendida <= maizVendido) {
                    cuarto += cuarto.isEmpty() ? "Avena" : ", Avena";
                    rank4 = avenaVendida;
                }
                if (trigoVendido <= azucarVendida && trigoVendido <= avenaVendida && trigoVendido <= maizVendido) {
                    cuarto += cuarto.isEmpty() ? "Trigo" : ", Trigo";
                    rank4 = trigoVendido;
                }
                if (maizVendido <= azucarVendida && maizVendido <= avenaVendida && maizVendido <= trigoVendido) {
                    cuarto += cuarto.isEmpty() ? "Maiz" : ", Maiz";
                    rank4 = maizVendido;
                }


                // SEGUNDO SIN PRIMERO
                if (!primero.contains("Azucar") && azucarVendida > rank4 && azucarVendida>=rank2 && !segundo.contains("Azucar")) {

                    if(azucarVendida==rank2){
                        segundo+=", Azucar";}
                    else {
                        segundo="Azucar";}

                    rank2 = azucarVendida;
                }
                if (!primero.contains("Avena") && avenaVendida > rank4 && avenaVendida >= rank2  ) {

                    if(avenaVendida==rank2){
                        segundo+=", Avena";}
                    else {
                        segundo="Avena"; }

                    rank2 = avenaVendida;
                }
                if (!primero.contains("Trigo") && trigoVendido > rank4 && trigoVendido >= rank2 ) {
                    if(trigoVendido==rank2){
                        segundo+=", Trigo";}
                    else {
                        segundo="Trigo";}

                    rank2 = trigoVendido;
                }
                if (!primero.contains("Maiz") && maizVendido > rank4 && maizVendido >= rank2 ) {
                    if(maizVendido==rank2){
                        segundo+=", Maiz";}
                    else {
                        segundo="Maiz"; }

                    rank2 = maizVendido;
                }


                // TERCERO SIN SEGUNDO
                if (!primero.contains("Azucar") && !segundo.contains("Azucar") && azucarVendida > rank4 && azucarVendida>=rank3) {

                    if(azucarVendida==rank3){
                        tercero+=", Azucar";}
                    else {
                        tercero="Azucar";}

                    rank3 = azucarVendida;
                }
                if (!primero.contains("Avena") && !segundo.contains("Avena") &&avenaVendida > rank4 && avenaVendida >= rank3 ) {
                    if(avenaVendida==rank3){
                        tercero+=", Avena";}
                    else {
                        tercero="Avena"; }
                    rank3 = avenaVendida;
                }
                if (!primero.contains("Trigo") && !segundo.contains("Trigo") && trigoVendido > rank4 && trigoVendido >= rank3 ) {
                    if(trigoVendido==rank3){
                        tercero+=", Trigo";}
                    else {
                        tercero="Trigo"; }
                    rank3 = trigoVendido;
                }
                if (!primero.contains("Maiz") && !segundo.contains("Maiz")&& maizVendido > rank4 && maizVendido >= rank3  ) {
                    if(maizVendido==rank3){
                        tercero+=", Maiz";}
                    else {
                        tercero="Maiz";}
                    rank3 = maizVendido;
                }



                //s segundo esta vacio pero tercero lleno
                if (rank2 == Integer.MIN_VALUE) {
                    if (rank3 != Integer.MIN_VALUE) {
                        rank2 = rank3;
                        segundo = tercero;

                        rank3 = rank4;
                        tercero = cuarto;

                        cuarto = "Rankin completo";
                        rank4 = 0;
                    } else if (rank4 != Integer.MIN_VALUE) {
                        rank2 = rank4;
                        segundo = cuarto;

                        cuarto = "Rankin completo";
                        rank4 = 0;
                    }
                }

                // si tercero esta vacio pero cuarto llenos
                if (rank3 == Integer.MIN_VALUE) {
                    if (rank4 != Integer.MIN_VALUE) {
                        rank3 = rank4;
                        tercero = cuarto;

                        cuarto = "Rankin completo";
                        rank4 = 0;
                    }
                }



                //sji alguno esta vacio se reocroren las posiciones 
                if (rank1 == Integer.MIN_VALUE) {
                    rank1 = rank2;
                    primero = segundo;

                    rank2 = rank3;
                    segundo = tercero;

                    rank3 = rank4;
                    tercero = cuarto;

                    cuarto = "Rankin completo";
                    rank4 = 0;
                } else if (rank2 == Integer.MIN_VALUE) {
                    rank2 = rank3;
                    segundo = tercero;

                    rank3 = rank4;
                    tercero = cuarto;

                    cuarto = "Rankin completo";
                    rank4 = 0;
                } else if (rank3 == Integer.MIN_VALUE) {
                    rank3 = rank4;
                    tercero = cuarto;

                    cuarto = "Rankin completo";
                    rank4 = 0;
                }


                //si alguno ya estaba validado no se repite en los ieguintes 
                if(rank1==rank2){
                    segundo="Ranking completo";
                    rank2=0;
                }

                if(rank2==rank3){
                    tercero="Ranking completo";
                    rank3=0;
                }
                if(rank3==rank4){
                    cuarto="Ranking completo";
                    rank4=0;
                }


     }//fin de sin evaluar          
                    
                    
                    
                    System.out.println("\n                       *** REPORTES *** ");
                    System.out.println("                        ----------------");
                     
                    montoCajaformat= String.format("%.2f", montoCaja);
                    System.out.println("\n---------------------------------------------------------------------");
                    System.out.println("\n1. Cantidad Total en Caja: " + montoCajaformat +"\n");
                    System.out.println("---------------------------------------------------------------------");
                    
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("\n2. Numero de Compras y Ventas realizadas en el dia:"
                            + "\n\nCantidad de Compras realizada: " + cant_compras
                            + "\nCantidad de Ventas efectuadas: " + cant_ventas + "\n");
                    System.out.println("--------------------------------------------------------------------");   
                    
                    System.out.println("--------------------------------------------------------------------"); 
                   
                    String volum_comprasdecimal=String.format("%.2f", volum_compras);
                    String volum_ventasdecimal=String.format("%.2f", volum_ventas);
                    
                    System.out.println("\n3. Volumen total de Compras y Ventas efectuadas antes del cierre: "
                            + "\n\nVolumen Total de Compras: L. " + volum_comprasdecimal
                            + "\nVolumen Total de Ventas: L. " + volum_ventasdecimal);
                            margen_ganancia=volum_ventas-volum_compras;
                            
                            String ganandecimal= String.format("%.2f", margen_ganancia);
                            if(margen_ganancia<0){
                                System.out.println("Margen de Perdida Total: L. " + ganandecimal);
                            }
                            else System.out.println("Margen de Ganancia Total: L. " + ganandecimal);
                    
                    System.out.println("\nObservacion: ");
                    if((volum_ventas-volum_compras)<0)
                        System.out.println("No ha recuperado el monto invertido, "
                                + "\nasegurese de hacer mas ventas para no tener perdidas");
                    
                    else if((volum_ventas-volum_compras)==0)
                        System.out.println("Inversion Recuperada, sin ganacia");
                    
                    else System.out.println("Inversion Recuperada, con ganancia");
                    
                    System.out.println("\n--------------------------------------------------------------------"); 
                    
                    System.out.println("--------------------------------------------------------------------"); 
                      double medio_compra= volum_compras/cant_compras;
                      String medio_compradecimal=String.format("%.2f", medio_compra);
                      
                      double medio_venta=volum_ventas/cant_ventas;
                      String medio_ventadecimal=String.format("%.2f", medio_venta);
                             
                    
                    System.out.println("\n4. Valor Medio de Compra y Venta "
                                   + "\n\nValor Medio de Compra: " + medio_compradecimal
                                   + "\nValor Medio de Venta: " + medio_ventadecimal);
                    System.out.println("\n--------------------------------------------------------------------");
                    
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("\n5. Venta con Mayor Ganancia y Compra con Mayor Gasto efectuada"
                                   + "\n\nVenta con Mayor Ganacia: L. " + max_venta
                                   +"\nCompra con Mayor Gasto: L. " + max_compra);
                    System.out.println("\n--------------------------------------------------------------------");
                    
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("\n6. Producto Estrella"
                                   + "\n\nProducto Estrella: " + primero
                                   + "\nCantidad Vendida: " + rank1 + " kg");
                    System.out.println("\n--------------------------------------------------------------------");
                                   
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("\n7. Ranking"
                            
                            + "\nPosicion   |        Producto       |     Cantidad Vendida");
                    System.out.println("\n\nPrimero: " + primero + " | con: " + rank1 + " venta/s " + 
                   "\n\nSegundo: " + segundo + " | con: " + rank2 + " venta/s " + 
                   "\n\nTercero: " + tercero + " | con: " + rank3 + " venta/s " +
                   "\n\n Cuarto: " + cuarto + " | con: " + rank4 + " venta/s ");
                    System.out.println("\n--------------------------------------------------------------------");
                 
                    break;
                    
                    
   //------------------------------------------------------------------------------------------------------            

                case "5": 
                    System.out.println("\n                  *** CIERRE DE CAJA *** ");
                    System.out.println("                   ---------------------");
                   montoCajaformat= String.format("%.2f", montoCaja);
                   margen_ganancia= volum_ventas-volum_compras;
                   ganandecimal= String.format("%.2f", margen_ganancia);
                   
                    System.out.println("Resumen:");
                    if(margen_ganancia<0){
                                System.out.println("Margen de Perdida Total: L. " + ganandecimal);
                            }
                            else System.out.println("Margen de Ganancia: L. " + ganandecimal);
                          
                            System.out.println("TOTAL EN CAJA : L. " + montoCajaformat);
                    
                    double max_depositar=montoCaja*0.6;
                    String max_depoformat=String.format("%.2f", max_depositar);
                    
                    System.out.println("\nCuanto dinero del total de caja desea ingresar en el banco?");
                     double deposito;
                     
                    while(true){
                        try{
                            deposito = entrada.nextDouble();
                            
                            if (deposito < 0) {
                                System.out.print("No valores negativos. Ingrese el monto nuevamente: ");
                            } 
                            else if (deposito > max_depositar) {
                                System.out.println("\nMaximo a depositar (60%) es L. " + max_depoformat);
                                System.out.print("Intente con una cantidad menor: ");
                            } 
                            else {
                                break;
                            }
                        }catch (InputMismatchException e){
                            System.out.print("Error de formato. Ingrese la cantidad nuevamente:");
                            entrada.next();
                        }
                    }
                    
                   
                    
                    
                    if(deposito==0){
                        System.out.println("No se ha realizado ningun deposito");
                         
                    }
                    else 
                    System.out.println("Se ha depositado L. " + deposito + " con exito.");
                    caja=false;
                    
                    banco=banco+deposito;
                    montoCaja=montoCaja-deposito;
                    
                    cant_compras=0; cant_ventas=0; azucarVendida=0;avenaVendida=0; trigoVendido=0; maizVendido=0; 
                    volum_compras=0; volum_ventas=0; max_compra=0; max_venta=0 ;
        
                    estrella=""; cant_estrella=0;

                   primero = ""; segundo = ""; tercero = ""; cuarto = "";
                   rank1 = Integer.MIN_VALUE; rank2 = Integer.MIN_VALUE; rank3 = Integer.MIN_VALUE; rank4 = Integer.MIN_VALUE;
                    
                    
      
                    break;
   
         //------------------------------------------------------------------------------------------------------            
                 
                case "6":
                    
                    System.out.println("Cerrando el programa...");
                    
                    break;
                    
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo. \n");
              
            }
            
            
           
        }while(!opcion.equals("6"));
        
        
    }
    
}
 