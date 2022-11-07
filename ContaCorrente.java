public class ContaCorrente extends Conta {
    
    private double saldo;

    public void ajuste(double tarifa){
        this.saldo += this.saldo+(tarifa*2);
    }
    public void deposito(double quantia) {
        this.saldo += quantia - 0.10;
    }
}

