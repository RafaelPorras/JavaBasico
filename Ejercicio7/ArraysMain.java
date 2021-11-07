package es.Ejercicios.Ejercicio7;

/**
 * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 *
 * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */
public class ArraysMain {
    public static void main(String[] args) {
        String [] nombres = new String[]{
            "Antonio","Pedro","Juan","Maria","Sofia"
        };

        int [] numeros = new int[]{10,20,30,40,50,60,70,80};

        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        for(int i = 0; i< numeros.length;i++){
            System.out.println("Posicion " + i + " numero " + numeros[i]);
        }
    }
}
