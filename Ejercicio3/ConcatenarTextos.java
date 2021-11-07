package es.Ejercicios.Ejercicio3;

/**
 * Ejercicio Sesión 3
 *
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 *
 * Tened en cuenta que los textos pueden venir de un array de tipo String.
 *
 * Por ejemplo: String[] nombres = {"", "", "", ""}
 */
public class ConcatenarTextos {
    public static void main(String[] args) {
        String [] textos = new String[]{
                "Texto numero 1",
                "texto numero 2",
                "texto numero 3",
                "texto numero 4"
        };

        System.out.println(concatenarTextos(textos));

    }

    private static String concatenarTextos(String [] textos){
        String textosConcatenados = "";

        for (String texto: textos) {
            textosConcatenados += texto;
            textosConcatenados += " ";
        }

        return textosConcatenados;
    }
}
