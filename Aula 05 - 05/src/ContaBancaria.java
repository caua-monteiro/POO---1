public abstract class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String N){
        this.nome = N;
    }

    public abstract void retira(double V);

    public void deposita(double V){
        this.saldo += V;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double V){
        this.saldo = V;
    }

}
