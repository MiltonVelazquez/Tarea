package Supermercado;

class Humane {
    private String nombre;
    private String apellido;
    private int dni;

    public Humane(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String toString() {
        return this.nombre + " " + this.apellido + " DNI: " + this.dni;
    }

}
