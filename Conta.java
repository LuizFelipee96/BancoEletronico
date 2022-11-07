public class Conta{
    private double saldo;

public void deposito(double quantia){
    this.saldo += quantia;
}

public void saque(double quantia){
    this.saldo -= quantia;
}

public double getSaldo(){
    return this.saldo;
}

public void ajuste(double tarifa){
    this.saldo += this.saldo*tarifa;
}
}