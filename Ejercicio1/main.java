public class main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("3102962543","Wilmer Astudillo", 1000000);

        cuenta.cosultarSaldo();

        cuenta.depositar(1000000);
        cuenta.cosultarSaldo();

        cuenta.retirar(2000000);
        cuenta.cosultarSaldo();

    }
}
