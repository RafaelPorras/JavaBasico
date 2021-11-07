package es.Ejercicios.Ejercicio10;

import java.io.IOException;

/**
 * Crea una función DividePorCero.
 * Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
 * que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
 * Finalmente, mostraremos en cualquier caso: "Demo de código".
 */
public class DivideCeroMain {
    public static void main(String[] args) {
        int num = 10;
        try{
            int result = dividePorCero(num);
        }
        catch(Exception ArithmeticException){
            System.out.println("Esto no puede hacerse");
        }
        finally{
            System.out.println("Demo de codigo");
        }

    }

    private static int dividePorCero(int num) throws ArithmeticException {
        int resultado = 0;

        try{
            resultado = num / 0;
        }
        catch(Exception e){
            throw new ArithmeticException();
        }

        return resultado;
    }
}
