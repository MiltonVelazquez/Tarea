package Supermercado;

import java.util.ArrayList;
public class Factura {
    Cliente cli;
    Caja ca;
    ArrayList<Producto> p;

    Factura(Cliente cli, Caja ca, ArrayList<Producto> p){
        this.cli = cli;
        this.ca = ca;
        this.p = p;
    }

    public double totalPago(){
        double acum = 0;
        for(Producto p : p){
            acum += p.getPrecio();
        }
        double total = 0;
        if (cli.getMayorista() == true){
            total = acum-(acum*0.1);
        } else{
            total = acum;
        }
        return total;
    }

    public void mostrarCompra(){
        System.out.println("El cliente: " + cli.toString());
        System.out.println("Atendido por: " + ca.toString());
        System.out.println("Compro: ");
        for(Producto p : p){
            System.out.println(p.getNombre());
        }
        if (cli.getMayorista() == true){
            System.out.println("El cliente esta registrado como mayorista por lo que tiene un 10% de descuento.");
        }
        System.out.println("Su total a pagar es: " + totalPago());
    }
}
