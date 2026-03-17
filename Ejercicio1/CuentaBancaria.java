public class CuentaBancaria{

    private String Numero_Cuenta;
    private String Titular;
    private double Saldo;

    public CuentaBancaria (String   Numero_Cuenta, String Titular, double Saldo){
        this.Numero_Cuenta = Numero_Cuenta;
        this.Titular = Titular;
        this.Saldo = Saldo; 
    }

    public void depositar (double cantidad){
        this.Saldo+= cantidad;
        System.out.println("SU DEPOSITO ES DE" + cantidad);
    }

    public void retirar (double cantidad){
        if (cantidad <= Saldo){
            Saldo-= cantidad;
            System.out.println("SU RETIRO ES DE: " + cantidad);
        }else{
            System.out.println("SALDO INSUFICIENTE PARA EL RETIRO.");
        }
    }    
    public void cosultarSaldo(){
        System.out.println("SU SALDO ACTUAL ES DE: " + Saldo);
    }

}