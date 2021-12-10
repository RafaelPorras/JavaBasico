/**
 * Crear una interfaz CocheCRUD.
 *
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 *
 * Como métodos de CocheCRUD podemos poner:
 * save()
 * findAll()
 * delete() que simplemente impriman por consola el nombre del propio método.
 *
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 *
 * Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()
 */
package es.Ejercicios.Ejercicio5;


public class CocheCRUDMain {
    public static void main(String[] args) {
        CocheCRUDImpl car = new CocheCRUDImpl();

        car.save();
        car.findAll();
        car.delete();
    }
}
