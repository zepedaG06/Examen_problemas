package Problema_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("001-123-321", "Elelias", "Matus");
        Cuenta cuenta = new Cuenta("555", 2000, cliente);

        int opcion;
        do
        {
            System.out.println("SISTEMA CUENTA BANCARIA");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retiro");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Su saldo actual: C$" + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese monto a depositar: C$");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Ingrese monto a retiro: C$");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("saliendo, no vuelva porfavor");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");


            }
        } while(opcion!=4);
        sc.close();
    }
}
