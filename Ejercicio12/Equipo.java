package es.Ejercicios.Ejercicio12;

public class Equipo {
    int id;
    String nombre;
    String equipacion;
    String pabellon;
    String capacidad;
    String direccion;
    String ciudad;
    String fundacion;

    public Equipo(){};
    public Equipo(int id, String nombre, String equipacion, String pabellon, String capacidad, String direccion, String ciudad, String fundacion){
        this.id = id;
        this.nombre = nombre;
        this.equipacion = equipacion;
        this.pabellon = pabellon;
        this.capacidad = capacidad;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String equipo) {
        this.nombre = nombre;
    }

    public String getEquipacion() {
        return equipacion;
    }

    public void setEquipacion(String equipacion) {
        this.equipacion = equipacion;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return '\n'+"Nombre: "+nombre+ '\n' +
                "Equipacion: "+ equipacion + '\n' +
                "Pabellón: " + pabellon + '\n' +
                "Capacidad:  " + capacidad + "espectadores" + '\n'+
                "Direccion: " + direccion + '\n' +
                "Ciudad: '" + ciudad + '\n' +
                "Año de fundación: " + fundacion +'\n' +
                "----------------------------------------"
                ;
    }
}
