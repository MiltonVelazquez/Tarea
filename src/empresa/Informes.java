package empresa;

public class Informes{
    public void verSueldoCajero(Cajero caj){
        System.out.println("El sueldo del cajero "+ caj.getNombre() + " " + caj.getApellido() + " es: " + caj.calcularSueldo());
    }

    public void verSueldoSupervisor(Supervisor sup){
        System.out.println("El sueldo del supervisor "+ sup.getNombre() + " " + sup.getApellido() + " es: " + sup.calcularSueldo());
    }
}
