package empresa;

abstract class Persona {
    String nombre;
    String apellido;
    int dni;

    Persona(String nombre, String apellido, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getDni(){
        return dni;
    }
}
