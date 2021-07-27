
package dominio;

public class Cuenta {

    private int nroCuenta;
    private String tipo = null;
    private double saldoCuenta;
    private Cliente cliente;
    private static int contador;


    public Cuenta() {
        this.nroCuenta = Cuenta.contador++;
    }

    public Cuenta(double saldoCuenta) {
        this();
        this.saldoCuenta = saldoCuenta;
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
     public void depositar(double cantidad) {
        this.saldoCuenta = this.saldoCuenta + cantidad;
    }

    public void retirar(double cantidad) {
        this.saldoCuenta = this.saldoCuenta - cantidad;
    }

    public void mostrarC(int i) {
        switch (i) {
            case 1 -> {
                tipo = "CAhorros";
                System.out.println("Numero de Cuenta: " + this.nroCuenta + " de " + tipo);
            }
            case 2 -> {
                tipo = "CCorriente";
                System.out.println("\"Numero de Cuenta: " + this.nroCuenta + " de " + tipo);
            }
        }
    }


}
