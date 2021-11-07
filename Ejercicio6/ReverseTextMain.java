package es.Ejercicios.Ejercicio6;

import java.util.Scanner;

/**
 * Dada la función:
 * public static String reverse(String texto) {
 *
 * }
 *
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */
public class ReverseTextMain {
    public static void main(String[] args) {

        String texto = "";
       boolean continuar = true;


            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Escribe un texto: ");

                texto = scanner.nextLine();
                continuar = false;
            }
            while(continuar);


            System.out.println("Texto al revés: " + reverse(texto));

    }

    public static String reverse(String texto){
        String reverseMessage = "";

        for(int i = texto.length()-1; i >= 0 ; i--){reverseMessage += texto.charAt(i);}

        return reverseMessage;
    }
}
