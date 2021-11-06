package es.Ejercicios.Ejercicio1;

public class ImprimirDatosJava {
    public static void main(String[] args) {
        //Primitivos
        //enteros
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 bytes
        int number3 = 3;   // 4 bytes
        long number4 = 4; // 8 bytes

        //punto flotante
        float number5 = 1.9f;
        double number6 = 1.4d;

        //character
        char character1 = 'a';

        //Boolean
        boolean verdadero = false;


        System.out.println("Tipo byte: " + number1);
        System.out.println("Tipo short: " + number2);
        System.out.println("Tipo entero: " + number3);
        System.out.println("Tipo long: " + number4);
        System.out.println("Tipo float: " + number5);
        System.out.println("Tipo double: " + number6);
        System.out.println("Tipo char: " + character1);
        System.out.println("Tipo boolean: " + verdadero);


        //Wrapper
        //Cadenas de texto
        String nombre = "Pedro";
        String apellido = "Perez";

        System.out.println("Cadenas de texto : " + nombre + " " +apellido);

        //Se utilizan los wrap para poder usar los tipos primitivos como clases
        Integer number7 = null;
        Long number8 = 6L;

        System.out.println("Wrapper Integer " + number7);
        System.out.println( "Wrapper long " + number8);
    }
}
