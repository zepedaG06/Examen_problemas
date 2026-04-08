package Problema_2;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Cliente titular;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void depositar(double monto){
        if (monto > 0){
            this.saldo += monto;
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Error, debe ser mayor a 0");
        }

    }

    public double retirar(double monto)
    {
        if (monto > 0 && monto <= this.saldo){
            this.saldo -= monto;
            System.out.println("Retiro realizado");
            return monto;
        }
        else if (monto > this.saldo){
            System.out.println("Error, no se permite saldo negativo");
            return 0;
        }
        else
        {
            System.out.println("ERROR, algo invalido");
            return 0;
        }
    }

    public String mostrarDatos(){
        return "Cuenta: " + numeroCuenta + "Titular: " + titular.getNombre() + titular.getApellido() + "Saldo: " + saldo;
    }
}
