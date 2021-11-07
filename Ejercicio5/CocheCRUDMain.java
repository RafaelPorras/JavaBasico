package es.Ejercicios.Ejercicio5;


public class CocheCRUDMain {
    public static void main(String[] args) {
        CocheCRUDImpl car = new CocheCRUDImpl();

        car.save();
        car.findAll();
        car.delete();
    }
}
