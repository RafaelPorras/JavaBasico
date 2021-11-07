package es.Ejercicios.Ejercicio4;

/**
 * Ejercicio Sesión 4

 *
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 *
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 *
 * Crear constructor vacío y con todos los parámetros para cada clase.
 *
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class mainSmartDevice {
    public static void main(String[] args) {
        SmartDevice iphone = new SmartPhone(6.1d,
                "5000mA",
                203d,
                150.4d,
                "Black",
                "Apple",
                "12Mpx",
                "IOS",
                "Grafito");

        SmartDevice iWatch = new SmartWatch(2.3d,
                "1500mA",
                38.8d,
                45d,
                "White",
                "Apple",
                "Leather",
                "IPhone");

        System.out.println(iphone);
        System.out.println(iWatch);
    }
}

