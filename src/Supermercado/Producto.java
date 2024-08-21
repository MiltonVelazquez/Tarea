package Supermercado;

public class Producto {
    double precio;
    int stock;
    String nombre;

    Producto(double precio, int stock, String nombre){
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

    public String getNombre(){
        return nombre;
    }
}
