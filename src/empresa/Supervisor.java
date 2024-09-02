package empresa;

public class Supervisor extends Empleado implements Jefe{
    String sector;
    int perCargo;

    Supervisor(String nombre, String apellido, int dni, double sueldo, double cantHoras, String sector, int perCargo){
        super(nombre, apellido, dni, cantHoras, sueldo);
        this.sector = sector;
        this.perCargo = perCargo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getPerCargo() {
        return perCargo;
    }

    public void setPerCargo(int perCargo) {
        this.perCargo = perCargo;
    }

    public double calcularSueldo(){
        double total = sueldo * cantHoras;
        return total;
    }

    
}
