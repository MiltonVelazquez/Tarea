package empresa;

class Seguridad extends Persona{
    String sector;

    Seguridad(String nombre, String apellido, int dni, String sector){
        super(nombre, apellido, dni);
        this.sector = sector;
    }

    public void setSector(String sector){
        this.sector = sector;
    }

    public String getSector(){
        return sector;
    }
}
