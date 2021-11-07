package es.Ejercicios.Ejercicio11;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */
public class CopiarFicherosMain {
    public static void main(String[] args) {
        String fileIn = "ficheros/origen.txt";
        String fileOut = "ficheros/destino.txt";

        copiarFichero(fileIn,fileOut);
    }

    private static void copiarFichero(String fileIn, String fileOut){
        URL url = CopiarFicherosMain.class.getResource(fileIn);
        File origen = new File(url.getPath());

        if(origen.exists()){
            try {
                //copiamos un fichero
                InputStream in = new FileInputStream(origen);
                byte[] datos = in.readAllBytes();
                in.close();

                String path = url.getPath().replace("ficheros/origen.txt","");


                File destino = new File(path+fileOut);

                PrintStream out = new PrintStream(destino);
                out.write(datos);
                out.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("fichero no encontrado");
            }
        }
        else{
            System.out.println("Fichero origen no encontrado");
        }


    }
}
