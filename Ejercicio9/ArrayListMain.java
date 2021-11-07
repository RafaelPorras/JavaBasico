package es.Ejercicios.Ejercicio9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Crea un ArrayList de tipo String, con 4 elementos.
 * Cópialo en una LinkedList.
 * Recorre ambos mostrando únicamente el valor de cada elemento.
 *
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares.
 * Por último, vuelve a recorrerlo y muestra el ArrayList final.
 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 */

public class ArrayListMain {

    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<>();

        //Añadir elementos
        listaNombres.add("Antonio");
        listaNombres.add("Beatriz");
        listaNombres.add("Carlos");
        listaNombres.add("Elena");

        List<String> linkedNombres = new LinkedList<>(listaNombres);

        System.out.println("=========");
        System.out.println("ArrayList");
        for (String nombre: listaNombres) {
            System.out.println(nombre);
        }

        System.out.println("=========");
        System.out.println("LindkedList");
        for (String nombre: linkedNombres) {
            System.out.println(nombre);
        }

        List <Integer> listaNumeros  = new ArrayList<Integer>();

        for(int i = 0; i < 11; i++){
            listaNumeros.add(i);
        }

        for(int i = 0; i < listaNumeros.size();i++) {
            if (listaNumeros.get(i) % 2 == 0) {
                listaNumeros.remove(i);
            }
        }

        for (int numero: listaNumeros) {
            System.out.println(numero);
        }


    }
}
