public class ContaPoupanca extends Conta {

    private double saldo;

    public void ajuste(double tarifa){
        
        this.saldo += this.saldo+(tarifa*3);
    }
}
