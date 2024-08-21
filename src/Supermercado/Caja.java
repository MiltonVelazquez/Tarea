package Supermercado;

public class Caja {
    private Empleado empleado;
    private int nroCaja;

    Caja(Empleado empleado, int nroCaja){
        this.empleado = empleado;
        this.nroCaja = nroCaja;
    }


    public String toString() {
        return this.empleado.toString() + "\nNro de caja: " + this.nroCaja;
    }
}
