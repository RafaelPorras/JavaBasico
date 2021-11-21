package es.Ejercicios.Ejercicio12;

import es.Ejercicios.Ejercicio11.CopiarFicherosMain;

import java.util.ArrayList;

/**
 * Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class ProgramaEquiposMain {

    public static void main(String[] args) {
        Fichero fichero = new Fichero("Files/Equipos.txt");
        ArrayList<String[]> datos = fichero.readFile();
        Liga liga = new Liga(datos);

        Equipo nuevoEquipo = new Equipo(19,"uno","dos","uno","dos","uno","dos","uno");
        liga.addEquipo(nuevoEquipo);
        System.out.println(liga.toString());

        liga.deleteEquipo(nuevoEquipo);
        System.out.println(liga.toString());
    }

}
