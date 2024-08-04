
import java.util.Scanner;

public class Dubon_Jareny_Bucles {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion;
        entrada.useDelimiter("\n");

        do {
            System.out.println("\n     ---> MENU <--      "
                    + "\n1. Palabra diagonal"
                    + "\n2. Piramide de numero"
                    + "\n3. Listado de Palindromo y no Palindromo"
                    + "\n4. Salir");

            System.out.print("Ingrese el numero del ejercicio: ");
            opcion = entrada.next();

            while (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4")) {
                System.out.print("No existe esa opcion. Intente de nuevo");
                opcion = entrada.next();

            }

            switch (opcion) {
                case "1":

                    System.out.println("\n **** PALABRA DIAGONAL **** \n");

                    char guardar = 0;
                    String espacios = "";

                    System.out.println("Ingrese una palabra");
                    String palabra = entrada.next().toUpperCase();

                    for (int der = 0; der < palabra.length(); der++) {
                        guardar = palabra.charAt(der);
                        espacios = espacios + " ";

                        System.out.println(espacios + guardar);

                    }
                    for (int izq = espacios.length() - 1; izq >= 0; izq--) {

                        guardar = palabra.charAt(izq);

                        System.out.println(espacios + guardar);

                        espacios = espacios.substring(0, izq);

                    }

                    break;

                case "2":
                    System.out.println("\n **** PRIRAMIDE CON NUMEROS **** \n");

                    System.out.println("Ingrese un numero entero");

                    //validasr formato
                    int numero;
                    while (true) {
                        if (entrada.hasNextInt()) {
                            numero = entrada.nextInt();

                            if (numero > 0) {
                                break;
                            } else {
                                System.out.print("Formato Invalido. Intente de nuevo: ");
                            }
                        } else {
                            System.out.print("Formato Invalido. Intente de nuevo: ");
                            entrada.next();
                        }
                    }

                    System.out.println(" ");
                    for (int saltos = 1; saltos <= numero; saltos++) {

                        for (int espacio = 1; espacio < saltos; espacio++) {
                            System.out.print("  ");
                        }

                        for (int num_asciende = saltos; num_asciende <= numero; num_asciende++) {
                            System.out.print(num_asciende + " ");

                        }

                        for (int num_desciende = numero - 1; num_desciende >= saltos; num_desciende--) {
                            System.out.print(num_desciende + " ");
                        }

                        System.out.println(" ");
                    }

                    break;

                case "3":

                    String ingresada,
                     si_palindromas = "",
                     no_palindromas = "";
                    System.out.println("\n **** PARALABRAS PALINDROMAS **** \n");

                    System.out.print("Cuantas palabras desea ingresar?: ");

                    int cant_palabras;
                    while (true) {
                        if (entrada.hasNextInt()) {
                            cant_palabras = entrada.nextInt();

                            if (cant_palabras > 0) {
                                break;
                            } else {
                                System.out.print("Formato Invalido. Intente de nuevo: ");
                            }
                        } else {
                            System.out.print("Formato Invalido. Intente de nuevo: ");
                            entrada.next();
                        }
                    }

                    System.out.println(" ");
                    for (int index = 1; index <= cant_palabras; index++) {
                        System.out.print("Palabra #" + index + ": ");
                        ingresada = entrada.next().toLowerCase();

                        String inversa = "";
                        for (int i = ingresada.length() - 1; i >= 0; i--) {

                            inversa = inversa + ingresada.charAt(i);
                        }

                        if (ingresada.equals(inversa)) {
                            si_palindromas = si_palindromas + ingresada + "\n";
                        } else {
                            no_palindromas = no_palindromas + ingresada + "\n";
                        }

                    }

                    System.out.println("\nPalabras Palindromas: \n" + si_palindromas);

                    System.out.println("Palabras No palindromas: \n" + no_palindromas);

                    break;

                default:
                    System.out.println("\nSaliendo del programa...");
                    break;

            }

        } while (!opcion.equals("4"));

    }

}
