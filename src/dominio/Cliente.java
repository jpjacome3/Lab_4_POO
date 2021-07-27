
package dominio;

import java.util.ArrayList;


public class Cliente {
    private String nombres;
    private String cedula;
    private ArrayList<Cuenta> cuentas;
    private Cuenta cn;

    public Cliente(String nombres, String cedula) {
        cuentas = new ArrayList<>();
        cn = new Cuenta();
        this.nombres = nombres;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void consultarSaldo() {
        System.out.println("El usuario: " + this.nombres);
        System.out.println("Tiene como saldo en las siguientes cuentas: ");
        for (Cuenta cn : cuentas) {
            System.out.println(cn);
        }
    }

    public void agregarC(Cuenta cuentas1) {
        
        cuentas.add(cuentas1);
        cuentas1.setCliente(this);
    }
}
