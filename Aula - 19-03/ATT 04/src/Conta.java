public class Conta {
    private double saldo;
    public Conta (double saldoInicial) {
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
        else
            saldo = 0.0;
    }
    public double getSaldo() {
        return saldo;
    }
    public void creditar (double quantia) {
        saldo += quantia;
    }

    public void debitar (double quantia){
        if(saldo >= quantia)
            saldo -= quantia;
        else
            saldo = 0.0;
            System.out.println("Gasto maior que saldo da conta. Saldo defido em: 0.0");
    }
}
