package ATT04;

public class Cliente {
    private String nome;
    private double saldo, limite;

    public Cliente(String N, double S, double L){
        this.nome = N;
        this.saldo = S;
        this.limite = L;
    }
    public String getNome(){
        return nome;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getLimite(){
        return limite;
    }

    @Override
    public String toString(){
        System.out.println("Nome: " + getNome());
    }
}
