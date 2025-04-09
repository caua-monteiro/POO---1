package ATT01;

import java.lang.foreign.ValueLayout;

public class Produto {
    private String nome;
    private double preco, promocao;

    public Produto(String N, double P){
        this.nome = N;
        this.preco = P;
        promocao = 0;
    }

    public void setPromocao(double valorPromocao){
        this.promocao = valorPromocao;
    }
    public double getPromocao(){
        return promocao;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public boolean ehCaro(){
        return preco > 80;
    }
    public boolean ehCaro(double promocao){
        return (preco-promocao) > 80;
    }

    public void exibeProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("R$: " + preco);
        System.out.println("Eh Caro? " + ehCaro());
    }
    public void exibeProduto(double promocao){
        System.out.println("Nome: " + nome);
        System.out.println("R$: " + (preco - promocao));
        System.out.println("Eh Caro? " + ehCaro(promocao));
    }
}