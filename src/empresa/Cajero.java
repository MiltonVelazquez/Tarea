package empresa;

public class Cajero extends Empleado implements Jefe{
    int nroCaja;

    Cajero(String nombre, String apellido, int dni, double cantHoras, double sueldo, int nroCaja){
        super(nombre, apellido, dni, cantHoras, sueldo);
        this.nroCaja = nroCaja;
    }

    public void setNroCaja(int nroCaja){
        this.nroCaja = nroCaja;
    }

    public int getNroCaja(){
        return nroCaja;
    }

    public double calcularSueldo(){
        double total = sueldo * cantHoras;
        return total;
    }
}
