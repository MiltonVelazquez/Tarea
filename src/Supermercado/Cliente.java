package Supermercado;

class Cliente extends Humane {

    private boolean mayorista;

    public Cliente(String nombre, String apellido, int dni, boolean mayorista) {
        super(nombre, apellido, dni);
        this.mayorista = mayorista;
    }

    public boolean getMayorista(){
        return mayorista;
    }

    public String toString() {
        return super.toString();
    }

}