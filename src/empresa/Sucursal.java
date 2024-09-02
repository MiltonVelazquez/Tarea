package empresa;

import java.util.ArrayList;

public class Sucursal {
    ArrayList<Cajero> caj;
    ArrayList<Supervisor> sup;
    Supervisor sup_gerente;

    Sucursal(ArrayList<Cajero> caj, ArrayList<Supervisor> sup, Supervisor sup_gerente){
        this.caj = caj;
        this.sup = sup;
        this.sup_gerente = sup_gerente;
    }

    public Supervisor getSup_Gerente(){
        return sup_gerente;
    }

    public ArrayList<Cajero> getCaj() {
        return caj;
    }

    public void setCaj(ArrayList<Cajero> caj) {
        this.caj = caj;
    }

    public ArrayList<Supervisor> getSup() {
        return sup;
    }

    public void setSup(ArrayList<Supervisor> sup) {
        this.sup = sup;
    }

    public Supervisor getSup_gerente() {
        return sup_gerente;
    }

    public void setSup_gerente(Supervisor sup_gerente) {
        this.sup_gerente = sup_gerente;
    }

    
}
