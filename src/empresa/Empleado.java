package empresa;

abstract class Empleado extends Persona{
    double cantHoras;
    double sueldo;

    Empleado(String nombre, String apellido, int dni, double cantHoras, double sueldo){
        super(nombre, apellido, dni);
        this.cantHoras = cantHoras;
        this.sueldo = sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public void setCantHoras(double cantHoras){
        this.cantHoras = cantHoras;
    }

    public double getCantHoras(){
        return cantHoras;
    }

    public double getSueldo(){
        return sueldo;
    }
}
