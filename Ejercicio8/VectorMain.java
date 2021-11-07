package es.Ejercicios.Ejercicio8;

import java.util.Vector;

/**
 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
 *
 * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
 *
 * El problema de los vectores es que una vez sobrepasado el limite establecido o el que tiene establecido por defecto, si no le damos
 * tamaño es que el tamaño de este se duplica con el consiguiente gasto de memoria que ellos conlleva. Es decir, si tenemos un vector con un
 * tamaño de 1000 elementos, en el momento que nuestro vector tenga 1001 este se duplica por lo que tendriamos un array de 2000 elementos, y asi
 * sucesivamente
 *
 */
public class VectorMain {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("Vector inicial " + vector);

        vector.remove(2);
        vector.remove(3);

        System.out.println("Vector final " + vector);
    }
}
