package empresa;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Cliente cli = new Cliente("Milton", "Velazquez", 45131603, true, 4458);
        Seguridad segu = new Seguridad("Leonardo", "Da Vinci", 15748641, "Cajas");
        Supervisor sup = new Supervisor("Michael", "Jackson", 5783185, 3400, 13, "Bodega", 4);
        Cajero caj = new Cajero("Peter", "Parker", 8752167, 8, 1900, 1);
        
        Cliente cli1 = new Cliente("Jim", "Raynor", 48431515, false, 7831);
        Supervisor sup1 = new Supervisor("Tychus", "Findlay", 54108545, 3100, 8, "Cajas", 5);
        Seguridad segu1 = new Seguridad("Sherlock", "Holmes", 12675911, "Carniceria");
        Cajero caj1 = new Cajero("Franco", "Mitoire", 45921367, 6, 1100, 2);
        
        ArrayList<Cajero> cajeros = new ArrayList<Cajero>();
        cajeros.add(caj);
        cajeros.add(caj1);

        ArrayList<Supervisor> supervisores = new ArrayList<Supervisor>();
        supervisores.add(sup);
        supervisores.add(sup1);

        Supervisor sup_gerente = new Supervisor("Agustina", "Vega", 11348910, 5700, 8, "Total", 9);
        Sucursal sucursal = new Sucursal(cajeros, supervisores, sup_gerente);
        Informes informes = new Informes();

        informes.verSueldoCajero(caj1);
        informes.verSueldoSupervisor(sup_gerente);



    }
}
