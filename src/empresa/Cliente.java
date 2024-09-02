package empresa;

class Cliente extends Persona{
    boolean mayorista;
    int nroSocio;

    Cliente(String nombre, String apellido, int dni, boolean mayorista, int nroSocio){
        super(nombre, apellido, dni);
        this.mayorista = mayorista;
        this.nroSocio = nroSocio;
    }

    public void setMayorista(boolean mayorista){
        this.mayorista = mayorista;
    }

    public boolean getMayorista(){
        return mayorista;
    }

    public void setNroSocio(int nroSocio){
        this.nroSocio = nroSocio;
    }

    public int getNroSocio(){
        return nroSocio;
    }
}
