package test;

import dominio.Cliente;
import dominio.Cuenta;
import java.util.Scanner;


public class TestClienteCuenta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cliente cl = null;
        Cuenta cuenta = null;
        String cedula, nombre = null;

        double dinero = 0;
        int opcion = 0;
        int aux = 0;

        while (opcion < 10) {

            opcion = 0;
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("|Creacion Cuentas de Banco|");
            System.out.println("1. Crear cuenta\n2.AsignarCuenta\n3.Depositar\n4.Retirar\n5.Consultar Saldo\n6.Salir");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Opcion: ");
            opcion = leer.nextInt();

            leer.nextLine();
            switch (opcion) {
                case 1 -> {
                    leer = new Scanner(System.in);

                        System.out.println("|Creacion de Usuario|");
                        System.out.print("Ingrese su nombre: ");
                        nombre = leer.nextLine();
                        System.out.print("Ingrese su Cedula: ");
                        cedula = leer.nextLine();
                        cl = new Cliente(nombre, cedula);
                    }

                case 2 -> {
                    if (nombre == null) {
                        System.out.println("|Crear un usuario primero|");
                    } else {
                        dinero = 0;
                        aux = 0;
                        System.out.println("1.Cuenta de Ahorros\n2.Cuenta Corriente\n");
                        System.out.print("Ingrese la opcion que desea: ");
                        while (aux < 1 || aux > 3) {
                            aux = leer.nextInt();
                        }
                        System.out.println("Saldo inicial es 0");

                        cuenta = new Cuenta(dinero);
                        cuenta.mostrarC(aux);
                        cl.agregarC(cuenta);
                    }
                }
                case 3 -> {
                    if (nombre == null || aux == 0) {
                        System.out.println("|Crear un usuario primero|");
                    } else {
                        dinero = 0;
                        System.out.println("Valor que desea depositar: ");
                        while (dinero <= 0) {
                            dinero = leer.nextDouble();
                        }
                        cuenta.depositar(dinero);
                        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldoCuenta()+" Dolares");
                    }
                }
                case 4 -> {
                    if (nombre == null ||aux == 0) {
                        System.out.println("|Crear un usuario primero|");
                    } else {
                        dinero = 0;
                        System.out.println("Valor que desea retirar: ");
                        while (dinero <= 0) {
                            dinero = leer.nextDouble();
                        }
                        if (dinero <= cuenta.getSaldoCuenta()) {
                            cuenta.retirar(dinero);
                            System.out.println("El saldo de la cuenta es: " + cuenta.getSaldoCuenta()+" Dolares");
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                    }
                }
                case 5 -> {
                    if (nombre == null || aux == 0) {
                      
                        System.out.println("|No existe una cuenta|");
                    } else {
                        
                        System.out.println("|Valor en la Cuenta|");
                        cl.consultarSaldo();
                    }
                }
                case 6 -> {
                    opcion=10;
                }
            }
        }
    }

}
