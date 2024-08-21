package Supermercado;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Cliente cli = new Cliente("Milton", "Velazquez", 45131603, true);
        Empleado e = new Empleado("William", "Wallace", 1578151, 2500);
        Caja ca = new Caja(e, 1);
        ArrayList<Producto> p = new ArrayList<Producto>();
        Producto papas = new Producto(1000,5,"Papas");
        Producto alfajor = new Producto(700, 4, "Alfajor");
        Producto cebolla = new Producto(1900, 2, "Cebolla");
        p.add(papas);
        p.add(alfajor);
        //p.add(cebolla);
        System.out.println();
        Factura f = new Factura(cli, ca, p);
        //System.out.println(f.totalPago());
        f.mostrarCompra();
    }
}
