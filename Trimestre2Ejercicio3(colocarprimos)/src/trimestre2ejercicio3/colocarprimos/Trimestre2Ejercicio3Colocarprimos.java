package trimestre2ejercicio3.colocarprimos;

import java.util.Scanner;

/**
 *
 * @author Nick Morales
 */
public class Trimestre2Ejercicio3Colocarprimos {

    /**
     * @param args the command line arguments
     */
    public static Boolean esPrimo(int numero) {
        Boolean esPrimoActual = true;
        if (numero < 2) {
            esPrimoActual = false;
        } else {
            for (int x = 2; x * x <= numero; x++) {
                if (numero % x == 0) {
                    esPrimoActual = false;
                    break;
                }
            }
        }
        return esPrimoActual;
    }

    public static void main(String[] args) {
    
         Scanner entrada = new Scanner(System.in);
        int cantidad =  10 ;
        int [] numeros =  new  int [cantidad];
        System.out.println("Introduzca 10 números: ");
        for ( int i =  0 ; i < numeros . length; i ++ ) {
            numeros [i] = entrada. nextInt ();
        }
        

        for ( int j =  0 ; j < numeros . length - 1 ; j ++ ) {
                
                
                // Compruebo si el numero actual no es primo y el siguiente si lo es
                if (esPrimo (numeros [j]) ==  false  && esPrimo (numeros [j + 1 ]) ==  true ) {
                    // Si se cumple lo de arriba, cambiamos sus posiciones y reiniciamos el bucle
                    int aux = numeros [j];
                    numeros [j] = numeros [j + 1 ];
                    numeros [j + 1 ] = aux;
                    j =  - 1 ;
                 }

            
        }
        for ( int k =  0 ; k < cantidad; k ++ ) {
                   System.out.println( "  "  + numeros [k]);
               } System.out.println();
    }
    }

