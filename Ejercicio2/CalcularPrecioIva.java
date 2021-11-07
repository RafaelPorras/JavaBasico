package es.Ejercicios.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio Sesión 2
 *
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */

public class CalcularPrecioIva {
    public static void main(String[] args) {
        boolean cantidad = false;
        double precio = 0;
        double porcentajeIva = 0;
        double iva = 0;



        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el precio del producto: ");
            try{

                scanner.reset();
                precio = scanner.nextDouble();
                cantidad = true;
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("La cantidad introducida no es un número o ha puesto un punto en lugar de una coma en el decimal");
            }
        }
        while(!cantidad);

        cantidad = false;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el porcentaje de iva del producto: ");
            try{
                scanner.reset();
                porcentajeIva = scanner.nextDouble();
                cantidad = true;
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                System.out.println("La cantidad introducida no es un número o ha puesto un punto en lugar de una coma en el decimal");
            }
        }
        while(!cantidad);

        iva = calcularIva(precio,porcentajeIva);
        System.out.println("Precio del producto introducido: "+precio);
        System.out.println("Iva del producto: " + iva );
        System.out.println("Precio producto con iva: " + (precio+iva));

    }

    /**
     * funcion que calcula el iva
     * @param precio
     * @return
     */
    private static double calcularIva(double precio,double porcentajeIva) {return precio * porcentajeIva / 100 ;}
}
