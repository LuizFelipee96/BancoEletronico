public class Banco {
    public static void main(String[] args){

        Conta c = new Conta();
        ContaPoupanca cp = new ContaPoupanca();
        ContaCorrente cc = new ContaCorrente();
        c.deposito(1000);
        cp.deposito(1000);
        cc.deposito(1000);
        c.ajuste(1);
        cc.ajuste(1);
        cp.ajuste(1);
        System.out.println(c.getSaldo());
        System.out.println(cp.getSaldo());
        System.out.println(cc.getSaldo());

    }
}
